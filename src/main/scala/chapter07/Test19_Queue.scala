package chapter07

import scala.collection.immutable.Queue
import scala.collection.mutable

object Test19_Queue {
  def main(args: Array[String]): Unit = {
    // 创建一个可变队列
    val queue: mutable.Queue[Int] = new mutable.Queue[Int]()

    queue.enqueue(1,2,3)

    println(queue)
    println(queue.dequeue())
    println(queue)
    println(queue.dequeue())
    println(queue)

    queue.enqueue(4,5)

    println(queue)
    println(queue.dequeue())
    println(queue)

    println("==========================")

    // 不可变队列
    val queue2: Queue[Int] = Queue(2,4,6)
    val queue3: Queue[Int] = queue2.enqueue(8)
    println(queue2)
    println(queue3)

  }
}
