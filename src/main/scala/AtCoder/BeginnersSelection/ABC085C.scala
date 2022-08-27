package AtCoder.BeginnersSelection

import scala.io.StdIn.readLine

object ABC085C extends App {

  val line1 = readLine.split(" ").map(_.toLong)
  val n = line1(0)
  val y = line1(1)

  var result10000 = -1L
  var result5000 = -1L
  var result1000 = -1L

  var found = false
  var i = 0
  while (i <= n && !found) {
    var j = 0
    while (j + i <= n && !found) {
      val k = n - i - j
      if (k >= 0) {
        val sum = i * 10000 + j * 5000 + k * 1000
        if (sum == y && (i + j + k) == n) {
          result10000 = i
          result5000 = j
          result1000 = k
          found = true
        }
      }
      j = j + 1
    }
    i = i + 1
  }

  println(s"$result10000 $result5000 $result1000")
}
