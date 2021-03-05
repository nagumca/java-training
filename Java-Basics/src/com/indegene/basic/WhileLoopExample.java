package com.indegene.basic;

public class WhileLoopExample {
	public static void main(String[] args) {
		int table = 5;
		int n = 10 ;
		
		/* for(int index = 1 ; index <= n ; index++) {
			System.out.println(index +" * "+table+" = "+(index * table));
		} */
		
		int index = 1 ;
		while(index <= n) {
			System.out.println(index +" * "+table+" = "+(index * table));
			index++;
		}
		
	}
}
