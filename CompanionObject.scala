// apply the private field age
object CompanionObject extends App {
  private var privateAge = 20;
  def age = 20;
  //  def age_=(newValue: Int) {
  //    if (newValue > privateAge) {
  //      privateAge = newValue;
  //    }
  //  }
  def show { //show the private fields between the companion object and class
    val comClass = new CompanionObject();
    //utilizes the field that is private in the companion class CompanionObject
    println(comClass.privateName + ":" + age);
  }
}

//apply the private field name
class CompanionObject {
  private var privateName = "XinPan";
  //  def name = privateName;
  //  def name_=(newName: String) {
  //    privateName = name;
  //  }
  def show {
    println(privateName);
  }
}

//app's entrance
object execute {
  def main(args: Array[String]): Unit = {
    CompanionObject.show;
  }
}
