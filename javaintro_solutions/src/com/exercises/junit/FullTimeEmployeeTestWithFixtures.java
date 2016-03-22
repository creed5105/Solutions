package com.exercises.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FullTimeEmployeeTestWithFixtures {
	final double SALARY = 10_000;
	private FullTimeEmployee ft;
	
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
	
	@Test(expected=java.lang.IllegalArgumentException.class) 
	public void negativeSalary(){
			new FullTimeEmployee("name", -10000);
	}
	
}
