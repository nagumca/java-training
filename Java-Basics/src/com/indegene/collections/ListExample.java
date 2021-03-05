package com.indegene.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListExample {

	public static void main(String[] args) {
		
		List<String> words = List.of("Apple","Cat","Bat");	// immutable
		List<Integer> numbers = List.of(10,15,20);
		
		List<String> wordsAL = new ArrayList<String>(words);	// mutable
		List<String> wordsLL = new LinkedList<String>(words);	// Assignment  LinkedListEx.java
		List<String> wordsVector = new Vector<String>(words);	// Assignment	VectorEx.java
		
		System.out.println("Initital Value : "+wordsAL);
		
		wordsAL.add("Elephant");
		wordsAL.add("Apple");
		wordsAL.add(1,"Orange");
		
		System.out.println("After add into AL : "+wordsAL);
		System.out.println("Size : "+wordsAL.size());
		
		wordsAL.remove("Elephant");
		System.out.println("After remove from AL : "+wordsAL);
		
		System.out.println("Get value : "+wordsAL.get(1));
		
		/* System.out.println("Normal for loop");
		for(int i = 0; i <= wordsAL.size() -1 ; i++ ) {
			System.out.println(wordsAL.get(i));
		} */
		System.out.println("for each loop");
		for(String word : wordsAL) {	// for each loop work with collections
			//System.out.print(word+"   ");
			if( word.endsWith("at"))
				System.out.println(word+"   ");
		}
		System.out.println();
		System.out.println("Iterator Output : ");
		Iterator<String> iterator = wordsAL.iterator();
		while(iterator.hasNext()) {
			if(iterator.next().endsWith("at")) {
				iterator.remove();
			}
		}
		System.out.println("Output after remove the data : "+wordsAL);
	}

}
