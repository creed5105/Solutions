package com.exercises.collections;

public enum PerformanceReviewResult {
			BELOW(1, "Employee does not meet expectations"), 
			AVERAGE(2, "Employee meets expectations"), 
			ABOVE(3,"Employee exceeds expectations");

	private int databaseCode;
	private String message;

	private PerformanceReviewResult(int databaseCode, String message) {
		this.databaseCode = databaseCode;
		this.message=message;
	}
	
	public int getDatabaseCode() {
		return databaseCode;
	}

	public String getMessage() {
		return message;
	}

	public static PerformanceReviewResult getPerformanceReviewResultByDatabaseCode(int code) {
		for (PerformanceReviewResult result : values()) {
			if (result.getDatabaseCode()==code) {return result;}
		}
		throw new IllegalArgumentException("Unknown database code" + code);
	}


	
}
  