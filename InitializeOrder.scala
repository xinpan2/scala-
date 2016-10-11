package com.xinpaninjava.scala.extend

//to test the order of  initializing classes

//class SupperClass {
//  val num = 20;
//  var array = new Array[Int](num); //generates the array with the length of num
//}
//
//class SubClass extends SupperClass {
//  override val num = 8; //override the num
//}
//
//object InitializeOrder {
//  def main(args: Array[String]): Unit = {
//    val sub = new SubClass;
//    println(sub.array.length); //show the array
//  }
//}

//solution with predefinition method

class SupperClass {
  val num = 20;
  var array = new Array[Int](num); //generates the array with the length of num
}

class SubClass extends { override val num = 8 } with SupperClass {
}

object InitializeOrder {
  def main(args: Array[String]): Unit = {
    val sub = new SubClass;
    println(sub.array.length); //show the array
  }
}
