package com.exercises.loans;

public class LoanCreationExample {

	public static void main(String[] args) {
		Loan carLoan = new Loan("ABC123", 14000,8.75, 60);
		Loan carLoan2 = new Loan("ABC123", 14000,8.75, 60);
		
		System.out.println(carLoan);
		System.out.println(carLoan2);
		
		System.out.println(carLoan==carLoan2);
		System.out.println(carLoan.equals(carLoan2));
	}
}
