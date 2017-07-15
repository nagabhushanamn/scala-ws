

object type_keyword {

  def main(args: Array[String]): Unit = {

    //    type T = {
    //      type X = Int // concrete Type
    //      def x: X
    //      type Y // Abstract Type
    //      def y: Y
    //    }
    //
    //    object Foo {
    //      type X = Int
    //      def x: X = 5
    //      type Y = String
    //      def y: Y = "Hello World"
    //    }
    //    object Bar {
    //      type X = Int
    //      def x: X = 50
    //      type Y = Double
    //      def y: Y = 12.12
    //    }
    //
    //    def test(t: T): Unit = {
    //      println(t.x)
    //    }
    //
    //    test(Foo);
    //    test(Bar)

    //------------------------------------------------

    class Review(stars: Int, author: String, comment: String) {}
    class Product(name: String, price: Double, reviews: Array[Review]) {}

    //----------------------------------------------------

    type ItemType = {
      type X = String
      def name: X
      type Y = Double
      def price: Y
      type Z;
      def reviews: Z
    }

    def processOrDisplay(rawData: ItemType) {
      // extract product & reviews data to create class instances
    }

  }

}