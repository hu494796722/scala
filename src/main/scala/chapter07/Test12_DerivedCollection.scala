package chapter07

object Test12_DerivedCollection {
  def main(args: Array[String]): Unit = {
    val list1 = List(1,3,5,7,2,89)
    val list2 = List(3,7,2,45,4,8,19)


    //    （1）获取集合的头
    println(list1.head)

    //    （2）获取集合的尾（不是头的就是尾）
    println(list1.tail)

    //    （3）集合最后一个数据
    println(list2.last)

    //    （4）集合初始数据（不包含最后一个）
    println(list2.init)

    //    （5）反转
    println(list1.reverse)

    //    （6）取前（后）n个元素
    println(list1.take(2))
    println(list1.takeRight(2))


    println(list1.takeWhile( _ < 5))  // 从左到右，不满足条件就停止，后面有满足的也不运行了。
    //    （7）去掉前（后）n个元素
    println(list1.drop(3))
    println(list1.dropRight(3))

    println("=========================")
    //    （8）并集
    val union: List[Int] = list1.union(list2)
    println("union: " + union)
    println(list1 ::: list2)

    // 如果是set做并集，会去重
    val set1 = Set(1,3,5,7,2,89)
    val set2 = Set(3,7,2,45,4,8,19)

    val union2: Set[Int] = set1.union(set2)
    println("union2: " + union2)
    println(set1 ++ set2)

    println("-----------------------")
    //    （9）交集:只留下一样的
    val intersect: List[Int] = list1.intersect(list2)
    println("intersect:" + intersect)


    println("-----------------------")
    //    （10）差集:留下不一样的。谁在前就留下谁的。
    val diff1: List[Int] = list1.diff(list2)
    val diff2: List[Int] = list2.diff(list1)
    println("diff1 : " + diff1)
    println("diff2 : " + diff2)

    //    （11）拉链
    println("zip: " + list1.zip(list2))
    println("zip: " + list2.zip(list1))

    println("zipAll: " + list1.zipAll(list2,"A",20))
    println("zipAll: " + list2.zipAll(list1,"A",20))

    println("zipWithIndex: " + list1.zipWithIndex)
    println("zipStream: " + list1.zip(Stream from 10))

    println("unzip: " + list1.zip(list2).unzip)

    println("-----------------------")
    //    （12）滑窗
    for (i <- list2.sliding(2)) println(i)

    for (i <- list2.sliding(3,2)) println(i)

    println("-----------------------")
    for (elem <- list2.sliding(3, 3)) println(elem)

  }
}
