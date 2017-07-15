package test

object Test {

  def main(args: Array[String]): Unit = {
    testSamePackage();
    testWildCardImport();
    testExplicitImport()
    testInlineDefintion()
  }

  // case-1
  def testSamePackage() {
    println(x)
  }

  object WildCard {
    def x = "WildCard Import x";
  }

  // case-2
  def testWildCardImport() {
    import WildCard._;
    println(x)
  }

  object Explicit {
    def x = "Explicit Import x"
  }

  // case-3
  def testExplicitImport() {
    import Explicit.x;
    import WildCard._;
    println(x)
  }

  //case-4
  def testInlineDefintion() {
    var x = "Inline defintion of x"
    import Explicit.x;
    import WildCard._;
    println(x)
  }

}