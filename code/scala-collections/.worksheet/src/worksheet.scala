object worksheet {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(62); 
  println("Welcome to the Scala worksheet");$skip(27); 

  val seq = Seq(1, 2, 3);System.out.println("""seq  : Seq[Int] = """ + $show(seq ));$skip(24); ;
  println(seq.apply(0));$skip(18); 
  println(seq(0));$skip(41); 
  //println(seq(3))

  println(seq.head);$skip(20); 
  println(seq.tail);$skip(77); 
  //println(Seq().head)
  //println(Seq().tail)

  println(Seq().headOption);$skip(26); 
  println(seq.headOption);$skip(22); 
  println(seq.length);$skip(28); 

  println(seq.contains(2));$skip(36); 
  println(seq.find { x => x == 5 });$skip(28); 
  println(seq.find(_ == 3));$skip(27); 
  println(seq.find(_ > 3));$skip(32); 

  println(seq.sortWith(_ > _));$skip(13); val res$0 = 

  seq.:+(4);System.out.println("""res0: Seq[Int] = """ + $show(res$0));$skip(12); val res$1 = 
  seq.+:(0);System.out.println("""res1: Seq[Int] = """ + $show(res$1));$skip(12); val res$2 = 

  0 +: seq;System.out.println("""res2: Seq[Int] = """ + $show(res$2));$skip(19); val res$3 = 
  seq ++ Seq(5, 6);System.out.println("""res3: Seq[Int] = """ + $show(res$3));$skip(17); val res$4 = 

  //List

  Nil;System.out.println("""res4: scala.collection.immutable.Nil.type = """ + $show(res$4));$skip(33); 

  val list = 1 :: 2 :: 3 :: Nil;System.out.println("""list  : List[Int] = """ + $show(list ));$skip(18); val res$5 = 

  5 :: 6 :: list;System.out.println("""res5: List[Int] = """ + $show(res$5));$skip(23); val res$6 = 

  List(1, 2, 3, 4, 5);System.out.println("""res6: List[Int] = """ + $show(res$6));$skip(35); val res$7 = 

  List(1, 2, 3) ::: List(4, 5, 6);System.out.println("""res7: List[Int] = """ + $show(res$7));$skip(59); 

  // Processing with bulk data

  var seq1 = Seq(1, 2, 3);System.out.println("""seq1  : Seq[Int] = """ + $show(seq1 ));$skip(31); val res$8 = 

  seq1.map { elt => elt * 2 };System.out.println("""res8: Seq[Int] = """ + $show(res$8));$skip(19); val res$9 = 

  seq1.map(_ * 2);System.out.println("""res9: Seq[Int] = """ + $show(res$9));$skip(29); val res$10 = 

  "dog".permutations.toList;System.out.println("""res10: List[String] = """ + $show(res$10));$skip(53); val res$11 = 

  Seq("a", "wet", "dog").map(_.permutations.toList);System.out.println("""res11: Seq[List[String]] = """ + $show(res$11));$skip(57); val res$12 = 

  Seq("a", "wet", "dog").flatMap(_.permutations.toList);System.out.println("""res12: Seq[String] = """ + $show(res$12));$skip(54); val res$13 = 

  Seq(1, 2, 3).flatMap { num => Seq(num, num * 10) };System.out.println("""res13: Seq[Int] = """ + $show(res$13));$skip(52); val res$14 = 

  // For Comprehensions

  Seq(1, 2, 3).map(_ * 2);System.out.println("""res14: Seq[Int] = """ + $show(res$14));$skip(27); 

  val seq3 = Seq(1, 2, 3);System.out.println("""seq3  : Seq[Int] = """ + $show(seq3 ));$skip(39); val res$15 = 

  for {
    x <- seq3
  } yield x * 3;System.out.println("""res15: Seq[Int] = """ + $show(res$15));$skip(51); 

  var data = Seq(Seq(1), Seq(2, 3), Seq(4, 5, 6));System.out.println("""data  : Seq[Seq[Int]] = """ + $show(data ));$skip(30); val res$16 = 

  data.flatMap(_.map(_ * 2));System.out.println("""res16: Seq[Int] = """ + $show(res$16));$skip(54); val res$17 = 
  data.flatMap { x => x.flatMap { x => Seq(x * 2) } };System.out.println("""res17: Seq[Int] = """ + $show(res$17));$skip(64); val res$18 = 

  for {
    subSeq <- data
    ele <- subSeq
  } yield ele * 2;System.out.println("""res18: Seq[Int] = """ + $show(res$18));$skip(66); val res$19 = 

  for (
    subSeq <- data;
    ele <- subSeq
  ) yield ele * 2;System.out.println("""res19: Seq[Int] = """ + $show(res$19));$skip(104); ;




// Options


def readInt(str:String):Option[Int]=
if(str matches "\\d+" ) Some(str.toInt) else None;System.out.println("""readInt: (str: String)Option[Int]""");$skip(17); val res$20 = 


readInt("123");System.out.println("""res20: Option[Int] = """ + $show(res$20));$skip(15); val res$21 = 
readInt("abc");System.out.println("""res21: Option[Int] = """ + $show(res$21));$skip(29); val res$22 = 

readInt("abc").getOrElse(0);System.out.println("""res22: Int = """ + $show(res$22));$skip(80); val res$23 = 

readInt("123d") match {
case Some(number) => number+1
case None         => 0
};System.out.println("""res23: Int = """ + $show(res$23));$skip(106); 


def sum(optionA: Option[Int],optionB:Option[Int]):Option[Int]=
optionA.flatMap(a=>optionB.map(b=>a+b));System.out.println("""sum: (optionA: Option[Int], optionB: Option[Int])Option[Int]""");$skip(33); val res$24 = ;

sum(readInt("1"), readInt("2"));System.out.println("""res24: Option[Int] = """ + $show(res$24))}

  
  
  
  
  
}
