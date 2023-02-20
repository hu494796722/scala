package day20230217

object Test02_02_Variavle {
  def main(args: Array[String]): Unit = {
    //声明一个变量的通用语法
    var a: Int = 10

    //（1） 声明变量时，类型可以省略、编译器自动推导，即类型推导
    var a1 = 10
    val b1 = 23
    println(a1)
    println(b1)
    //(2)  类型确定后，就不能修改类型，说明Scala是强数据类型语言。
    var a2 = 15 // a2 类型为Int
    //      a2  = "hello"  // 不可以赋不同类型的值

    //(3) 变量声明是，必须要有初始值
    //       a3: Int             //没有初始值就不行。

    //(4) 在声明/定义一个变量时，可以使用var或者val来修饰,var修饰的变量可改变，val修饰的变量不可改。
    a1 = 12
    //       b1 = 15   // 不可以修改值，因为上面b1是 val
    //       println(a1+"     "+b1)

    var alice = new Student("alice", 20) // var 所以对象可以修改。
    alice = new Student("alice", 20)
    alice = null
    val bbbb = new Student("BBBBBB", 22)
    //       bbbb.name = "asdfa"  //case 类中 name 没有var修饰所以不能改
    bbbb.age = 222
    bbbb.printInfo()
    //       bbbb = new Student("asdfasdfasdf",55655)
  }
}