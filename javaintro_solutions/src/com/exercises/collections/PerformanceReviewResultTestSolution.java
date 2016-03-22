package com.exercises.collections;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


//This demo is intended to fail as practice in using enum


public class PerformanceReviewResultTestSolution {

	@Before
	public void setUp() {
		
	}
	
	@Test
	public void testDatabaseValueOfAverage() {
		PerformanceReviewResult result = PerformanceReviewResult.valueOf("AVERAGE") ;
		assertEquals("Test getting correct database code from enum type",1,result.getDatabaseCode());
	}

	@Test
	public void testDatabaseValueOfBelow() {
		PerformanceReviewResult result = PerformanceReviewResult.valueOf("BELOW") ;
		assertEquals("Test getting correct database code from enum type",2,result.getDatabaseCode());
	}

	@Test
	public void testDatabaseValueOfAbove() {
		PerformanceReviewResult result = PerformanceReviewResult.valueOf("ABOVE") ;
		assertEquals("Test getting correct database code from enum type",3,result.getDatabaseCode());
}

	
	@Test
	public void testGetBelowTypeByDBCode() {
		PerformanceReviewResult resultType = PerformanceReviewResult.getPerformanceReviewResultByDatabaseCode(1);
		assertEquals("Test getting enum type from database code",PerformanceReviewResult.BELOW,resultType);
	}

}

