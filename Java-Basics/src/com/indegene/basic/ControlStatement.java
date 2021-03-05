package com.indegene.basic;

import java.util.Scanner;

public class ControlStatement {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please Enter your name : ");
		String name = input.nextLine(); // read the value from console duing runtime 
		
		System.out.print("Please Enter your age : ");
		int age = input.nextInt();	// read the value from console duing runtime 

		if( age >= 18 ) {
			System.out.println(name+" is eligible for voting");
		}else {
			System.out.println(name+" is not eligible for voting");
		}
		
		System.out.println("This is my print statement - Line 1 ");
		System.out.print("This is my print statement - Line 2 ");
		
	}

}
