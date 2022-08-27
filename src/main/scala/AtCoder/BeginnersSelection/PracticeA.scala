package AtCoder.BeginnersSelection

import scala.io.StdIn.{readInt, readLine}

object PracticeA extends App {
  val line1 = readInt
  val line2 = readLine.split(" ").map(_.toInt)
  val line3 = readLine

  val result = s"${line1 + line2(0) + line2(1)} " + line3

  println(result)
}
