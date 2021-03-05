package com.indegene.oops;

public class NumberRunner {
	public static void main(String[] args) {
		MyNumber myNumber = new MyNumber(5);
		
		boolean isPrime = myNumber.isPrime();
		// 2, 3, 5 , 7 , 11 ...
		System.out.println("isPrime : "+isPrime);
		
		myNumber.printNumberTriangale();
		
	}
}
