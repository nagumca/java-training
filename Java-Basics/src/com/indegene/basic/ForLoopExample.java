package com.indegene.basic;

public class ForLoopExample {
	public static void main(String[] args) {

		/* System.out.println(1 +" * "+5+" = "+(1*5));
		System.out.println(2 +" * "+5+" = "+(2*5));
		System.out.println(3 +" * "+5+" = "+(3*5));
		System.out.println(4 +" * "+5+" = "+(4*5));
		System.out.println(5 +" * "+5+" = "+(5*5)); */
		int table = 5;
		int n = 10 ;
		for(int index = 1 ; index <= n ; index++) {
			System.out.println(index +" * "+table+" = "+(index * table));
		}
		
	}
}
