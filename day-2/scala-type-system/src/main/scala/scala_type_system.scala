

object scala_type_system {

  def main(args: Array[String]): Unit = {

    //    trait Mobile
    //    val mob = new Mobile { override def toString() = "Mobile" } // class + object of Mobile Trait

    class Person {

      trait Mobile
      val mob = new Mobile { override def toString() = "Person Mobile" }

      // path dependent type
      def speak(mob: this.Mobile) = {
        println(mob)
      }

      // type projection
      def speak2(mob: Person#Mobile) = {
        println(mob)
      }

    }

    val p1 = new Person;
    val p2 = new Person;

    //    p1.speak(p1.mob)
    //    p1.speak(p2.mob); // error

    p1.speak2(p1.mob)
    p1.speak2(p2.mob);

  }

}