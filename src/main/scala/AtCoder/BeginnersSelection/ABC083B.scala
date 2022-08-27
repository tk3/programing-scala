package AtCoder.BeginnersSelection

import scala.io.StdIn.readLine

object ABC083B extends App {
  var line1 = readLine.split(" ").map(_.toInt)

  var n = line1(0)
  var a = line1(1)
  var b = line1(2)

  def sumValue(x: Int): Int = {
    var isLoop = true
    var remain = x
    var sum = 0
    while (isLoop) {
      val v = remain % 10
      sum = sum + v
      remain = remain / 10

      if (remain == 0) isLoop = false
    }

    sum
  }

  var l: List[Int] = List()
  var i = a
  while (i <= n) {
    val v = sumValue(i)
    if (v >= a && v <= b) {
      l :+= i
    }

    i = i + 1
  }

  println(l.sum)
}
