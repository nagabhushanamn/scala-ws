
object implicit_system_learn {

  def main(args: Array[String]): Unit = {

    //    def findAnInt(implicit x: Int) = x;
    //    def findAnNum(implicit x: Int) = x;
    //
    //    implicit val test = 12;
    //
    //    var r1 = findAnInt; // using scala implicit-lookup mechanism
    //    var r2 = findAnNum;
    //
    //    println(r1)
    //    println(r2)

    //----------------------------------------------

    // How scala working with identifiers ?

    //    class Foo{
    //      
    //    }

    //    val y = new test.Foo

    //    import test.Foo;  // bind Foo to local-scope
    //    var y=new Foo

    //    ----------------------------------------------

    // scala imports -> flexibility

    //    import test.{Foo => Bar }
    //    println(new Bar())

    //    import java.util.{List => JList}
    //    import scala.List

    //    import java.{io=>jio}

    //    ----------------------------------------------

    // Scope & Bindings

    //    class Foo(x:Int){
    //      def tmp={
    //        val x=20;
    //        x
    //      }
    //    }
    //    
    //    val x=new Foo(12).tmp;
    //    print(x)

    //    ----------------------------------------------   

  }

}