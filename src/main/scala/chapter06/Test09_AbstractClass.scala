package chapter06

object Test06_09_AbstractClass {
  def main(args: Array[String]): Unit = {
    val student = new Student9
    student.eat()
    student.sleep()
  }
}

abstract class Person9{
  // 抽象属性
  var age: Int

  // 非抽象属性
  var name: String = "person"

  // 抽象方法
  def sleep(): Unit

  // 非抽象方法
  def eat(): Unit = {
    println("person eat")
  }

}

// 定义具体的实现子类
class Student9 extends Person9{

  //  实现抽象的属性和方法
  override var age: Int = 27

  override def sleep(): Unit = {
    println("student sleep")
  }

  // 重写非抽象属性和方法

  /**
   * 子类对抽象属性进行实现，父类抽象属性可以用 var 修饰；
   * 子类对非抽象属性重写，父类非抽象属性只支持 val 类型，而不支持 var。
   * 因为 var 修饰的为可变变量，子类继承之后就可以直接使用，没有必要重写
   */

//  override var name: String = "student"   //  父类是 val 修饰的 才可以用 override
    name = "student"    //  父类是 var 修饰的  直接修改就可以了。

  override def eat(): Unit = {
    println("student eat")
  }

}
