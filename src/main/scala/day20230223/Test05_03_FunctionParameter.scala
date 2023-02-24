package day20230223

object Test05_03_FunctionParameter {
  def main(args: Array[String]): Unit = {
    //    （1）可变参数
    def f1(str: String*): Unit = {
      println(str)
    }

    f1("alice")
    f1("huzc","aaa","bbb")

    //    （2）如果参数列表中存在多个参数，那么可变参数一般放置在最后
    def f2(str1: String, str2: String*) : Unit = {
      println("str1: " + str1 + " str2: " + str2)
    }

    f2("alice")
    f2("huzc","aaa","bbb")

    //    （3）参数默认值，一般将有默认值的参数放置在参数列表的后面
    def f3(str3: String = "zaijia"): Unit = {
      println("My school is " + str3)
    }

    f3("school")
    f3()
    //    （4）带名参数
    def f4(name: String = "zaijia",age: Int) : Unit = {
      println(s"${age}岁的${name}在家学习")
    }
    f4("huzc",27)
    f4(age = 23, name = "huzc")
    f4(age = 27)

  }
}
