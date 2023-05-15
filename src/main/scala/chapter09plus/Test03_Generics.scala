package chapter09plus

object Test03_Generics {
  def main(args: Array[String]): Unit = {
    // 1. 协变和逆变
    val child: Parent = new Child
    // 协变
//    val childLIst: Mycollection[Parent] = new Mycollection[Child]
    // 逆变
    val childLIst: Mycollection[SubChild] = new Mycollection[Child]

    // 2. 上下限
    def test[A <: Child](a: A): Unit = {
      println(a.getClass.getName)
    }

    test[Child](new SubChild)

  }
}



// 定义继承关系
class Parent {}
class Child extends Parent {}
class SubChild extends Child {}

// 定义带反省的
class Mycollection[-E] {}