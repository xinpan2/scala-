abstract class Animal {
  var name: String;
}

class Cat extends Animal {
  override var name = "cat";
}

object runExtendTest {
  def main(args: Array[String]): Unit = {
    val cat = new Cat;
    println(cat.name); //print the cat's name
  }
}
