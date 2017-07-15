

object type_parameter {

  def main(args: Array[String]): Unit = {

    def firstElement[T](x: Seq[T]): T = {
      x.apply(0);
    }

    println(firstElement[Int](List(1, 2, 3)))
    println(firstElement[String](List("a", "b", "c")))

  }

}