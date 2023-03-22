package chapter06

import scala.beans.BeanProperty


object Test06_03_Class {
  def main(args: Array[String]): Unit = {
    // 创建一个对象
    val student = new Student
    //  student.name  // error, 不能访问因为是 private 属性
    println(student.age)
    println(student.sex)
    student.sex = "南"
    println(student.sex)
  }
}


// 定义一个类
class Student {
  // 定义属性
  private var name: String = "huzc"
  @BeanProperty
  var age: Int = _
  @BeanProperty
  var sex: String = _
}