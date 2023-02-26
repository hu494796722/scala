package day20230226

object Test05_09_ClosureAndCurrying {
  def main(args: Array[String]): Unit = {
    def add(a: Int, b: Int): Int = {
      a + b
    }

    // 1. 考虑固定一个加数的场景
    def addByFour(b: Int): Int = {
      4 + b
    }

    // 2. 扩展固定加数改变的情况
    def addByFive(b: Int): Int = {
      5 + b
    }

    // 3. 将固定加数作为另一个参数传入，但是是作为”第一层参数“传入
    def addBy(): Int=>Int ={
      val a = 4
      def addB(b: Int): Int = a + b
      addB
    }

     def addByA(a: Int): Int=>Int = {
       def addB(b: Int): Int = {
       println("a: "+ a)
       println("b: "+ b)
         a + b
       }
       addB
     }

    println(addByA(1)(2))


    val a = addByA(3)
    println(a(4))



    // 4. lambda表达式简写
    def addByA1(a: Int): Int=>Int = {
      (b: Int) => {
        println("a: " + a)
        println("b: " + b)
        a + b
      }
    }

    def addByA2(a: Int): Int=>Int = {
      b => a + b
    }

    def addByA3(a: Int): Int=>Int = a + _


    // 5. 柯里化
    def addCurrying(a: Int)(b: Int): Int = a + b

    println(addCurrying(1)(2))

  }
}
