package com.exercises.database;

import java.text.DateFormat;
import java.util.Date;

public class HighLow {
	private Date date;
	private double high;
	private double low;
	public HighLow(Date date, double high, double low) {
		super();
		this.date = date;
		this.high = high;
		this.low = low;
	}
	@Override
	public String toString() {
		String ds = DateFormat.getDateInstance(DateFormat.SHORT).format(date);
		return "HighLow [date=" + ds + ", high=" + high + ", low=" + low
				+ "]";
	}
	
}
