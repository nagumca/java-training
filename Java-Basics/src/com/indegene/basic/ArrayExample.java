package com.indegene.basic;

import java.util.Arrays;
import java.util.Collections;

public class ArrayExample {
	public static void main(String[] args) {
		int a = 10;
		// int var = null;
		// Integer varWrapper = null;
		Integer[] arrayVariable = { 3, 2, 8, 7, 5 }; 	//new int[5];
		System.out.println("arrayVariable.length : "+arrayVariable.length);
		for(int i = 0 ; i < arrayVariable.length ; i++) {
			System.out.println("Array index of "+i+" is "+arrayVariable[i]);
		}
		Arrays.sort(arrayVariable);
		System.out.println("################### After Sorting the Array");
		for(int i = 0 ; i < arrayVariable.length ; i++) {
			System.out.println("Array index of "+i+" is "+arrayVariable[i]);
		}
		
		Arrays.sort(arrayVariable,Collections.reverseOrder());
		System.out.println("################### After Sorting the Array in Reverse order");
		for(int i = 0 ; i < arrayVariable.length ; i++) {
			System.out.println("Array index of "+i+" is "+arrayVariable[i]);
		}
		
	}
}
