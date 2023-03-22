package chapter05

import scala.annotation.tailrec

object Test10_Recursion {
  def main(args: Array[String]): Unit = {

  }

  // 递归实现计算阶乘
  def fact(n: Int): Int = {
    if (n == 0) return 1
    fact(n - 1) * n
  }

  // 尾递归实现  一切源头是为了实现： n!
  def tailFact(n: Int): Int = {
    @tailrec // 检测注解
    def loop(n: Int, currRes: Int): Int = {
      if (n == 0) return currRes
      loop(n - 1, currRes * n)
    }

    loop(n, 1)
  }
}
