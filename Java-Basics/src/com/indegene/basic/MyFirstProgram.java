package com.indegene.basic;

public class MyFirstProgram {
	public static void main(String args[]) {
		System.out.println("This is my first program");
		
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		int i = 0;
		int j = 5;
		boolean flag = true ;
		String str = "";
		
		int x, y , z  ;
		i++;  // i = i + 1 			value =1 
		//i--;	// i = i - 1		value =0 
		
		j+=10;	// j = j + 2 
		
		System.out.println("Assignment Operator Output : "+j);
		
		if ( i == 0  ) {
			System.out.println("value is zero : "+i);
		}else {
			System.out.println("value is non-zero : "+i);
		}
		
		if ( j >= 20 ) {
			System.out.println("J value is greater than 20");
		}else {
			System.out.println("J value is lesser than 20");
		}
		
		str = ( i == 0 ? "value is zero : "+i : "value is non-zero : "+i ) ;	// ? :
		
		System.out.println("Ternary Operator Output : "+str);
		
		// int a,b,c;
		a = 20 ;	// assignment
		b = 10 ;
		c = a + b ;	
		d = a - b ;
		e = a * b ;
		f = a / b ;
		System.out.println("Addition : "+c);
		System.out.println("Substraction : "+ d);
		System.out.println("Multiplication : "+ e);
		System.out.println("Division : "+f);
		

	}
}
