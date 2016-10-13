package com.xinpaninjava.patternmatch
//test the input parameters!
object PartialFunction extends App {

  override def main(args: Array[String]): Unit = {
    //define the legal parameter
    val one: PartialFunction[Int, String] = {
      case 1 => "one";
    }
    //define the legal parameter
    val two: PartialFunction[Int, String] = {
      case 2 => "two";
    }
    //define the legal parameter
    val three: PartialFunction[Int, String] = {
      case 3 => "three";
    }
    //define the legal parameter
    val four: PartialFunction[Int, String] = {
      case _ => "anything else";
    }
    //connect all the partial function by orElse keyword!!
    val partial = one orElse two orElse three orElse four;
    println(partial.isDefinedAt(1)); //test legal
    println(partial(1));
    println(partial(2));
    println(partial(3));
    println(partial(4));
    println(partial(5));
  }
}