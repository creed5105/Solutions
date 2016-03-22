package com.exercises.collections;

import java.util.Comparator;

public class DailyHighLow {
	private String day;
	private double lowTemperature;
	private double highTemperature;
	public DailyHighLow(String day, double lowTemperature, double highTemperature) {
		super();
		this.day = day;
		this.lowTemperature = lowTemperature;
		this.highTemperature = highTemperature;
	}
	public String getDay() {
		return day;
	}
	public double getHighTemperature() {
		return highTemperature;
	}
	public double getLowTemperature() {
		return lowTemperature;
	}
	@Override
	public String toString() {
		return "DailyHighLow: "+ day + " low=" + lowTemperature +
				" high=" + highTemperature;
	}


	public static class InnerHighTemperatureComparator implements
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


}
