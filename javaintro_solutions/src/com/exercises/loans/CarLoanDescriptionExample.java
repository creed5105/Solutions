package com.exercises.loans;

public class CarLoanDescriptionExample {
	public static void main(String[] args) {
		CarLoan carLoan = new CarLoan("Dodge", "Viper", "XYZ998",84885,9.3,60 );
		System.out.println(carLoan);
		carLoan.applyPayment(400);
	}
}


