package com.app;

public class EvenOrOddUsingBitwiseOperator {

	public static void main(String[] args) {
//		If we have any number ‘n‘ doing bitwise ‘&‘ operation will give resultant as
//		1: If n is odd
//		0: if n is even

		int num=37;
		if(isEven(num)) 
			System.out.println("Even");
		else
			System.out.println("odd");
		}
			
		// Returns true if n is even, else odd
		static Boolean isEven(int num){

		    // n & 1 is 1, then odd, else even
			return (num & 1) == 0;
				
	}

}
