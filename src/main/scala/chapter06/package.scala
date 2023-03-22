package object chapter06 {

  //  定义当前包共享的属性和方法
  val commonValue = "在家"
  def commonMethod() = {
    println(s"我胡正超${commonValue}学习")
  }
}
