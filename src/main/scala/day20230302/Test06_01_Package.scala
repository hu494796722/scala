package com{

  import com.zaijia.scala.Inner


  // 在外层包中定义单例对象
  object Outer{
    var out: String = "out"

    def main(args: Array[String]): Unit = {
      println(Inner.in)
    }
  }

  package zaijia{
    package scala{
      // 在内层包定义的单例对象
      object Inner{
        var in: String = "in"

        def main(args: Array[String]): Unit = {
          println(Outer.out)
          Outer.out = "outer"
          println(Outer.out)

        }
      }
    }
  }
}

package aaa{
  package bbb{

    import com.zaijia.scala.Inner

    object Test06_01_Package{
      def main(args: Array[String]): Unit = {
      println(Inner.in)
      }
    }
  }
}
