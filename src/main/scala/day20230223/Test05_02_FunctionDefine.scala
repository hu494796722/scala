package day20230223

import scala.swing.event.AdjustingEvent

object Test05_02_FunctionDefine {
  def main(args: Array[String]): Unit = {
    //    （1）函数1：无参，无返回值
    def f1(): Unit = {
      println("1：无参，无返回值")
    }
    f1()
    println(f1())

    println("=========================")

    //    （2）函数2：无参，有返回值
    def f2(): Int = {
      println("2. 无参，有返回值")
      return 12
    }
    println(f2())

    println("=========================")

    //    （3）函数3：有参，无返回值
    def f3(name: String): Unit = {
      println("3：有参，无返回值 " + name)
    }

    println(f3("huzc"))

    println("=========================")

    //    （4）函数4：有参，有返回值
    def f4(name: String): String = {
      println("4：有参，有返回值 " + name)
      return "hi, " + name
    }

    println(f4("huzc"))

    println("=========================")

    //    （5）函数5：多参，无返回值
    def f5(a: Int, b: Int): Unit = {
      println("5：多参，无返回值")
      println(a*b)
    }

    f5(2,4)

    println("=========================")
    //    （6）函数6：多参，有返回值

    def f6(a: Int, b: Int): Int = {
      println("6：多参，有返回值")
      return a + b
    }
    println(f6(3,4))

  }
}
