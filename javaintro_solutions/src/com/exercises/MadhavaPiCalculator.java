package com.exercises;

public class MadhavaPiCalculator {

	public static void main(String[] args) {
		// TODO (01.01): Print out the value of PI at each iteration and stop when update term within 0.01
		double epsilon = 0.01;
		if ( args.length > 0 ){
			epsilon = Double.parseDouble(args[0]);
		}
		
		double curr = 0;
		double term = 1000; // some large value so that first time passes through
		for (int k=0; Math.abs(term) > epsilon; ++k) {
			term = 4 * Math.pow(-1, k) / (2*k+1);
			curr = curr + term;
			System.out.println(k + " term= " + term + " pi=" + curr);
		}
		double pi = curr;
		System.out.println("FINAL: " + pi);
	}

}
