package com.indegene.files;

import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileWriteExample {
	public static void main(String[] args) {
		writeFileContent();
		readFileContent();
	}
	private static void writeFileContent() {
		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter("./resources/info.txt");
			fileWriter.write("This is my fist file write operation \n");
			fileWriter.write("second line of the file \n");
			fileWriter.write("End of the line");
			fileWriter.close();
			System.out.println("The file operation completed");
		}catch(Exception e) {
			System.err.println("Exception : "+e.toString());
		}
	}
	private static void readFileContent() {
		try {
			Path pathFileToRead = Paths.get("./resources/info.txt");
			List<String> lines = Files.readAllLines(pathFileToRead);
			System.out.println("####### Reading the file content ::");
			for(String str : lines) {
				System.out.println(str);
			}
		}catch(Exception e) {
			System.err.println("Exception : "+e.toString());
		}
	}
}
