package base.action.chap01

import java.nio.file.Paths

object CountLines extends App{

  import System._

  val uri = Paths.get("src/base/action/chap01/someFile.txt").toUri;
  val src = scala.io.Source.fromURI(uri)
  val count = src.getLines().map(x => 1).sum
  println(count)

}
