package pack1

class Person {
  def sayName(implicit name: String) = {
    println("im " + name)
  }
}

object defaults {
  implicit val x = "Unknown";
}