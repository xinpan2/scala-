package com.xinpaninjava.patternmatch
//class match
object CaseMatch extends App {
  //declare class,sealed means that subClass cannot be defined in the file out of here!
  sealed abstract class Person;
  case class Student(name: String, age: Int) extends Person;
  case class Teacher(name: String, age: Int) extends Person;
  case class Miner(name: String, age: Int) extends Person;

  def getType(ref: Any): String = { //matching method
    ref match {
      case Student(name, age) => "student";
      case Teacher(name, age) => "teacher";
      case _ => "anythins~mayby the type is wrong!"
    }
  }

  class Animal(name: String, age: Int) {
    def show {
      println("who am i?");
    }
  }

  override def main(args: Array[String]): Unit = {
    //test2
    val miner = new Miner("jack", 35); //miner is out of the match method!
    println(getType(miner));

    //test1
    //    val stu = new Student("xinpan", 21);
    //    val teacher = new Teacher("marry", 23);
    //    println(getType(stu));
    //    println(getType(teacher));
    //    val animal = new Animal("candy", 1);
    //    println(animal.toString());
    //    println(stu.toString());

  }
}