package com.xinpaninjava.patternmatch

import scala.collection.immutable.List

//to test the specific structure of the field function
object StructureMatch {

  def patternMatch(any: Any) {
    any match {
      case Array("i", "am", "here", _*) => println("array[String]");
      case Array(1, 2, 3, _*)           => println("array[int]");
      case _: List[_]                   => println("list");
      case _: Int                       => println("int");
      case _                            => println("don't know");
    }
  }

  def main(args: Array[String]): Unit = {
    patternMatch(Array("i", "am", "here", "!"));
    patternMatch(Array(1, 2, 3, 4));
    //    patternMatch(List["she", "still", "hot", "!"]);
    val list = List("i", "am", "here", "!");
    val list2 = List(1, 2, 3, 4, 5, 6);
    patternMatch(list);
    patternMatch(list2);
  }
}
