package chapter07

object Test18_ComplexWordCount {
  def main(args: Array[String]): Unit = {
    val tupleList: List[(String, Int)] = List(
      ("hello", 1),
      ("hello world", 2),
      ("hello scala", 3),
      ("hello spark from scala", 1),
      ("hello flink from scala", 2)
    )

    // 思路一：直接展开为普通版本
    val newStringList: List[String] = tupleList.map(
      kv => {
        (kv._1.trim + " ") * kv._2
      }
    )
    println(newStringList)

    // 接下来操作与普通版本完全一致
    val wordCountList: List[(String, Int)] = newStringList
      .flatMap(_.split(" "))  // 空格分词
      .groupBy(i => i)
      .map(kv => (kv._1, kv._2.size))
      .toList
      .sortBy(_._2)(Ordering[Int].reverse)
      .take(3)

    println(wordCountList)

    println("================================")



//    ("hello", 1),
//    ("hello world", 2),
//    ("hello scala", 3),
//    ("hello spark from scala", 1),
//    ("hello flink from scala", 2)
    // 思路二：直接基于预统计的结果进行转换
    // 1. 将字符串打散为单词，并结合对应的个数包装成二元组
    val tuples: List[(String, Int)] = tupleList.flatMap(
      strings => {
        val strings1: Array[String] = strings._1.split(" ")
        strings1.map(word => (word, strings._2))
      }
    )

    println(tuples)
    // 2. 对二元组按照单词进行分组
    val stringToTuples: Map[String, List[(String, Int)]] = tuples.groupBy(_._1)
    println(stringToTuples)

    // 3. 叠加每个单词预统计的个数值
    val stringToInt: Map[String, Int] = stringToTuples.mapValues(
      valve => {
        valve.map(_._2).sum
      }
    )
    println(stringToInt)
    // 4. 转换成list，排序取前3
    val tuples1: List[(String, Int)] = stringToInt.toList
      .sortWith(_._2 > _._2)
      .take(3)
    println(tuples1)



  }
}
