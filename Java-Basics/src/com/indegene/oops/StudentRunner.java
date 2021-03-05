package com.indegene.oops;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentRunner {

	public static void main(String[] args) {
		
		List<Student> studentAL = new ArrayList<>();
		
		studentAL.add(new Student(100, "Ram"));
		
		Student student1 = new Student(200,"Ajay");
		studentAL.add(student1);
		studentAL.add(new Student(50,"Vijay"));
		studentAL.add(new Student(75,"Rahul"));
		
		System.out.println(studentAL);
		
		/* for(Student student : studentAL) {
			System.out.println(student);
		} */
		
		Collections.sort(studentAL);
		System.out.println("After Sorting : "+studentAL );

	}

}
