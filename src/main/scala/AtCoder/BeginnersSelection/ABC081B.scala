package AtCoder.BeginnersSelection

import scala.io.StdIn.{readInt, readLine}

object ABC081B extends App {
  val line1 = readInt
  var line: List[Int] = readLine.split(" ").take(line1).map(_.toInt).toList

  var isTakeNext = line.forall(_ % 2 == 0)
  var counter = 0
  while (isTakeNext) {
    line = line.map(_ / 2)
    counter = counter + 1
    isTakeNext = line.forall(_ % 2 == 0)
  }

  println(counter)
}
