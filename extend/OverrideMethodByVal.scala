package com.xinpaninjava.scala.extend

//uses keyword `val` to override the parameterless method

class Person(name: String, age: Int) {
  override val toString = name + ":" + age;
}

object OverrideMethodByVal {
  def main(args: Array[String]): Unit = {
    val withNoOverride = new Person("XinPan", 21);
    println(withNoOverride); //directly show the person
  }

}