package com.indegene.files;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReadExample {
	public static void main(String[] args) {
		try {
			Path pathFileToRead = Paths.get("./resources/data.txt");
			List<String> lines = Files.readAllLines(pathFileToRead);
			for(String str : lines) {
				if(str.endsWith("at")) 
					System.out.println(str);
			}
		}catch(Exception e) {
			System.err.println("Exception : "+e.toString());
		}
	}
}
