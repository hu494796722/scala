package chapter07

import scala.collection.immutable
import scala.collection.parallel.immutable.{ParMap, ParSeq}

object Test20_Parallel {
  def main(args: Array[String]): Unit = {
    val result: immutable.IndexedSeq[Long] = (1 to 100).map(
      x => Thread.currentThread().getId
    )
    println(result)


    val result2: ParSeq[Long] = (1 to 100).par.map(
      x => Thread.currentThread().getId
    )
    println(result2)




    val longToLongs: ParMap[Long, ParSeq[Long]] = result2.groupBy(i => i)
    println(longToLongs)

    val longToInt: ParMap[Long, Int] = longToLongs.map(
      t => (t._1, t._2.size)
    )
    println(longToInt)

    println(longToLongs.size)
  }
}
