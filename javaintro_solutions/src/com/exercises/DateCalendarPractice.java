package com.exercises;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateCalendarPractice {

	public static void main(String[] args) {
		Date now = new Date();
		DateFormat df = 
		      DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT);
		System.out.println("It is now: " + df.format(now));
		Calendar birth = new GregorianCalendar(1990, 3, 12);
		System.out.println("I was born on: " + df.format(birth.getTime()));
		long millisecs = now.getTime() - birth.getTimeInMillis();
		System.out.println("So, I am " + millisecs + " milliseconds old");


	}

}
