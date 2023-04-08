package chapter07

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

object Test02_ArrayBuffer {
  def main(args: Array[String]): Unit = {

    // 1. 创建可变的数组
    val arr1: ArrayBuffer[Int] = new ArrayBuffer[Int]()
    val arr2: ArrayBuffer[Int] = ArrayBuffer(23, 57, 92)

    println(arr1)
    println(arr2)

    // 2. 访问元素

//    println(arr1(0))  // error  :  没有数据你输入下标就会 越界
    println(arr2(1))
    arr2(1) = 39
    println(arr2(1))

    println("=====================================")

    // 3. 添加元素
    // :+ 的方式是针对不可变数组的添加方式，
    // 在可变数组中直接使用 :+ 语法和运行都不会报错，但是不会添加成功。 所以 println(arr1) 的结果为空
    // :+ 要想有结果就要赋值新的数组 newArr1 这样 println(newArr1) 是会有结果的
    val newArr1: ArrayBuffer[Int] = arr1 :+ 15
    println(arr1)
    println(newArr1)
    println(arr1 == newArr1)

    // 针对可变的要用 += 号
    val newArr2: arr1.type = arr1 += 19
    println(arr1)
    println(newArr2)
    println(arr1 == newArr2)

    // 会改变改变 arr1 的值
    // 可变数组往后加的符号
    newArr2 += 13
    println(arr1)

    // 可变数组往前加的符号
    77 +=: arr1
    println(arr1)
    println(newArr2)

    // 建议直接使用方法

    arr1.append(12)
    arr1.prepend(11,66)
    arr1.insert(1,13,59)
    println(arr1)

    arr1.insertAll(2,newArr1)
    arr1.prependAll(newArr2)
    arr1.appendAll(newArr1)

    println(arr1)

    // 4. 删除元素
    arr1.remove(3)
    println(arr1)

    arr1.remove(0,10)
    println(arr1)

    // 遍历删除第一个相等的值
    arr1 -= 15
    println(arr1)

    println("======================================")

    // 5. 可变数组转变为不可变数组
    val arr: ArrayBuffer[Int] = ArrayBuffer(23, 57, 92)
    val newArr: Array[Int] = arr.toArray
    println(arr)
    println(newArr.mkString(", "))


    // 不可变数组变可变数组
    val buffer: mutable.Buffer[Int] = newArr.toBuffer
    println(buffer)
    println(newArr)






  }
}
