package AtCoder.BeginnersSelection

import scala.io.StdIn.readLine

object ABC081A extends App {
  val line1 = readLine.toCharArray.map(_.asDigit)

  val result = line1(0) + line1(1) + line1(2)

  println(result)
}
