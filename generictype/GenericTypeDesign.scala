package com.xinpaninjava.generictype

import scala.collection.mutable.ArrayBuffer
import scala.runtime.RichInt
//define generic type
class MyGeneric[T] {
  def show(a: T) {
    println(a);
  }
}

class Person(name: String, age: Int) {
  override def toString = "[" + name + "," + age + "]";
}

object GenericTypeDesign {
  def main(args: Array[String]): Unit = {

    val test1 = new MyGeneric[Person];
    test1.show(new Person("XinPan", 21));
  }
}