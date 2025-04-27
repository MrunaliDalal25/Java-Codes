package com.app;
//UsingTernaryOperator
public class NumIsPosOrNegUsingTernaryOperator {

	public static void main(String[] args) {
		
		
//		N > 0 then, number is Positive.
//		N < 0 then, number is Negative.
//		N = 0 then, number is Zero.
		
//		Ternary Operator Syntax
//		( Condition ) ? ( if True : Action) : ( if False : Action) ;
		
		int N=0;
		if(N==0)
		{
			System.out.println("Zero");
		}
		else {
		String result = N>0? "The number is positive" : "The number is negative";
		System.out.println(result);

	}
	}
}
