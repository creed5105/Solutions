package com.exercises.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CountLinesHandleExceptions {

	public static void main(String[] args)  {
		File file = new File("src/com/roi/MyFirst.java");
		int numLines=-1;
		try {
			numLines = countLines(file);
		} catch (DataUnavailableException e) {
			System.out.println("Data unavailable at this time");
			System.exit(-1);
		}
		System.out.println(file.getPath() + " has " + numLines + " lines");
	}

	private static int countLines(File file) throws DataUnavailableException  {
		BufferedReader reader = null;
		int numLines;
		try {
			reader = new BufferedReader(new FileReader(file));
			numLines = 0;
			System.out.println("Counting the lines in " + file.getName());
			
			while ((reader.readLine()) != null){
				numLines++;
			}
		} catch (Exception e) {
			throw new DataUnavailableException("Your file could not be accessed at this time");
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return numLines;
	}

}
 
