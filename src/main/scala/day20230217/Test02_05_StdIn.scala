package day20230217

import scala.io.StdIn

object Test02_05_StdIn {
  def main(args: Array[String]): Unit = {
    // 输入信息
    println("请输出您的姓名：")
    val name: String = StdIn.readLine()
    println("请输出您的年龄：")
    val age: Int = StdIn.readInt()

    // 控制台输出
    println(s"欢迎${age}岁的${name}在家学习")
  }
}
