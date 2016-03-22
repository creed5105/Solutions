package com.exercises.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FullTimeEmployeeTestExceptions {
	final double SALARY = 10_000;
	private FullTimeEmployee ft;

	@Test
	public void testNegativeSalary() {
		try {
			new FullTimeEmployee("Nancy", -10);
			fail("Should not have reached here, salary is negative");
		}
		catch(IllegalArgumentException e) {
			assertTrue(e.getMessage().equals("salary cannot be negative"));
		}
	}	

	@Test
	public void testInvalidNameInput() {
		try {
			new FullTimeEmployee("", 100_000);
			fail("Should not have reached here, name is empty String");
		}
		catch(IllegalArgumentException e) {
			assertTrue(e.getMessage().equals("name is required"));
		}
		try {
			new FullTimeEmployee(null, 100_000);
			fail("Should not have reached here, name is null");
		}
		catch(IllegalArgumentException e) {
			assertTrue(e.getMessage().equals("name is required"));
		}
	}

	@Before
	public void setUp() {
		ft = new FullTimeEmployee("Bob",SALARY );
	} 

	@After
	public void tearDown() {
		ft = null;
	}



	@Test
	public void testBelowAverage() {
		ft.setPerformanceReview(PerformanceReview.BELOW);
		double raise = ft.calculateRaise();
		assertEquals( "Raise is not correct value", 1000.0, raise,0.0);	
	}	

	@Test
	public void testAverage() {
		ft.setPerformanceReview(PerformanceReview.AVERAGE);
		double raise = ft.calculateRaise();
		assertEquals( "Raise is not correct value", 3000.0, raise,0.0);	
	}

	@Test
	public void testAboveAverage() {
		ft.setPerformanceReview(PerformanceReview.ABOVE);
		double raise = ft.calculateRaise();
		assertEquals( "Raise is not correct value", 5000.0, raise,0.0);	
	}

	@Test public void negativeSalary(){
		try{
			new FullTimeEmployee("name", -10000);
			fail("Should have thrown IllegalArgumentException");
		} catch (IllegalArgumentException e){
			assertTrue(e.getMessage().equals("salary cannot be negative"));
		}
	}



}
