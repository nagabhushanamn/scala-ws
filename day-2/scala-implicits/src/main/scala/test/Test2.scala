package test

object Test2 {

  val message = "Test2";

  object message1 {
    def message = " from message1 object";
    def greetMessage = " from message1 greet object";
  }

  object message2 {
    def message = " from message2 object";
  }

  //val message="from Test2"

  def main(args: Array[String]): Unit = {
    display();
  }

  def display() {
    //import message1._;
    //import message2.message;
    //    val message = "Local";
    println(message)
  }

}