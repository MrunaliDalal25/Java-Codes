package com.app;

public class SumOfNNaturalNumbersByRecursion {
		
		 public static int sum(int n) {
		        if (n == 1) {
		            return 1;  // Base case
		        }
		        return n + sum(n - 1);  // Recursive case
		    }

		    public static void main(String[] args) {
		        int N = 10; // You can change this value to test other numbers
		        int result = sum(N);
		        System.out.println("Sum of first " + N + " natural numbers is: " + result);
		    }
		}