package com.exercises.database;

public abstract class Employee {

	
	public int getId() {
		return id;
	}

	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}

	private int id;
	private String name;
	private String employeeType;
	
	public String getEmployeeType() {
		return employeeType;
	}

	public Employee(int id, String name, String employeeType) {
		super();
		if (name == null || name.equals("")) {
			throw new IllegalArgumentException("name is required");
		}
		
		if (employeeType == null || employeeType.equals("")) {
			throw new IllegalArgumentException("employee type is required");
		}

		this.name = name;
		this.employeeType = employeeType;
	}

	public abstract double calculateMonthlyPay() ;
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
