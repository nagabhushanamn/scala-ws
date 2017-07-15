
import scala.Predef._;

object implict_views_learn {

  def main(args: Array[String]): Unit = {

    //    // existing lib
    //    def foo(msg: String) = println(msg)
    //    //    foo("12");
    //    //foo(12.toString);
    //
    //    implicit def intToString(x: Int) = x.toString()
    //
    //    foo(12);

    trait Foo
    trait Bar

    object Foo {
      implicit def fooToBar(foo: Foo) = new Bar() {}
    }

    def method(x: Bar) = println("BARRR");

    val foo = new Foo() {}
    method(foo);

  }

}