package com.exercises.collections;

import java.util.ArrayList;
import java.util.List;

public class WeeklyHighLowComparator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<DailyHighLow> days = new ArrayList<>();
		days.add( new DailyHighLow("Sun", 72, 94) );
		days.add( new DailyHighLow("Mon", 65, 98) );
		days.add( new DailyHighLow("Tues", 84, 89) );
		days.add( new DailyHighLow("Wed", 62, 94) );
		days.add( new DailyHighLow("Thurs", 82, 92) );
		days.add( new DailyHighLow("Fri", 78, 90) );
		days.add( new DailyHighLow("Sat", 72, 95) );
		
		// get weekly high and low
		DailyHighLow maxTempDay = days.get(0);
		DailyHighLow minTempDay = days.get(0);
		for (DailyHighLow day : days){
			if ( day.getHighTemperature() > maxTempDay.getHighTemperature() ){
				maxTempDay = day;
			}
			if ( day.getLowTemperature() < minTempDay.getLowTemperature() ){
				minTempDay = day;
			}			
		}
		System.out.println("Weekly high was on " + maxTempDay.getDay() + " temperature=" + maxTempDay.getHighTemperature());
		System.out.println("Weekly low was on " + minTempDay.getDay() + " temperature=" + minTempDay.getLowTemperature());
	}

}
