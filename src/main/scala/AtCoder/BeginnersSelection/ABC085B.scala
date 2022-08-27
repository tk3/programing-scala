package AtCoder.BeginnersSelection

import scala.io.StdIn.readInt

object ABC085B extends App {
  val line1 = readInt()

  var l: List[Int] = List()
  for (i <- 1 to line1) {
    val line = readInt()
    l :+= line
  }

  val d = l.sortWith((x, y) => y - x < 0).distinct

  println(d.length)
}
