package AtCoder.BeginnersSelection

import scala.io.StdIn.readInt

object ABC087B extends App {
  val line1 = readInt
  val line2 = readInt
  val line3 = readInt
  val line4 = readInt

  var counter = 0
  for {
    i <- 0 to line1
    j <- 0 to line2
    k <- 0 to line3
  } {
    val sum = i * 500 + j * 100 + k * 50
    if (sum == line4) {
      counter = counter + 1
    }
  }

  println(counter)
}
