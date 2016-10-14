package com.xinpaninjava.actormodel
import scala.actors.Actor._
//cause the receive get a msg each time and release the thread
object HandleSingleReceive extends App {
  case class Person(name: String, age: Int) { override def toString = "[" + name + "," + age + "]" }
  case class Animal(name: String, age: Int) { override def toString = "[" + name + "," + age + "]" }
  case class Substance(name: String, outline: String) { override def toString = "[" + name + "," + outline + "]" }
  override def main(args: Array[String]): Unit = {

    def currentThread = "Thread=>" + Thread.currentThread().getName + ":";
    val actor1 = actor {
      var done = false;
      while (!done) {
        receive {
          case p: Person    => println(currentThread + p);
          case a: Animal    => println(currentThread + a);
          case s: Substance => println(currentThread + s);
          case _            => println(currentThread + "[anything else]"); done = true;
        }
      }
    }
    println(currentThread + "person");
    actor1 ! Person("XinPan", 21);
    println(currentThread + "animal");
    actor1 ! Animal("moly", 1);
    println(currentThread + "substance");
    actor1 ! Substance("basketball", "round");
    println(currentThread + "anything else");
    actor1 ! "hey man!";

  }
}