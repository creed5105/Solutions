package com.exercises.junit;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class FullTimeEmployeeTestBeforeFinished {

	@Test
	public void testBelowAverage() {
		FullTimeEmployee ft = new FullTimeEmployee("Bob", 10_000.00);
		ft.setPerformanceReview(PerformanceReview.BELOW);
		double raise = ft.calculateRaise();
		if (raise!=1000.00) {
			fail("Not yet implemented");
		}
	}	

	@Test
	@Ignore("Average not implemented yet ")
	public void testAverage() {
		fail("Not yet implemented");	
	}	

	@Test
	@Ignore("Average not implemented yet ")
	public void testAboveAverage() {
		fail("Not yet implemented");	
	}	

}
