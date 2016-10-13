package com.xinpaninjava.generictype
//bounding test  
class Animal {
}

class Dog(name: String, age: Int) extends Animal {
  override def toString = "[" + name + "," + age + "]";
}

class Cat(name: String, age: Int) extends Animal {
  override def toString = "cat:[" + name + "," + age + "]";
}

class Zoo[animal <: Animal] {
  def isOK(a: animal) {
    println(a);
  }
}

object Bounding extends App {
  override def main(args: Array[String]): Unit = {
    val moly = new Cat("moly", 1);
    val zoo = new Zoo[Animal];
    zoo.isOK(moly);
    val per = new Person("XinPan", 21);
//    zoo.isOK(per);
  }
}