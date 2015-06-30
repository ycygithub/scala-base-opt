package base.action.chap01


object ParallelCollectionsExample extends App {
  def timeOperation(payload: => Unit) = {
  	val start = System.currentTimeMillis
  	payload
  	println("Time taken " + (System.currentTimeMillis - start))
  }

  timeOperation((1 to 1000000).toList.map(_*2))
  timeOperation((1 to 1000000).toList.par.map(_*2))

  (1 to 5).foreach(println(_))
  (1 to 5).par.foreach(println(_))

}
