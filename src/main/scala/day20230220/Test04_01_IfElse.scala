package day20230220

import scala.io.StdIn

object Test04_01_IfElse {
  def main(args: Array[String]): Unit = {
    println("请输出您的年龄：")
    val age: Int = StdIn.readInt()

    // 1. 单分支
    if (age >= 18){
      println("成年")
    }

    println("===================")

    // 2. 双分支
    if (age >= 18){
      println("成年")
    } else {
      println("未成年")
    }

    println("===================")

    // 3. 多分支
    if (age <= 6){
      println("童年")
    } else if(age < 18){
      println("青少年")
    } else if(age < 35){
      println("青年")
    } else if(age < 60){
      println("中年")
    } else {
      println("老年")
    }
    println("===================")

    // 4. 分支语句的返回值
    val result: Any = if (age <= 6){
      "童年"
    } else if (age < 18){
      "青少年"
      age
    } else if (age < 35){
      "青年"
    } else if (age < 60){
      "中年"
    } else{
      "老年"
    }

    println("result: " + result)
    // java中三元运算符 String res = (age >= 18)?"成年":"未成年"
    val result1:String = if (age >= 18){
      "中年"
    } else {
      "老年"
    }
    println(result1+"----")

    val res: String = if (age > 18) "请你去" else "asdfasdfa"
    println(res)
    println("===================")


    // 5. 嵌套分支
    if (age >= 18){
      println("成年")
      if (age >= 35){
        if (age >= 60){
          println("老年")
        } else {
          println("中年")
        }
      } else {
        println("青年")
      }
    } else {
      println("未成年")
      if (age <= 6){
        println("童年")
      } else {
        println("青少年")
      }
    }





  }
}
