package com.exercises;

public class MathPracticeDoublesWithHelperMethods {

	public static void main(String[] args) {
		
		printRoundedRandomWithLimit(50);
		printRoundedRandomWithLimit(100);
	}
	
	private static void printRoundedRandomWithLimit(int upperLimit) 
	
	{
		double x = Math.random()*upperLimit;
		System.out.println("In printRoundedRandomWithLimit: Random double value 0-" +upperLimit + " is " + x);
		x = Math.round(x);
		System.out.println("In printRoundedRandomWithLimit: Rounded double value is " + x);
	}

}

  


