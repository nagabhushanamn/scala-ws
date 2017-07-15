

object Test {

  def main(args: Array[String]): Unit = {

    def readInt(str: String): Option[Int] =
      if (str matches "\\d+") Some(str.toInt) else None

    //    readInt("123")
    //    readInt("abc")
    //
    //    readInt("abc").getOrElse(0)
    //
    //    readInt("123d") match {
    //      case Some(number) => number + 1
    //      case None => 0
    //    }

    //    def sum(optionA: Option[Int], optionB: Option[Int]): Option[Int] =
    //      optionA.flatMap(a => optionB.map(b => a + b));
    //
    //    println(sum(readInt("a"), readInt("3")).getOrElse(0))

    // Monads

    //    val v = for {
    //      a <- readInt("1") 
    //      b <- readInt("d")
    //    } yield a + b
    //
    //    println(v.getOrElse(0))

    //    val seq = for {
    //      x <- Seq(1, 2, 3)
    //      
    //      y <- Seq(4, 5, 6)
    //    } yield x + y
    //    
    //    print(seq)
    //    

    //      var seq=for(x<-Seq(-2,-1,0,1,2) if x>0) yield x
    //      print(seq)

    //      val s=Seq(1,2,3).zip(Seq(4,5,6))
    //      print(s)

    //    val s = for (x <- Seq(1, 2, 3).zip(Seq(4, 5, 6))) yield { val (a, b) = x; a + b }
    //    println(s)

    val s = for {
      x <- Seq(1, 2, 3)
      square = x * x
      y <- Seq(4, 5, 6)
    } yield square * y

    println(s)

  }

}