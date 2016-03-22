package com.exercises;

import java.util.Random;

public class GenerateRandomEmployeeTypes {

	public static void main(String[] args) {
		String[] names = {"Angel", "Barry", "Dana", "Ed"};
		String[] employeeType = new String[names.length];
		randomlyCreateEmployeeType(employeeType);
	}

	private static void randomlyCreateEmployeeType(String[] employeeType) {
		Random random = new Random();
		for (int i = 0; i < employeeType.length; i++) {
			boolean isTrue = random.nextBoolean();
			if (isTrue) {
				employeeType[i] = "FT";
			}
			else {
				employeeType[i] = "PT";
			}
		}
	}
}
