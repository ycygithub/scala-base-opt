package base.action.chap01

import java.nio.file.Paths

// Run with >scala FileAsIterable.scala  or
// run with the REPL in chap01/ via
// scala> :load FileAsIterable.scala


class FileAsIterable {
  val uri = Paths.get("src/base/action/chap01/someFile.txt").toUri;
  def iterator = scala.io.Source.fromURI(uri).getLines()
}

object FileAsIterableExample extends App {
  val newIterator = new FileAsIterable with Iterable[String]
  newIterator.foreach { line => println(line) }
}
