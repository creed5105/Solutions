package com.exercises;

public class MathPracticeWithInputs {

	public static void main(String[] args) {

		int upperLimitInput = Integer.parseInt(args[0]);
		
		printRoundedRandomWithLimit(upperLimitInput);
	}
	
	private static void printRoundedRandomWithLimit(int upperLimit) 
	
	{
		double x = Math.random()*upperLimit;
		System.out.println("In printRoundedRandomWithLimit: " +
		                       "Random double value 0-" +upperLimit + " is " + x);
		x = Math.round(x);
		System.out.println("In printRoundedRandomWithLimit: Rounded double value is " + x);
	}

}






