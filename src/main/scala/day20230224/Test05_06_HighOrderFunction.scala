package day20230224

object Test05_06_HighOrderFunction {
  def main(args: Array[String]): Unit = {
    def f(n: Int): Int = {
      println("f调用")
      n + 1
    }

    def fun(): Int = {
      println("fun调用")
      1
    }


    val result = f(123)
    println(result)

    println("========================")

    // 1. 函数作为值传递
    val f1: Int => Int = f
    val f2 = f _

    println(f1)
    println(f1(1))
    println(f2)
    println(f2(2))

    println("========================")


    val f3:() => Int = fun  // () 写不写都可以
    val f4 = fun _
    println(f3)
    println(f4)

    println("========================")

    // 2. 函数作为参数进行传递
    // 定义二元计算函数
    def dualEval(op: (Int, Int) => Int, a: Int, b: Int): Int = {
      op(a, b)
    }
    def add(a: Int, b: Int): Int = {
      a + b
    }

    println(dualEval(add, 12, 18))
    println(dualEval((a: Int,b: Int) => a + b, 12, 18))
    println(dualEval((a, b) => a + b, 12, 18))
    println(dualEval(_+_, 12, 18))

    println("========================")

    // 3. 函数作为函数的返回值返回
    def f5(): Int=>Unit = {
      def f6(a: Int) {
        println("f6被调用" + a)
      }
      f6  //  将函数直接返回
    }

    val f6 = f5()
    println(f6)
    println(f6(1))
    println("========================")
    println(f5()(4))



  }
}
