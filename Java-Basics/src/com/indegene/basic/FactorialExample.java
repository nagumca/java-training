package com.indegene.basic;

import java.util.Scanner;

public class FactorialExample {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the factorial of n value : ");
		int n = input.nextInt();
		int result = 1;
		for(int i=1; i <= n; i++) {
			result *= i;  // result = result * i 
		}
		System.out.println("The factorial value of "+n+" is "+result);
	}
}
