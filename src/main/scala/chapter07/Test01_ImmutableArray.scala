package chapter07

object Test01_ImmutableArray {

  def main(args: Array[String]): Unit = {
    // 1. 创建数组   : 不可变数组   不可变指的是对象
    val arr: Array[Int] = new Array[Int](5)
    // 另一种创建方式
    val arr2: Array[Int] = Array(12, 13, 14, 15, 16)
     println(arr)

    // 2. 访问元素
    println(arr(0))
    println(arr(2))
    println(arr(4))
//    println(arr(5))

    arr(0) = 12
    arr(4) = 56
    println(arr(0))
    println(arr(2))
    println(arr(4))

    println("========================")

    // 3. 数组的遍历
    // 1). 普通for循环
    for(i <- 0 until arr.length) println(arr(i))

    // def indices: Range = 0 until length
    for (i <- arr.indices) println(arr(i))

    println("-------------------------------------")

    // 2). 直接遍历所有的元素，增强for循环
    for (i <- arr2) println(i)

    // 3). 迭代器
    val iterator: Iterator[Int] = arr2.iterator

    while (iterator.hasNext)
      println(iterator.next())

    println("-------------------------------------")

    // 4) 调用foreach方法
    arr2.foreach(i => println(i) )

    arr2.foreach(println)

    println(arr2.mkString("--"))

    println("#################################################")

    // 5). 添加元素
    val newArr: Array[Int] = arr2.:+(74)
    println(arr2.mkString("--"))
    println(newArr.mkString("--"))

    // 往前加
    val newArr2: Array[Int] = newArr.+:(111111111)
    println(newArr2.mkString("--"))

    // 往后加
     val newArr3 = newArr2 :+ 15
    println(newArr3.mkString("+++++++++++++++"))

    // 往后前加结合
    val newArr4 = 66 +: newArr3 :+ 12 :+ 15
    println(newArr4.mkString(", "))

    println("==================================================")

    // 根据下标更改
    newArr4.update(0, 77)
    println(newArr4.mkString(", "))
    println(newArr4)

    println("-------------------------------------")






  }
}
