package com.exercises.collections;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class DailyHighLowTestComparatorTests {
	List<DailyHighLow> dailyRecords = new ArrayList<>();
	
	@Before
	public void setUp() {
		//adding day, low, high temps
		dailyRecords.add( new DailyHighLow("Sun", 22, 34) );
		dailyRecords.add( new DailyHighLow("Mon", 25, 40) );
		dailyRecords.add( new DailyHighLow("Tues", 18, 19) );
		dailyRecords.add( new DailyHighLow("Wed", 12, 34) );
		dailyRecords.add( new DailyHighLow("Thurs", 17, 32) );
		dailyRecords.add( new DailyHighLow("Fri", 28, 30) );
		dailyRecords.add( new DailyHighLow("Sat", 20, 35) );
	}
	
	@Test
	public void testLowestHighTempIsFirst() {
		Collections.sort(dailyRecords, 
				               new HighTemperatureComparator());
		assertEquals("Wrong day found",
				     "Tues",
				     dailyRecords.get(0).getDay());
	}
	
	@Test 
	public void testHighestHighTempIsLast() {
		Collections.sort(dailyRecords, new DailyHighLow.InnerHighTemperatureComparator());
		assertEquals("Wrong day found","Mon",dailyRecords.get(6).getDay());
	}
	

	
	@Test
	public void testHighestLowTempIsLast() {
		Collections.sort(dailyRecords, new DailyHighLow.InnerHighTemperatureComparator());
		assertEquals("Wrong day found","Mon",dailyRecords.get(6).getDay());
	}
	
	@Test
	public void testLowestLowTempIsFirst() {
		Collections.sort(dailyRecords, new Comparator<DailyHighLow>() {
			@Override
			public int compare(DailyHighLow a, DailyHighLow b) {
				if ( a.getLowTemperature() > b.getLowTemperature() ){
					return 1;
				}
				if ( a.getLowTemperature() < b.getLowTemperature() ){
					return -1;
				}
				return 0;
			}
		}
		
				
		);
		assertEquals("Wrong day found","Wed",dailyRecords.get(0).getDay());
	}
	

	
	
	

}
