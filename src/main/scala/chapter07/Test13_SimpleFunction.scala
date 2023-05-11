package chapter07

object Test13_SimpleFunction {
  def main(args: Array[String]): Unit = {
    val list = List(5,1,8,2,-3,4)
    val list2 = List(("a", 5), ("b", 1), ("c", 8), ("d", 2), ("e", -3), ("f", 4))

    //    （1）求和
    println(list.sum)

    //    （2）求乘积
    println(list.product)

    //    （3）最大值
    println(list.max)
    println(list2.maxBy(_._2))

    //    （4）最小值
    println(list.min)
    println(list2.minBy(_._2))

    println("========================")
    //    （5）排序
    // 5.1 sorted
    println("sorted: " + list.sorted)

    // 从大到小逆序排序
    println("sorted: " + list.sorted.reverse)

    // 传入隐式参数
    println("sorted: " + list.sorted(Ordering[Int].reverse))

    //元组会按照第一个元素来排序
    println("sorted: " + list2.sorted)

    println("========================")

    // 5.2 sortBy
    println("sortBy: " + list2.sortBy(_._2))
    println("sortBy: " + list2.sortBy(_._2)(Ordering[Int].reverse))

    println("========================")

    // 5.3 sortWith
    println("sortWith: " + list.sortWith(_ < _))
    println("sortWith: " + list.sortWith(_ > _))

    println("sortWith: " + list2.sortWith(_._2 < _._2))
    println("sortWith: " + list2.sortWith(_._2 > _._2))
  }
}
