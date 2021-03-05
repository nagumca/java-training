package com.indegene.basic;

import java.util.Scanner;

public class WhileLoopExample2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int userInput;		// read user input from console
		System.out.print(" 1 - Continue ; 0 - Exit ");
		userInput = input.nextInt();
		/*
		 * This while loop is used 
		 * to calculate sum of two digit
		 */
		/**
		 * input1 is integer 
		 * input2 is integer
		 * output is the sum of two digit
		 */
		while( userInput == 1) {
			System.out.print("Please Enter first number : ");
			int x = input.nextInt();
			System.out.print("Please Enter second number : ");
			int y = input.nextInt();
			int z = x + y;
			System.out.println("The addition of "+x+" and "+y+" is "+z);
			
			System.out.print(" 1 - Continue ; 0 - Exit ");
			userInput = input.nextInt();
		}
		System.out.println("Exit");
		input.close();
	}

}
