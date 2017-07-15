

object Implicit_system_learn_2 {

  def main(args: Array[String]): Unit = {

    //    def findAnInt(implicit x: Int) = x;
    //
    //    implicit val test = 10; // defaults
    //
    //    println(findAnInt)
    //    println(findAnInt(20))

    //--------------------------------------------------------

    trait SomeTrait

    //    class SomeClass extends SomeTrait{
    //    }
    //    val instance=new SomeClass()

    // or

    val instance = new SomeTrait {}

    //-----------------------------------------------------------

    // companion object & implicit lookup

    //    trait Foo {
    //    }
    //    object Foo {
    //      implicit val x = new Foo {
    //        override def toString() = "Companion Foo"
    //      }
    //    }
    //
    //    //    implicit val x = new Foo {
    //    //      override def toString() = "Local Foo"
    //    //    }
    //
    //    def method(implicit foo: Foo) = println(foo);
    //
    //    method

    //-----------------------------------------------------------

    // Implicit Scope via Nesting
    //
    //    object Foo {
    //      trait Bar
    //      implicit def newBar = new Bar {
    //        override def toString() = "Implcit Bar"
    //      }
    //    }
    //
    //    object Parent {
    //      trait Child
    //      implicit def child = new Child {
    //        override def toString() = "Default Child"
    //      }
    //    }
    //
    //    def myImplicitly[T](implicit t: T) = {
    //      println(t)
    //    }
    //
    //    myImplicitly[Foo.Bar]
    //
    //    val ch = new Parent.Child {override def toString() = "My Child"}
    //    myImplicitly[Parent.Child](ch)
    //    myImplicitly[Parent.Child]

    //     //-----------------------------------------------------------

    

    
  }

}