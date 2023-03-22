package chapter06

object Test06_06_ConstructorParams {
  def main(args: Array[String]): Unit = {
    val student2 = new Student2
    student2.name = "huzc2"
    student2.age = 12
    println(s"student2: name = ${student2.name}, age = ${student2.age}")

    val student3 = new Student3("huzc3", 14)
    println(s"student3: name = ${student3.name}, age = ${student3.age}")

    val student4 = new Student4("huzc4", 15)
//    println(s"student4: name = ${student4.name}, age = ${student4.age}")
    student4.printInfo()

    val student5 = new Student5("huzc5", 15)
//    student5.age = 300
    println(s"student5: name = ${student5.name}, age = ${student5.age}")

    var student6 = new Student6("huzc6", 16)
    var student66 = new Student6("huzc6", 16,"zaijia")
    student6.printInfo()
    student66.printInfo()
  }
}


// 定义类
// 无参构造器
class Student2 {
  // 单独定义属性
  var name: String = _
  var age: Int = _
}

// 上面定义等价于
class Student3(var name: String, var age: Int)

// 主构造器参数无修饰
class Student4(name: String, age: Int){
  def printInfo(): Unit ={
    println(s"student4: name = ${name}, age = $age")
  }
}

//class Student4(_name: String, _age: Int){
//  var name: String = _name
//  var age: Int = _age
//}



class Student5(val name: String, val age: Int)

class Student6(var name: String, var age: Int){
  var school: String = _

  def this(name: String, age: Int, school: String){
    this(name,age)
    this.school = school
  }

  def printInfo() {
    println(s"student6: name = ${name}, age = $age, school = $school")
  }

}