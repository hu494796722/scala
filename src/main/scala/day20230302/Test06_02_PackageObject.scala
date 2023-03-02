package day20230302

object Test06_02_PackageObject {
  def main(args: Array[String]): Unit = {
    commonMethod()
    println(commonValue)
  }

}


package ccc{
  package ddd{
    object Test06_02_PackageObject{
      def main(args: Array[String]): Unit = {
        commonMethod()
        println(commonValue)
        println(school)
      }
    }
  }
}

package object ccc{
  val school: String = "zaijiajiajiajaijia"
}


//package object ddd {
//  val school: String = "zaijiajiajiajaijia"
//}       //  error 因为不在同一层级（作用域）中
// 如采用嵌套方式管理包，则包对象可与包定义在同一文件中，但是要保证包对象与包声明在同一作用域中。