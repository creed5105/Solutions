package com.exercises.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileHandling {

	public static void main(String[] args) throws Exception {
		File file = new File("src/com/demo/_06fileaccess/testfile.txt");
		int numLines = countLines(file);
		System.out.println(file.getPath() + " has " + numLines + " lines");
		
		File file2 = new File("src/com.demo._06fileaccess/Customers.txt");
		int numLines2 = countLines(file2);
		System.out.println(file2.getPath() + " has " + numLines2 + " lines");
		
	}
	
	@SuppressWarnings("unused")
	private static int countLines(File file) throws Exception {
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String line;
		int numLines = 0;
		while ((line = reader.readLine()) != null){
			numLines++;
		}
		reader.close();
		return numLines;
	}

}



