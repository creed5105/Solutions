package com.exercises.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class CountLines {

	public static void main(String[] args) throws Exception {
		File file = new File("src/com/exercises/MyFirst.java");
		int numLines = countLines(file);
		System.out.println(file.getPath() + " has " + numLines + " lines");
	}

	private static int countLines(File file) throws Exception {
		BufferedReader reader = new BufferedReader(new FileReader(file));
		int numLines = 0;
		System.out.println("Counting the lines in " + file.getName());
		
		while ((reader.readLine()) != null){
			numLines++;
		}
		reader.close();
		return numLines;
	}

}

