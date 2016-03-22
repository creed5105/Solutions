package com.exercises.files;

public class CustomerRetrievalServiceMainTest {

public static void main(String[] args) {
	try {
		CustomerRetrievalService crs = new CustomerRetrievalService("Customers.txt");
		System.out.println(crs.getCustomers());
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

}


