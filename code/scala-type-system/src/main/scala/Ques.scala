

object Ques {

  def main(args: Array[String]): Unit = {

    class Trainer(name: String) {
      def doTeach() {
        println(this.name + " teaching scala")
        val name = "Kalyan"
        val that = this;
        def doLearn() = {
          println("Learning scala from " + name);
        }
        return doLearn
      }
    }

    val tnr = new Trainer("Nag");
    val learnFunc = tnr.doTeach();

    learnFunc

  }

}
