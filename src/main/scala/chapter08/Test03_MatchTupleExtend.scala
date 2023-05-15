package chapter08

object Test03_MatchTupleExtend {
  def main(args: Array[String]): Unit = {
    // 1. 在变量声明时匹配
    val (x,y) = (10,"hello")
    println(s"x: $x , y: $y")

    val List(f,s,_*): List[Int] = List(23, 15, 9, 78)
    println(s"f: $f , s: $s")

    println("=====================")

    // 2. for推导式中进行模式匹配
    val list: List[(String, Int)] = List(("a", 12), ("b", 35), ("c", 27), ("a", 13))

    // 2.1 原本的遍历方式
    for(elem <- list) {
      println(elem._1 + " , " + elem._2)
    }

    // 2.2 将List的元素直接定义为元组，对变量赋值
    for ((a,b) <- list){
      println(a + " - " + b)
    }

    println("-----------------------")
    // 2.3 可以不考虑某个位置的变量，只遍历key或者value
    for((_ , b) <- list){
      println(b)
    }

    println("-----------------------")

    // 2.4 可以指定某个位置的值必须是多少
    for (("a",count) <- list){
      println(count)
    }

  }
}
