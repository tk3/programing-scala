package AtCoder.BeginnersSelection

import scala.io.StdIn.readLine

object ABC086A extends App {
  val line1 = readLine.split(" ").map(_.toInt)

  val sum = line1(0) * line1(1)

  val result = if (sum % 2 == 0) "Even" else "Odd"

  println(result)
}
