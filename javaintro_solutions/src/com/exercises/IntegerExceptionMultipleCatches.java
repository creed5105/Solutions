package com.exercises;

public class IntegerExceptionMultipleCatches {

	public static void main(String[] args) {
		try {
			int i1 = new Integer(args[0]);
			int i2 = new Integer(args[1]);
			System.out.println("The sum is: " + (i1 + i2));
		}
		catch(NumberFormatException e) {
			System.out.println("Invalid Usage:" + e.getMessage());
			System.out.println("Please pass in int values");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Usage: You must pass in two "
					          + "int values via command line arguments");
		}

	}

}
 