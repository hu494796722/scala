package chapter07


object Test04_List {

  def main(args: Array[String]): Unit = {

    // 1. 创建一个不可变的list
    val list1: List[Int] = List(23, 34, 345)
    println(list1)

    // 2.访问元素
    println(list1(2))
//    list1(2) = 121212  error
//    val unit: Unit = list1 += 12  // error  不可变的数据不能使用 +=

    // 3. 添加元素
    val list2: List[Int] = 10 +: list1
    val list3: List[Int] = list1 :+ 23 :+ 23
    println(list1)
    println(list2)
    println(list3)

    println("=4444444=================")

    val list4: List[Int] = list2.::(51)
    println(list4)

    println("55555==================")

    val list5: List[Int] = Nil.::(13)
    println(list5)

    println("==6767676767================")

    val list6: List[Int] = 73 :: 34 :: Nil
    val list7: List[Int] =  222 :: list5
    println(list6)
    println(list7)

    println("============88888888888======")

    // 4. 合并列表
    val list8: List[Any] = list6 :: list7
    println(list8)

    val list9: List[Int] = list6 ::: list7
    println(list9)

    val list10: List[Int] = list6 ++ list7
    println(list10)




  }
}
