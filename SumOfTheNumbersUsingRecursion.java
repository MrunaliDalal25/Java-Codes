package com.app;

public class SumOfTheNumbersUsingRecursion {

	public static void main(String[] args) {
	
		 {
			    int a = 5;
			    int b = 10;

			    int sum = getSum(a,b);
			    System.out.println("the sum is:" +sum);
		 }
	}
	
		 static int getSum(int i ,int b) {
		  // Stop when i > b
			     if(i>b) {
		 return 0;
		 }
		   // Add current i and call recursively for next number
			    // It will add 5 + 6 + 7 + 8 + 9 + 10 = 45
		 return i + getSum(i + 1, b);
	

		 }

}
