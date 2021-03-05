package com.indegene.basic;

import java.util.Scanner;

public class NestedIfExample {
	public static void main(String[] args) {
		int age ;
		int weight ;
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter your age : ");
		age = input.nextInt();
		System.out.println("Please Enter your weight : ");
		weight = input.nextInt();
		
		if ( age >= 18) {
			if( weight >= 50) {
				System.out.println("You are eligible for Blood Donation ");
			}
		}
	}
}
