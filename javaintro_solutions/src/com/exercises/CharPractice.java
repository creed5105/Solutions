package com.exercises;

public class CharPractice {

	public static void main(String[] args) {
		System.out.println("Movies featuring \"fraternities\", fake or otherwise:") ;
		System.out.println("\tRevenge of the Nerds:\t" + '\u03BB' +  '\u03BB' + '\u03BB');
		System.out.println("\tAmerican Pie:\t\t" + '\u03B2' +  '\u0394' + '\u046E');
		
		System.out.println("These codes were used:"  );
		System.out.println("\tLamba:\t" + "\\u03BB\t" + '\u03BB'  );
		System.out.println("\tBeta: \t" + "\\u03B2\t" + '\u03B2' );
		System.out.println("\tDelta: \t" + "\\u0394\t" +  '\u0394' );
		System.out.println("\tKsi: \t" + "\\u046E\t" + '\u046E' );
	}
}
 