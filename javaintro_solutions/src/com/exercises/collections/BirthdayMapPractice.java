package com.exercises.collections;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

public class BirthdayMapPractice {

	public static void main(String[] args) {
		Map<String, Calendar> birthdays = new HashMap<>();
		birthdays.put( "Alexander Hamilton", new GregorianCalendar(1757,0,11));
		birthdays.put( "Winston Churchill", new GregorianCalendar(1874,10,30));
		birthdays.put( "Jawaharlal Nehru", new GregorianCalendar(1889,10,14));
		birthdays.put( "Nelson Mandela", new GregorianCalendar(1918,5,18));
		birthdays.put( "Charlemagne", new GregorianCalendar(742,3,2));

		// lookup
		Calendar bday = birthdays.get("Nelson Mandela");
		DateFormat df = DateFormat.getDateInstance();
		System.out.println("Nelson Mandela was born on " + df.format(bday.getTime()));

	}

}
