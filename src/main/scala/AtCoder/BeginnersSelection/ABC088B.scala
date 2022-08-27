package AtCoder.BeginnersSelection

import scala.io.StdIn.{readInt, readLine}

object ABC088B extends App {
  val line1 = readInt
  var l = readLine.split(" ").map(_.toInt).sorted

  var i = 0
  var aliceSum = 0
  var bobSum = 0
  while (i < line1) {
    if (i % 2 == 0) {
      aliceSum = aliceSum + l(i)
    } else {
      bobSum = bobSum + l(i)
    }

    i = i + 1
  }

  var result = if (aliceSum > bobSum) {
    aliceSum - bobSum
  } else {
    bobSum - aliceSum
  }

  println(result)
}
