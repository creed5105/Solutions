package com.exercises;

public class JohnsIncomeOverTenYears {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double hourlyWage = 18.25;
		for (int year=1; year <= 10; ++year){
			int numHours = (40 * 52) - (12 * 8);
			double income = hourlyWage * numHours;
			if (year<4) {
				switch(year) {
				   case 1:
					   System.out.println("John makes $" + income + " in the 1st year");
					   break;
				   case 2:
					   System.out.println("John makes $" + income + " in the 2nd year");
					   break;
				   case 3:
					   System.out.println("John makes $" + income + " in the 3rd year");
					   break;
	  		   }
			}
			else {
				System.out.println("John makes $" + income + " in the " + year + "th year");
					
			}
			hourlyWage = hourlyWage * 1.04; // 4% raise for next year ...			
		}
	}

}


