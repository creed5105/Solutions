package com.exercises.collections;

import java.util.Comparator;

public class HighTemperatureComparator implements
		Comparator<DailyHighLow> {

	@Override
	public int compare(DailyHighLow a, DailyHighLow b) {
		if ( a.getHighTemperature() > b.getHighTemperature() ){
			return 1;
		}
		if ( a.getHighTemperature() < b.getHighTemperature() ){
			return -1;
		}
		return 0;
	}
	
}
