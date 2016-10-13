package com.xinpaninjava.patternmatch
//given that sometime there are some classes that are omitted to list in the match,we handle it
object SealedClass extends App {
  abstract class Mood
  case class Bed(color: String) extends Mood
  case class Desk(color: String) extends Mood
  case class Table(color: String) extends Mood
  def getType(obj: Mood) = {
    (obj: @unchecked) match {
      case Bed(color)  => color + "bed";
      case Desk(color) => color + "desk";
            case _           => "anything else";
    }
  }
  override def main(args: Array[String]): Unit = {
    val bed = new Bed("yellow");
    val desk = new Desk("brown");
    val table = new Table("red");

    println(getType(bed));
    println(getType(desk));
    println(getType(table));
  }
}