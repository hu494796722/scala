package day20230302

object Test06_04_Access {
  def main(args: Array[String]): Unit = {
    // 创建对象
    var person: Person = new Person
    // person.idCard  // error  private 为私有权限，只在类的内部和伴生对象中可用。
    // person.name   // error  （3）protected 为受保护权限，Scala 中受保护权限比 Java 中更严格，同类、子类可以访问，同包无法访问。
    println(person.age)
    println(person.sex)

    person.printInfo

    var worker: Worker = new Worker
//    worker = new Worker()
    worker.age = 21
    println(worker.age)
    worker.printInfo

  }
}

// 定义一个子类
class Worker extends Person{
  override def printInfo: Unit = {
    //    println(idCard)     // error   private 为私有权限，只在类的内部和伴生对象中可用。
    name = "bob"         // protected 为受保护权限，Scala 中受保护权限比 Java 中更严格，同类、子类可以访问，同包无法访问。
    age = 25
    sex = "male"

    println(s"Worker: $name $sex $age")
  }
}