package com.app;

public class EvenOrOddUsingTernaryOperator {

	public static void main(String[] args) {
		//	if (number % 2 == 0)
//		Ternary Operator Syntax
//		( Condition ) ? ( if True : Action ) : ( if False : Action ) ;
		
		int num=32;
		String status=num%2==0? "is Even" : "is odd";
		System.out.println(num+status);
		

	}

}
