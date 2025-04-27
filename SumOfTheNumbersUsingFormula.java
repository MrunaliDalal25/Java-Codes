package com.app;

public class SumOfTheNumbersUsingFormula {

	public static void main(String[] args) {
		//sum = b*(b+1)/2 – a*(a+1)/2 + a.
//		a = 10, b = 15
//
//				b*(b+1)/2 = 15*16/2 = 120
//
//				a*(a+1)/2 = 10*11/2 = 55
//
//				Now:
//				sum = 120 - 55 + 10
//				sum = 75
		
		
      int a=10,b=15;
      int sum=b*(b+1)/2-a*(a+1)/2+a;
      System.out.println("The sum is:" + sum);
	}

}
