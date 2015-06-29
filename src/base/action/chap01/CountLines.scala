package base.action.chap01

object CountLines extends App{

  import System._
  val src = scala.io.Source.fromFile("someFile.txt")
  val count = src.getLines().map(x => 1).sum
  println(count)

}
