package com.xinpaninjava.actormodel
//import akka.actor._
import scala.actors.Actor._
import scala.actors.Actor
import com.xinpaninjava.actormodel.HandleSingleReceive.Person

//declare a actor(AKKA) to receive message
object Sample1 extends App {
  class ActorDemo extends Actor { //the first method to create an Actor object
    def act() {
      var done = false;
      while (!done) {
        receive {
          case m: String => println(m); //act();
        }
      }
    }
  }

  val act = new ActorDemo;
  act.start();
  act ! "a";
  act ! "b";

  //simple way to create an actor obj

  //  override def main(args: Array[String]): Unit = { //the second method to create an Actor object
  //    val act = actor {
  //      receive {
  //        case m: String => println(m);
  //      }
  //    }
  //    act ! "hello scala.Actor~!";
  //  }
}