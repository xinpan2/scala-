package com.xinpaninjava.generictype

// A ->B ->C
class A
class B extends A
class C extends B

class Covariant[+T](t: T) //协变
class Inverter[-T](t: T) //逆变

object TypeChange extends App {
  override def main(args: Array[String]): Unit = {
    val a = new A;
    val b = new B;
    val c = new C;
    var covariantTest1 = new Covariant[A](a);
    var covarianttest2 = new Covariant[B](b);
    //    covarianttest2 = covariantTest1; 编译失败
    covariantTest1 = covarianttest2;

    //inverter:
    var inverterTest1 = new Inverter[A](a);
    var inverterTest2 = new Inverter[B](b);
    //    inverterTest1 = inverterTest2;  编译失败
    inverterTest2 = inverterTest1;

  }
}