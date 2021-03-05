package com.indegene.basic;

public class BreakContinueExample {
	public static void main(String[] args) {
		
		/* for(int i = 1; i <= 10; i++) {
			if(i == 5) {
				break;
			}
			System.out.println("The i value is : "+i);
		} */
		
		for(int i = 1; i <= 10; i++) {
			if(i == 6) {
				continue;
			}
			System.out.println("The i value is : "+i);
		} 
		System.out.println("End of the program");
	}
}
