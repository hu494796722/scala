package day20230217

class Student(name:String,var age: Int) {
   def printInfo():Unit = {
     println(name + " " + age + " " + Student.school)
   }
}

object Student {
  val school:String = "zai jia"

  def main(args: Array[String]): Unit = {
    val alice = new Student("alice",23)
    val huzc= new Student("huzc",27)

    alice.printInfo()
    huzc.printInfo()
  }
}


