package com.exercises.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class FullTimeEmployeeTest {
	@Test
	public void testBelowAverage() {
		FullTimeEmployee ft = new FullTimeEmployee("Bob", 10_000.00);
		ft.setPerformanceReview(PerformanceReview.BELOW);
		double raise = ft.calculateRaise();
		assertEquals( "Raise is not correct value", 1000.0, raise, 0);	
	}	 

	@Test 
	public void testAverage() {
		FullTimeEmployee ft = new FullTimeEmployee("Bob", 10_000.00);
		ft.setPerformanceReview(PerformanceReview.AVERAGE);
		double raise = ft.calculateRaise();
		assertEquals( "Raise is not correct value", 3000.0, raise, 0);	
	}

	@Test
	public void testAboveAverage() {
		FullTimeEmployee ft = new FullTimeEmployee("Bob", 10_000.00);
		ft.setPerformanceReview(PerformanceReview.ABOVE);
		double raise = ft.calculateRaise();
		assertEquals( "Raise is not correct value", 5000.0, raise, 0);	
	}
}
 