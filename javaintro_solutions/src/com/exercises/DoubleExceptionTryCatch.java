package com.exercises;

public class DoubleExceptionTryCatch {
	public static void main(String[] args) {
		displaySum(args);
	}

	private static void displaySum(String[] args) {
		try {
			double d1 = new Double(args[0]);
			double d2 = new Double(args[0]);
			System.out.println("These numbers sum to " + (d1+d2));
		}
		catch(Exception e) {
			System.out.println("Either no parameter passed in, or " +
							    "non numeric data was passed in");
		}
	}
}


