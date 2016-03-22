package com.exercises.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HighTemperatureComparatorPractice {


	public static void main(String[] args) {
		List<DailyHighLow> days = new ArrayList<>();
		days.add( new DailyHighLow("Sun", 72, 94) );
		days.add( new DailyHighLow("Mon", 65, 98) );
		days.add( new DailyHighLow("Tues", 84, 89) );
		days.add( new DailyHighLow("Wed", 62, 94) );
		days.add( new DailyHighLow("Thurs", 82, 92) );
		days.add( new DailyHighLow("Fri", 78, 90) );
		days.add( new DailyHighLow("Sat", 72, 95) );
		
		System.out.println("******** Before Sort *******");
		printList(days);
		Collections.sort(days,new HighTemperatureComparator());		
		System.out.println("\n\n******** After Sort *******");
		printList(days);
	}

	private static void printList(List<DailyHighLow> days) {
		for (DailyHighLow dailyHighLow : days) {
			System.out.println(dailyHighLow);
		}
		
	}

}
