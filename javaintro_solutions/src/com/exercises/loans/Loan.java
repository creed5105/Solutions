package com.exercises.loans;

import java.text.NumberFormat;

public class Loan {

	private String loanNumber;
	private double principal;
	private double interestRate;
	private int monthsLeft;
	
	public Loan(String loanNumber, double principal, double interestRate,
			int monthsLeft) {
		super();
		this.loanNumber = loanNumber;
		this.principal = principal;
		this.interestRate = interestRate;
		this.monthsLeft = monthsLeft;
	}
	public String getLoanNumber() {
		return loanNumber;
	}
	public double getPrincipal() {
		return principal;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public int getMonthsLeft() {
		return monthsLeft;
	}
	
	public void applyPayment(double amount){
		   double monthlyInterest = principal * interestRate / 1200;
		   double principalPayment = amount - monthlyInterest;
		   principal -= principalPayment;
		   monthsLeft --;
		   
		   System.out.println(this.toString());

	}
	
	@Override
	public String toString() {
		
		NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
		      
		return "The loan is for " + currencyFormat.format(principal)
				+ ", interestRate=" + (interestRate) + ", monthsLeft="
				+ monthsLeft ;
	}  
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(interestRate);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result
				+ ((loanNumber == null) ? 0 : loanNumber.hashCode());
		result = prime * result + monthsLeft;
		temp = Double.doubleToLongBits(principal);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Loan other = (Loan) obj;
		if (Double.doubleToLongBits(interestRate) != Double
				.doubleToLongBits(other.interestRate))
			return false;
		if (loanNumber == null) {
			if (other.loanNumber != null)
				return false;
		} else if (!loanNumber.equals(other.loanNumber))
			return false;
		if (monthsLeft != other.monthsLeft)
			return false;
		if (Double.doubleToLongBits(principal) != Double
				.doubleToLongBits(other.principal))
			return false;
		return true;
	}
	
	
	
	
	
}
