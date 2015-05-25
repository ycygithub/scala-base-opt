package base

/**
 * Created by Administrator on 2015/5/26 0026.
 */
class C {
  def name = "bar"
}

object Main{
  implicit class RichC(var v: C){
    def name = "foo"
  }

  def main(args: Array[String]) {
    var v = new C
    println(v.name)

  }

}
