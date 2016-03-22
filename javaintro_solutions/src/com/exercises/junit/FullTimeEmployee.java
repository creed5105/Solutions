package com.exercises.junit;

public class FullTimeEmployee {

	private String name;
	private double salary;
	private int performanceReview;

	public FullTimeEmployee(String name, double salary) throws IllegalArgumentException {
		if (name == null || name.equals("")) {
			throw new IllegalArgumentException("name is required");
		}

		if (salary <= 0 ) {
			throw new IllegalArgumentException("salary cannot be negative");
		}

		
		this.setName(name);
		this.salary = salary;
	}

	public double calculateRaise() {
		double raise = 0.0;
		
		switch(performanceReview) {
		case PerformanceReview.BELOW:
			raise = 0.1 * salary;
			salary += raise;
			return (raise);
		case PerformanceReview.AVERAGE:
			raise = 0.3 * salary;
			salary += raise;
			return (raise);
		case PerformanceReview.ABOVE:
			raise = 0.5 * salary;
			salary += raise;
			return (raise);
		default:
			return 0;
		}
		
		
		
	}

	public void setPerformanceReview(int performanceReview) {
		this.performanceReview = performanceReview;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
 

