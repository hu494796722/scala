package day20230226

object Test05_13_Lazy {
  def main(args: Array[String]): Unit = {
    lazy val result: Int = sum(12,14)
    println("1. 函数调用")
    println("2. result = "+ result)
    println("4. result = "+ result)
  }

  def sum(a: Int, b: Int): Int = {
    println("3. sum调用")
    a + b
  }

}
