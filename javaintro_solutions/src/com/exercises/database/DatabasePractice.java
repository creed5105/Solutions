package com.exercises.database;

import java.util.List;

public class DatabasePractice {

	public static void main(String[] args) {
		List<String> emails = new CustomerDAODBImpl().getEmails();
		
		for (String email : emails) {
			System.out.println(email);
		}

	}

}
