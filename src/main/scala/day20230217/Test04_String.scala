package day20230217

object Test04_String {
  def main(args: Array[String]): Unit = {
    //（1）字符串，通过+号连接
    val name: String = "huzc"
    val age: Int = 27
    println(age+"岁的"+name+"在家学习")

    // *用于将一个字符串复制多次并拼接
    println(name * 4)
    //（2）printf用法：字符串，通过%传值。
    printf("%d岁的%s在家学习",age,name)
    println()
    //（3）字符串模板（插值字符串）：通过$获取变量值
    println(s"${age}岁的${name}在家学习")

    val num:Double = 2.3456
    println(f"The is num ${num}%2.1f")  //  格式化模板字符串 在${}后面写上格式化规则
    println(raw"The is num ${num}%2.1f")  //  raw 是原模样输出

    // 三引号表示字符串，保持多行字符串的原格式输出
    val sql = s"""
         |select *
         |from
         |  student
         |where
         |  name = ${name}
         |and
         |  age > ${age}
         |""".stripMargin
    println(sql)
  }
}