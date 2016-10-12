package com.xinpaninjava.higher_order_function


object AnonymousFunction {
	val sum=(a:Int,b:Int)=>{
		a+b;
	}                                         //> sum  : (Int, Int) => Int = <function2>
	sum(1,2);                                 //> res0: Int = 3
}