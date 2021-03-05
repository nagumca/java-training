package com.indegene.basic;

import java.util.Scanner;

public class SwitchCaseExample {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter number ( 1 - 5 ) : ");
		int number = input.nextInt();
		
		switch(number) {
			case 1 :
				System.out.println("ONE");
				break;
			case 2 :
				System.out.println("TWO");
				break;
			case 3 :
				System.out.println("THREE");
				break;
			case 4 :
				System.out.println("FOUR");
				break;
			case 5 :
				System.out.println("FIVE");
				break;
			default :
				System.out.println("Please enter number between 1 to 5 ");
		}

	}

}
