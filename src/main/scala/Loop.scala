object Loop extends App {

  loopWhile()
  loopFor1()
  loopFor2()

  def loopWhile(): Unit = {
    println("while")

    var counter = 0
    while (counter < 5) {
      println(s"while: ${counter}")
      counter = counter + 1
    }

    println("")
  }

  def loopFor1(): Unit = {
    println("for1")

    for (i <- 0 to 4) {
      println(s"for1: ${i}")
    }

    println("")
  }

  def loopFor2(): Unit = {
    println("for2")

    for {
      i <- 0 to 2
      j <- 0 to 2
    } {
      print(s"${i * j} ")
      if (j == 2)  println("")
    }
  }

}
