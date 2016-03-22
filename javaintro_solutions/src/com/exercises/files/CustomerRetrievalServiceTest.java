package com.exercises.files;

import java.util.ArrayList;

import static org.junit.Assert.*;

import org.junit.Test;


public class CustomerRetrievalServiceTest {

	final String GOOD_TEST_FILE_NAME = "Customers.txt";
	final String BAD_TEST_FILE_NAME = "IDontExist.txt";
	
	
	@Test
	public void testGetCustomersGoodFile() {
		
		CustomerRetrievalService crs;
		try {
			crs = new 
					CustomerRetrievalService(GOOD_TEST_FILE_NAME);
			ArrayList<Customer> customers = crs.getCustomers();
			assertEquals(customers.size(),2) ;
			
			
		} catch (Exception e) {
			fail("Threw Exception on good file name" + 
					GOOD_TEST_FILE_NAME );
		}
	}
	 
	@Test 
	public void testGetCustomersBadFile() {
		
		CustomerRetrievalService crs;
		try {
			crs = new CustomerRetrievalService(BAD_TEST_FILE_NAME);
			ArrayList<Customer> customers = crs.getCustomers();
			//it should have used the backup and retrieved 3 customers
			assertEquals(customers.size(),2) ;
			
			boolean isBackUpCustomerInList = customers.contains
				(new Customer(123456,"Jane Doe Fallback","jane@email.com"));
			
			assertTrue("Checking that customer is in List",
										isBackUpCustomerInList);
			
		} catch (Exception e) {
			e.getMessage();
			e.printStackTrace();
			fail("Threw Exception with backup file ");
		}
	}
	 

}
