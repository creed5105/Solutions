package com.exercises.files;

import java.io.File;
import java.io.PrintWriter;
import java.util.Random;

public class WriteAthletesCSV {

	public static void main(String[] args) throws Exception {
		Random random = new Random();
		String filename = "event.csv";
		PrintWriter writer = new PrintWriter(new File(filename));
		for (int i=0; i < 5; ++i){
			int athleteNumber = random.nextInt(100);
			int numSeconds = random.nextInt(1000);
			int numPoints = random.nextInt(20);
			writer.println(athleteNumber + "," + numSeconds + "," + numPoints);
		}
		writer.close();
		
		System.out.println("Program completed successfully");
	}


}
