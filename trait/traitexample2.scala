package com.xinpaninjava.scala.traittest
//test the super keywork 
class Animal {
  def say(): String = "Animal~~~.\n";
}

trait Swallow extends Animal {
  override def say = super.say() + " Swallow say hi~!";
}

trait Carp extends Animal {
  override def say = super.say() + " Carp say hi~!";
}

object traitexample2 extends App {
  override def main(args: Array[String]): Unit = {
    val animal1 = new Animal with Swallow with Carp;
    println(animal1.say);
    val animal2 = new Animal with Carp with Swallow;
    println(animal2.say);
  }
}