package com.exercises.loans;

public class LoanPaymentExample {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Loan carLoan = new Loan("ABC123", 14000,8.75, 60);
		Loan carLoan2 = new Loan("XYZ123", 12000,5.5, 60);
		
		System.out.println(carLoan);
		
		carLoan.applyPayment(500);
		carLoan.applyPayment(50);
		
	}

}
