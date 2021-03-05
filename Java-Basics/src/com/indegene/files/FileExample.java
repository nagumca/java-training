package com.indegene.files;

import java.io.File;
import java.util.Scanner;

public class FileExample {

	public static void main(String[] args) {
		Scanner input = null;
		try {
			File file = new File("./resources/data.txt");
			input = new Scanner(file);
			while(input.hasNext()) {
				System.out.println(input.next());
			}
		}catch(Exception e) {
			System.err.println("Exception : "+e.toString());
		}finally {
			if(input != null) input.close();
		}
	}
}
