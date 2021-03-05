package com.indegene.oops;

import java.util.Scanner;

public class BookRunner {
	public static void main(String[] args) {
		//Set the book count using constructor

		Book objectOrientedPrograming = new Book(10);
		Book cleanCode = new Book(15);
		Book javaAdvanced = new Book(20);
		
		Scanner input = new Scanner(System.in);
		int userInput1 = 0;
		int userInput2 = 0;
		int oopBookCount = 0;
		int cleanCodeBookCount = 0;
		int javaAdvancedBookCount = 0;

		//*************Printing the initial book counts****************
		System.out.println("*************Printing the initial book count****************");
		
		do {
			System.out.println("objectOrientedPrograming book count is : " + objectOrientedPrograming.getNoOfCopies());
			System.out.println("cleanCode book count is : " + cleanCode.getNoOfCopies());
			System.out.println("javaAdvanced book count is : " + javaAdvanced.getNoOfCopies());
			
			System.out.print("Please Select the Operation - 1 : Increase Copies - 2 - Decrease Copies : ");
			userInput2 = input.nextInt();
			
			System.out.print("Please enter the count of object oriented book : ");
			oopBookCount = input.nextInt();
			System.out.print("Please enter the count of clean code book : ");
			cleanCodeBookCount = input.nextInt();
			System.out.print("Please enter the count of java advanced book : ");
			javaAdvancedBookCount = input.nextInt();
			
			switch(userInput2) {
				case 1:	//Increase the book count by calling increaseCopies method
					objectOrientedPrograming.increaseCopies(oopBookCount);
					cleanCode.increaseCopies(cleanCodeBookCount);
					javaAdvanced.increaseCopies(javaAdvancedBookCount);
					break;
				case 2: //Decrease the book count by calling decreaseCopies method
					objectOrientedPrograming.decreaseCopies(oopBookCount);
					cleanCode.decreaseCopies(cleanCodeBookCount);
					javaAdvanced.decreaseCopies(javaAdvancedBookCount);
					break;
				default:
					System.out.println("Please enter valid input");
			}

			//*****************Printing the current book counts******************
			System.out.println("*****************Printing the current book count******************");
			System.out.println("objectOrientedPrograming book count is : " + objectOrientedPrograming.getNoOfCopies());
			System.out.println("cleanCode book count is : " + cleanCode.getNoOfCopies());
			System.out.println("javaAdvanced book count is : " + javaAdvanced.getNoOfCopies());
			
			System.out.print("Do you want to continue ? 1 - continue - 0 = Exit : ");
			userInput1 = input.nextInt();
		}while(userInput1 == 1);
		System.out.println("The End of the Program");
		input.close();
	}
}
