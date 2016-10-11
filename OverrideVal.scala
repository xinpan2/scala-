package com.xinpaninjava.scala.extend

//to override the val field
class Animal {
  val name = "animal";
}

class Cat extends Animal {
  override val name = "cat~~!!!";
}

object OverrideVal {
  def main(args: Array[String]): Unit = {
    val cat = new Cat;
    println(cat.name); //get the cat's name
  }
}