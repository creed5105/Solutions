package com.exercises.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ArrayListPractice {

	public static void main(String[] args) {
		List<String> myList = new ArrayList<>();
		myList.add("two");
		myList.add("one");
		myList.add("one");
		myList.add("four");
		myList.add("three");
		myList.add("five");
		
		printList(myList);
		
		Collections.sort(myList);
		
		printList(myList);
		
	}

	private static void printList(List<String> myList) {
		for (String currentString : myList) {
			System.out.println(currentString);
		}
		
	}
	
	

	
}

