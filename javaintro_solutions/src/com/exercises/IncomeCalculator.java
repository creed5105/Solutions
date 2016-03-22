package com.exercises;

public class IncomeCalculator {

	public static void main(String[] args) throws Exception {
		if (! (args.length == 3) ) {
			printCorrectUsage();
			throw new IllegalArgumentException("Number of arguments is not 3") ;
		}
	
		String name = args[0];
		double hourlyRate=0.0 ;
		int numberOfHolidays=0;
	
		try {
				 hourlyRate = Double.parseDouble(args[1]);
				 numberOfHolidays = new Integer(args[2]);
		}
		catch(Exception e) {
			printCorrectUsage();
			throw new IllegalArgumentException("Invalid argument." + e.getMessage(),e) ;
		}
		
		int yearlyHours  = (40 * 52) - (12 * 8);
		double numberOfHolidayHours = (numberOfHolidays*8) ;
				
		double income = hourlyRate * (yearlyHours-numberOfHolidayHours);
		System.out.println("At an hourlyRate of " + hourlyRate + ", " +  
		                       name + " makes " + income + " per year");
	}
	
	private static void printCorrectUsage() {
		System.out.println("You must pass in name, hourly rate, and number of unpaid holidays");
	}
	

}


