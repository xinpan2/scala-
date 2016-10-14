package com.xinpaninjava.actormodel

import scala.actors.Actor._
import scala.actors.Actor

//a simple example of react
object ReactModel extends Actor {
  def act() {
    react {
      // use act() to regain the message from the mailbox
      case (name: String, actor1: Actor) => actor1 ! name; act();
      case msg: String                   => println(msg); act();
    }
  }

  def main(args: Array[String]): Unit = {
    ReactModel.start();
    ReactModel ! ("xinpan", ReactModel);
    ReactModel ! "aaaaaaaaaaaaaaa";
    ReactModel ! "bbbbbbbbbbbbbbbb";
    ReactModel ! "cccccccccccccccccc";
    ReactModel ! "ddddddddddddddd";
    ReactModel ! "eeeeeeeeeeee";
    ReactModel ! "fffffffffffffff";
  }

}