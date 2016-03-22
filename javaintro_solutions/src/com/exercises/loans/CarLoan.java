package com.exercises.loans;

public class CarLoan extends Loan {

	String carMake;
	String carModel;
	
	public CarLoan(String make, String model, String loanNumber, double principal, double interestRate,
			int monthsLeft) {
		
		super(loanNumber, principal, interestRate, monthsLeft);
		this.carMake = make;
		this.carModel = model;
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "This is a loan for a " + carMake + " " + carModel + ". " + super.toString();
	}
	
	

}
