package com.xinpaninjava.higher_order_function
//transfer all the parameters to the parameter list,in which each node has one arguments
object CurriedFunction {
  def add(a: Int, b: Int, c: Int) = {
    a + b + c;
  }
  def curriedAdd(a: Int)(b: Int)(c: Int) = {
    a + b + c
  }

  def main(args: Array[String]): Unit = {
    //traditional calling
    println(add(1, 2, 3));

    //curriedFunction
    val addFirst = curriedAdd(1)_;
    val addSecond = addFirst(2)(3);
    println(addSecond);
  }
}