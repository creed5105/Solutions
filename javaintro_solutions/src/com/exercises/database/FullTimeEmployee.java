package com.exercises.database;

public class FullTimeEmployee extends Employee {

	private double salary;
	private int performanceReview;

	public FullTimeEmployee(int id, String name, double salary) throws IllegalArgumentException {
		super(id, name, "Full Time");
		if (salary < 0 ) {
			throw new IllegalArgumentException("salary cannot be negative");
		}

		this.salary = salary;
	}

	

	public void setPerformanceReview(int performanceReview) {
		this.performanceReview = performanceReview;
	}

	@Override
	public double calculateMonthlyPay() {
		// TODO Auto-generated method stub
		return salary/12;
	}

}
 

