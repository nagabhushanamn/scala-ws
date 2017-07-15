package test

object Test4 {

  def main(args: Array[String]): Unit = {

    import pack1.Person; // imported type

    import pack1.defaults._; // imported implicits

    val p = new Person;
    p.sayName

  }

}