package day20230218

import day20230217.Student

object Test02_07_DataType {
  def main(args: Array[String]): Unit = {
    // 1. 整形类型
    val a1: Byte = 127
    val a2: Byte = -128

//    val a2: Byte = 128      // error

    val a3 = 12   // 整形默认为Int
    val a4 : Long = 123123123123123L   // 长真整形要在结尾加L

    val b1 : Byte = 10
    val b2 : Byte = (10 + 20)   // 虽然idea报错也是可以执行的。 报错是因为idea默认把整数视为Int

//    val b3 : Byte = b1 + 20   // error
    val b3: Byte = (b1 + 20).toByte
      println(b3)

    // 2. 浮点类型
    val f1 : Float = 1.2345f
    val d1 = 34.5678
    println(d1)

      // 3. 字符类型
      val c1: Char = 'a'
      println(c1)

      val c2: Char = '4'
      println(c2)

      // 4. 控制字符
      val c3: Char = '\t'
      val c4: Char = '\n'
      println("dddddd"+c3+"ccccc")
      println("dddddd"+c4+"ccccc")

      // 5.转义字符
      val c5: Char = '\\'
      val c6: Char = '\"'
      println("dddddd"+c5+"ccccc")
      println("dddddd"+c6+"ccccc")

      // 6. 字符变量底层保存ASCII码
      val i1: Int = c1
      println("i1: " + i1)
      val i2: Int = c2
      println("i2: " + i2)

      val c7: Char = (i1+1).toChar
      println(c7)
      val c8: Char = (i2+1).toChar
      println(c8)

      // 7. 布尔类型
      val isTrue: Boolean = true
      println(isTrue)

      // 8. 空类型
      // 8.1 空值Unit
      def m1(): Unit = {
        println("m1被调用了，小胡同学在学习了。")
      }

      val a: Unit = m1()
      println("a: " + a)

      // 8.2 空引用Null
//      val n: AnyVal = null// error
      val n: AnyRef = null
      println(n)
      var student = new Student("huzc",27)
      student = null
      println(student)

      // 8.3 Nothing
      def m2(n:Int):Int = {
        if (n == 0)
          throw new NullPointerException
        else
          return n * 5
      }

      val b: Int = m2(1)
      println(b)
  }
}
