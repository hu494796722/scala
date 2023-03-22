package chapter02

object Test09_Problem_DataTypeConversion {
  def main(args: Array[String]): Unit = {
    var n: Int = 130
    val b: Byte = n.toByte
    println(b)
  }
}
