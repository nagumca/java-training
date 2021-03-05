package com.indegene.basic;

import java.util.Scanner;

public class SwitchCaseCharExample {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter character : ");
		String str = input.nextLine();
		char ch = str.charAt(0);
		
		switch(ch) {
			case 'a':
				System.out.println("Vowvels");
				break;
			case 'b':
				System.out.println("Consonant");
				break;
			default:
				System.out.println("Please input a or b");
		}
		input.close();
	}

}
