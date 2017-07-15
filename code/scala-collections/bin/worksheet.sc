object worksheet {
  println("Welcome to the Scala worksheet")

  val seq = Seq(1, 2, 3);
  println(seq.apply(0))
  println(seq(0))
  //println(seq(3))

  println(seq.head)
  println(seq.tail)
  //println(Seq().head)
  //println(Seq().tail)

  println(Seq().headOption)
  println(seq.headOption)
  println(seq.length)

  println(seq.contains(2))
  println(seq.find { x => x == 5 })
  println(seq.find(_ == 3))
  println(seq.find(_ > 3))

  println(seq.sortWith(_ > _))

  seq.:+(4)
  seq.+:(0)

  0 +: seq
  seq ++ Seq(5, 6)

  //List

  Nil

  val list = 1 :: 2 :: 3 :: Nil

  5 :: 6 :: list

  List(1, 2, 3, 4, 5)

  List(1, 2, 3) ::: List(4, 5, 6)

  // Processing with bulk data

  var seq1 = Seq(1, 2, 3)

  seq1.map { elt => elt * 2 }

  seq1.map(_ * 2)

  "dog".permutations.toList

  Seq("a", "wet", "dog").map(_.permutations.toList)

  Seq("a", "wet", "dog").flatMap(_.permutations.toList)

  Seq(1, 2, 3).flatMap { num => Seq(num, num * 10) }

  // For Comprehensions

  Seq(1, 2, 3).map(_ * 2)

  val seq3 = Seq(1, 2, 3)

  for {
    x <- seq3
  } yield x * 3

  var data = Seq(Seq(1), Seq(2, 3), Seq(4, 5, 6))

  data.flatMap(_.map(_ * 2))
  data.flatMap { x => x.flatMap { x => Seq(x * 2) } }

  for {
    subSeq <- data
    ele <- subSeq
  } yield ele * 2

  for (
    subSeq <- data;
    ele <- subSeq
  ) yield ele * 2;




// Options


def readInt(str:String):Option[Int]=
if(str matches "\\d+" ) Some(str.toInt) else None


readInt("123")
readInt("abc")

readInt("abc").getOrElse(0)

readInt("123d") match {
case Some(number) => number+1
case None         => 0
}


def sum(optionA: Option[Int],optionB:Option[Int]):Option[Int]=
optionA.flatMap(a=>optionB.map(b=>a+b));

sum(readInt("1"), readInt("2"))

  
  
  
  
  
}