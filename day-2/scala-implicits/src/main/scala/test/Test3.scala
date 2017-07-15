package test

object Test3 {

  def main(args: Array[String]): Unit = {

    def testFoo(implicit foo: Foo) = println(foo);
    
    testFoo

  }

}