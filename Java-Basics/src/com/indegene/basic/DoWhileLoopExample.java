package com.indegene.basic;

import java.util.Scanner;

public class DoWhileLoopExample {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int userInput;
		do{
			System.out.print("Please Enter first number : ");
			int x = input.nextInt();
			System.out.print("Please Enter second number : ");
			int y = input.nextInt();
			int z = x + y;
			System.out.println("The addition of "+x+" and "+y+" is "+z);
			
			System.out.print("Do you want to Continue ?  1 - Continue ; 0 - Exit : ");
			userInput = input.nextInt();
		}while( userInput == 1);
		System.out.println("Exit");
		input.close();
	}

}
