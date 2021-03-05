package com.indegene.basic;

import java.util.Scanner;

public class IfElseLadderExample {
	public static void main(String[] args) {
		// Calculate the Grade from the provided mark(Integer).
		int mark;
		String grade = "" ;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the Student mark : ");
		mark = input.nextInt();
		if(mark >= 0 ) {
			if( mark < 35 ) {
				grade = "F";
			}else if (  mark < 50 ) {
				grade = "C";
			}else if (  mark < 60 ) {
				grade = "B" ;
			}else if (  mark < 80 ) {
				grade = "A";
			}else if (  mark >= 80 ) {
				grade = "D";
			}
		}else {
			grade = "Invalid input";
		}
		System.out.println("The Grade is "+grade);
		
	}

}
