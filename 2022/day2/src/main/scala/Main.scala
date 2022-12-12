import scala.io.Source

@main def hello: Unit = 
  val lines = Source.fromFile("data.txt").getLines()
  val score = lines.foldLeft(0)((currentScore, guideRound) => {
    val roundScore = guideRound.split(" ") match {
      case Array("A", "X") => 1 + 3
      case Array("B", "X") => 1 + 0 
      case Array("C", "X") => 1 + 6 
      case Array("A", "Y") => 2 + 6
      case Array("B", "Y") => 2 + 3
      case Array("C", "Y") => 2 + 0
      case Array("A", "Z") => 3 + 0
      case Array("B", "Z") => 3 + 6
      case Array("C", "Z") => 3 + 3
    }
    currentScore + roundScore
  })
  println("Final score is: ")
  print(score)
