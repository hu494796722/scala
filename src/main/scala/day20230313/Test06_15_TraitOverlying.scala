package day20230313

object Test06_15_TraitOverlying {
  def main(args: Array[String]): Unit = {
    val student1 = new Student15
    student1.increase()

    // 钻石问题特征叠加
    val myFootBall = new MyFootBall
    println(myFootBall.describe())
  }
}


// 定义球类特征
trait Ball{
  def describe(): String = "ball"
}

// 定义一个颜色特征
trait ColorBall extends Ball{
  var color: String = "red"
  override def describe(): String = color + "=======__" + super.describe()
}

// 定义一个种类特征
trait CategoryBall extends Ball{
  var category: String = "fool"
  override def describe(): String = category + "=======++" + super.describe()
}

class MyFootBall extends CategoryBall with ColorBall{
  override def describe(): String = "my ball is a " + super[CategoryBall].describe()
}









trait Knowledge15 {
  var amount: Int = 0
  def increase(): Unit = {
    println("knowledge increased")
  }
}

trait Talent15 {
  def singing(): Unit
  def dancing(): Unit
  def increase(): Unit = {
    println("talent increased")
  }
}

class Student15 extends Person13 with Talent15 with Knowledge15 {
  override def dancing(): Unit = println("dancing")

  override def singing(): Unit = println("singing")

  override def increase(): Unit = {
    super[Person13].increase()
    println("Student15 increased")
  }
}