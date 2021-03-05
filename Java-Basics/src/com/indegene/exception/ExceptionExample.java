package com.indegene.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		division();
		stringOperation();
	}
	private static void division() {
		Scanner input = new Scanner(System.in);
		try {
			System.out.print("Enter number 1 : ");
			int a = input.nextInt();
			System.out.print("Enter number 2 : ");
			int b = input.nextInt();
			int output = a / b ;
			System.out.println("Division Output : "+output);
			String str = null ;	//"qa-team"
			System.out.println("length of string : "+str.length());
		} catch(InputMismatchException e) {
			System.err.println("InputMismatchException in division method : "+e.toString());
		} catch(ArithmeticException e) {
			System.err.println("ArithmeticException in division method : "+e.toString());
		} catch(Exception e) {
			System.err.println("Excpetion in division method : "+e.toString());
			// e.printStackTrace();
		}finally {
			input.close();
			System.out.println("finally block");
		}
		System.out.println("division Method End here");
	}
	private static void stringOperation() {		// declaration of the method
		String str = "indegene";							// Definition of the method
		System.out.println("String Length : "+str.length());
		System.out.println("stringOperation Method End here");
	}
	// morningStatusCall	- what are all the task to be taken
	// eveningStatusCall	- what are all the task completed

}
