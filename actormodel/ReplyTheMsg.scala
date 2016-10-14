package com.xinpaninjava.actormodel
import scala.actors.Actor._
import com.xinpaninjava.actormodel.HandleSingleReceive.Person
import com.xinpaninjava.actormodel.HandleSingleReceive.Animal
import com.xinpaninjava.actormodel.HandleSingleReceive.Substance

//use the char1acters !? to reply the receive to the sender
object ReplyTheMsg extends App {
  def currentThread = "Thread=>" + Thread.currentThread().getName + ":";
  val actor1 = actor {
    var done = false;
    while (!done) {
      receive {
        //sleep 5 seconds to watch the execution of others messages
        case p: Person    => { println(currentThread + p); Thread.sleep(5000); reply("received the meg:" + p); }
        case a: Animal    => { println(currentThread + a); reply("received the meg:" + a); }
        case s: Substance => { println(currentThread + s); reply("received the meg:" + s); }
        case "exit"       => done = true;
      }
    }
  }
  val reply1 = actor1 !? Person("XinPan", 21);
  println(currentThread + reply1);
  val reply2 = actor1 !? Animal("moly", 1);
  println(currentThread + reply2);
  val reply3 = actor1 !? Substance("basketball", "round");
  println(currentThread + reply3);
  actor1 ! "exit";
}