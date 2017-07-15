
/*
 *  Lower bounds ( subtype restrictions )
 *  Upper bounds ( supertype restrictions )
 * 
 */

object type_constraints {

  // Lower Bound
  //  class A {
  //    type B >: List[Int]
  //    def foo(a: B) = a;
  //  }
  //
  //  val x = new A { type B = Traversable[Int] };
  //  x.foo(List(1));
  //
  //  val y = new A { type B = Set[Int] } // error

  //---------------------------------------

  // Upper Bound

  class A {
    type B <: Traversable[Int]
    def foo(a: B) = a;
  }

  val x = new A { type B = Traversable[Int] };
  x.foo(List(1));

  val y = new A { type B = Set[Int] }

  //-----------------------------------------
}