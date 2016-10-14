package com.xinpaninjava.actormodel

import akka.actor.ActorSystem
import akka.actor.{ Actor, Props }
import akka.actor.actorRef2Scala

object AkkaActor extends App {

  override def main(args: Array[String]): Unit = {
    class MyActor extends Actor {
      def receive = {
        case s: String => println(s);
      }
    }
    val actorSys = ActorSystem();
    val actor1 = actorSys.actorOf(Props[MyActor]);
    actor1 ! "me:";
    actorSys.shutdown();
  }
}