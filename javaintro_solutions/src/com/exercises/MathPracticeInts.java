package com.exercises;

public class MathPracticeInts {

	public static void main(String[] args) {
		double x, y;
		
		x = Math.random()*50;
		System.out.println("In Main: Random double value 0-50 is " + x);

		int newX = (int) x;
		System.out.println("In Main: int value is " + newX);
		
		x = Math.round(x);
		System.out.println("In Main: Rounded double value is " + x);
		
		
		y = Math.random()*100;
		System.out.println("In Main: Random double value 0-100 is " + y);
	
		int newY = (int) y;
		System.out.println("In Main: int value is " + newY);

		
		y = Math.round(y);
		System.out.println("In Main: Rounded double value is " + y);
	}
}

	