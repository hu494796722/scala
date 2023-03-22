package chapter02

object Test03_ldenttifier {
  def main(args: Array[String]): Unit = {
    //(1) 以字母或者下划线开头,后接字母，数字，下划线
    val hello: String = ""
    var Hello123 = ""
    val _abc = 123
    var `......` = 2134234 //这个属性名称牛皮
    println(`......`)

    //     val h-b = ""
    //     val 123abc   = 123


    //(2) 以操作符开头，且只包含操作符（+ - * / ! 等）
    val -+/% = "hello"
    println(-+/%)



    //(3)用反引号`.......`包含的任意字符串，即使时Scala关键字，（39个）也可以
    /*
      • package, import, class, object, trait, extends, with, type, for
      • private, protected, abstract, sealed, final, implicit, lazy, override
      • try, catch, finally, throw
      • if, else, match, case, do, while, for, return, yield
      • def, val, var
      • this, super
      • new
      • true, false, null
     */


    val `if` = "if"
    println(`if`)
  }

}
