package com.exercises;

import java.util.*;

public class ObjectPolymorphism {
	public static void main(String[] args) {
		Object obj1 = new Object();
		System.out.println(obj1.toString());
		
		obj1 = new String("hello");
		System.out.println(obj1.toString());
		
		obj1 = new Date();
		System.out.println(obj1.toString());
		
		obj1 = new GregorianCalendar();
		System.out.println(obj1.toString());
		
		
	}
}


