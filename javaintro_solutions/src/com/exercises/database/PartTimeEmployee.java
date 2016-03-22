package com.exercises.database;

public class PartTimeEmployee extends Employee implements Payable {
	private double hourlyRate, hoursForMonth;
	
	//constructors
	public PartTimeEmployee(int id, String name, double hourlyRate, double hoursForMonth) {
			super(id, name, "Part Time");
			this.hourlyRate = hourlyRate;
			this.hoursForMonth = hoursForMonth;
	}
	
	public PartTimeEmployee(int id, String name, double hourlyRate) {
			this(id, name,hourlyRate,0);
	}
	
	
	@Override
	public double calculateMonthlyPay() {
		// TODO Auto-generated method stub
		return (hoursForMonth * hourlyRate );
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public double getHoursForMonth() {
		return hoursForMonth;
	}

}
