package com.xinpaninjava.higher_order_function
//sample to use higher-order-function
object TailRecursion {

  def sum(f: Int => Int)(a: Int)(b: Int): Int = {
    @annotation.tailrec // marks the annotation to urge the VM to improve the tail recursion
    def loop(n: Int)(m: Int): Int = {
      if (n > b) { //当前n大于上界退出递归，并直接返回和
        m
      } else {
        loop(n + 1)(m + f(n)); //m+f(n)代表把前n项之和传到下一次递归，n+1代表下一项
      }
    }
    loop(a)(0); //在这里得到调用的结果
  }

  def main(args: Array[String]): Unit = {
    println(sum(x => x)(1)(5)); //求1-5之和
    println(sum(x => x * x)(1)(5)); //求1-5的平方和，即1^2 + 2^2+3^2+4^2+5^2
  }
}

