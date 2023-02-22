package day20230222

// 输出九九乘法表
object Test04_03_Practice_MulTable {

  def main(args: Array[String]): Unit = {
    for (i <- 1 to 9){
      for (j <- 1 to i ) {
        print(s"$j * $i = ${i * j} \t")
      }
      println()
    }
  }

  // 简写
  for (i <- 1 to 9; j <- 1 to i){
    print(s"$j * $i = ${i * j} \t")
    if (i == j) println()
  }

}