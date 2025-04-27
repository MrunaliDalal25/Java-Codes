package com.app;
//Using Nested If-else statement
public class NumIsPosOrNegUsingNestedIfElse {

	public static void main(String[] args) {
		
//		N > 0 then, number is Positive.
//		N < 0 then, number is Negative.
//		N = 0 then, number is Zero.
		
		int N=-8;
		
		if(N>=0) {
			if(N==0)
				System.out.println("zero");
			else
				System.out.println("N is Positive");
			}
		else
			System.out.println("N is Negative");
		}
		
	}


