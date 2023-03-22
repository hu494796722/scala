package chapter06

object Test06_07_Inherit {
  def main(args: Array[String]): Unit = {
    val student1: Student7 = new Student7("alice", 18)
    val student2 = new Student7("bob", 20, "std001")

//    println(student1.age,student1.name)
//    println("=================================")
//    println(student2.age,student2.name,student2.stdNo)
//    走的： "2. 父类的辅助构造器调用" 对name 和 age 赋值，这个时候就涉及到了 Person7(name, age) 必须带参数

    student1.printInfo()
    student2.printInfo()
//    走的 都是子类的 方法直接赋值。

    println("=========================")

    val teacher = new Teacher
    teacher.printInfo()

    println("=========================")

    // 多态：    这里是实现了方法的 动态绑定
    def personInfo(person: Person7): Unit = {    // 父类类型来接收
      person.printInfo()
    }

    val person = new Person7


    // 形参那个子类， 就调用那个子类的方法
    personInfo(student1)
    personInfo(teacher)
    personInfo(person)

    // 多态：    这里是实现了方法的 动态绑定

  }
}

// 定义一个父类
class Person7(){
  var name: String = _
  var age: Int = _

  println("1. 父类的主构造器调用")

  def this(name: String, age: Int){
    this()
    println("2. 父类的辅助构造器调用")
    this.name = name
    this.age = age
  }

  def printInfo(): Unit = {
    println(s"Person: $name $age")
  }
}

// 定义子类
class Student7(name: String, age: Int) extends Person7(name, age){
  var stdNo: String = _

  println("3. 子类的主构造器调用")

  def this(name: String, age: Int, stdNo: String){
    this(name, age)
    println("4. 子类的辅助构造器调用")
    this.stdNo = stdNo
  }

  override def printInfo(): Unit = {
    println(s"Student: $name $age $stdNo")
  }


}

class Teacher extends Person7 {
  override def printInfo(): Unit = {
      println(s"Teacher")
  }
}
