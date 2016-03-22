package com.exercises.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SetPractice {

	public static void main(String[] args) {
		List<String> mylist = new ArrayList<>();
		mylist.add("one");
		mylist.add("two");
		mylist.add("three");
		mylist.add("four");
		mylist.add("five");
		print(mylist);
		Collections.sort(mylist);
		System.out.println("AFTER SORT:");
		print(mylist);
	}

	private static void print(List<String> mylist) {
		for (int i=0; i < mylist.size(); ++i){
			System.out.println(mylist.get(i));
		}
	}
}

