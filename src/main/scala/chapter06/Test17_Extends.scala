package chapter06

object Test17_Extends {

  def main(args: Array[String]): Unit = {

    // 1.类型的检测和转换
    val student: Student17 = new Student17("alllll", 18)
//    student.study()
//    student.sayHi()
    val person: Person17 = new Student17("perser", 19)
//    person.sayHi()

    println(student.isInstanceOf[Student17])
    println(student.isInstanceOf[Person17])
    println(person.isInstanceOf[Student17])
    println(person.isInstanceOf[Person17])

println("==============================================")

    val person2: Person17 = new Person17("cary", 35)
    println(person2.isInstanceOf[Person17])
    println(person2.isInstanceOf[Student17])

    println("###################################################")
    // 类型转换
    if (person.isInstanceOf[Student17]){
      val student1: Student17 = person.asInstanceOf[Student17]
      student1.study()
    }
    println(classOf[Student17])



    println(WorkDau.MONDAY)
    println(WorkDau.talksjd)
  }
}





class Person17(val name: String, val age: Int) {
  def sayHi(): Unit = {
    println("hi from person " + name)
  }
}



class Student17(name: String, age: Int) extends Person17(name, age){
  override def sayHi(): Unit = {
    println("hi from student " + name)
  }
  def study(): Unit = {
    println("student study")
  }
}

// 定义枚举类对象
object WorkDau extends Enumeration {
  val MONDAY = Value(1,"hu")
  val TUESDAY = Value(2,"zc")
  val talksjd = Value("String")
}


// 定义应用类对象
object TestApp extends  App {
  println( "app start")

  type MyString = String
  val a: MyString = "asdfasdf"
  println(a)
}
