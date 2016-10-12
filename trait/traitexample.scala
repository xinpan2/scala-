package com.xinpaninjava.scala.traittest

//test the order of call the method with trait
abstract class Person {
  def work {}
}
trait Student extends Person {
  override def work {
    println("students are  studying");
  }
}
trait Miner extends Person {
  override def work {
    println("miners are mining");
  }
}
trait Teacher extends Person {
  override def work {
    println("teachers are teacghing");
  }
}

object traitexample {
  def main(args: Array[String]): Unit = {
    val sb1 = new Person with Student with Miner with Teacher;
    sb1.work;
    val sb2 = new Person with Student with Teacher with Miner;
    sb2.work;
  }
}