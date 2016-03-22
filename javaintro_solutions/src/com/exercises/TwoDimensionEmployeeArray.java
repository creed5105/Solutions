package com.exercises;

public class TwoDimensionEmployeeArray {

	public static void main(String[] args) {
		String[][] employees = new String[2][4];
		employees[0][0] = "Bob";
		employees[0][1] = "Lisa";
		employees[0][2] = "Nancy";
		employees[0][3] = "Peter";
		employees[1][0] = "FT";
		employees[1][1] = "PT";
		employees[1][2] = "FT";
		employees[1][3] = "PT";
		
		String printFullTimeMessage = "The Full time employees are: ";
		String printPartTimeMessage = "The Part time employees are: ";
		
		for (int i = 0; i < employees[0].length; i++) {
				if (  (employees[1][i]).equals("FT") ) {
					printFullTimeMessage += "\n\t" + employees[0][i];
				}
				else {
					printPartTimeMessage += "\n\t" + employees[0][i];
				}
		}
		
		System.out.println(printFullTimeMessage);
		System.out.println(printPartTimeMessage);
	}
}
