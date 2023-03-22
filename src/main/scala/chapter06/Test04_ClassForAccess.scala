package chapter06

object Test06_04_ClassForAccess{

}

//  定义一个父类
class Person{
  private var idCard: String = "1232134123451234"
  protected var name: String = "huzc"
  var sex: String = "男"
  private [chapter06] var age: Int = 18

  def printInfo = {
    println(s"Person: $idCard $name $sex $age")
  }
}