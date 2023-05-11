package chapter07

import scala.collection.mutable


object Test07_MutableSet {

  def main(args: Array[String]): Unit = {

    // 1. 创建可变的Set 要加 前缀
    val set1: mutable.Set[Int] = mutable.Set(13, 23, 53, 12, 13, 23, 78)
    println(set1)

    println("==================================")

    // 2. 添加元素
    val set2: mutable.Set[Int] = set1 + 11
    println(set1)
    println(set2)

    set1 += 11
    println(set1)

    val flag1: Boolean = set1.add(10)
    println(flag1)
    println(set1)

    val flag2: Boolean = set1.add(10)
    println(flag2)
    println(set1)

    println("=====================")

    // 3. 删除元素
    set1 -= 11
    println(set1)

    val flag3: Boolean = set1.remove(10)
    println(flag3)
    println(set1)


    // 4. 合并两个Set
    val set3 = mutable.Set(13,12,13,27,98,29)
    println(set1)
    println(set3)

    println("==================")

    // ++ 不成功的，需要有返回值 set4 4才会合并成功
    val set4: mutable.Set[Int] = set1 ++ set3
    println(set1)
    println(set3)
    println(set4)

    println("==================")

    set3 ++= set1
    println(set1)
    println(set3)



  }
}
