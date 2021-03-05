package com.indegene.basic;

public class ArrayExample2 {
	public static void main(String[] args) {
		Integer[] arrayVariable = { 8, 3, 2, 1, 76 }; 	//new int[5];
		System.out.println("arrayVariable.length : "+arrayVariable.length);
		for(int i = 0 ; i < arrayVariable.length ; i++) {
			System.out.println("Array index of "+i+" is "+arrayVariable[i]);
		}
		System.out.println("####### Array in Reverse");
		for(int i = arrayVariable.length-1 ; i >= 0 ; i--) {
			System.out.println("Array index of "+i+" is "+arrayVariable[i]);
		}
	}
}
