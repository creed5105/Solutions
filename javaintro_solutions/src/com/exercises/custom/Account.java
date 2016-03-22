package com.exercises.custom;

import java.text.NumberFormat;
import java.util.Arrays;

public class Account implements Comparable {

	private String name;
	private double balance;

	public Account(String name, double balance) {
		this.setName(name);
		this.setBalance(balance);
	}

	public static void main(String[] args) {
		Account[] accounts = {
				new Account("Slavica Ecclestone", 1_000_000_000.0) ,
				new Account("George Lucas", 4_000_000_000.0  ) ,
				new Account("Oprah Winfrey",3_000_000_000.0) ,
				new Account("JK Rowling", 1_000_000_000.0) 
		};
		
		Arrays.sort(accounts);
		
		NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
		
		for (Account account : accounts) {
			System.out.println(account.getName() + " " + 
		                       currencyFormatter.format(account.getBalance()));
		}
	}

	@Override
	public int compareTo(Object otherObject) {
		Account otherAccount = (Account) otherObject;
		double difference = balance - otherAccount.balance;
		if (difference!=0){
			return (int) difference; 
		}
		
		int x = name.compareTo(otherAccount.name);
		return x;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	
}

//public String getName() {
//	return this.name;
//}
//		@Override
//		public int compareTo(Object otherObject) {
//			Account otherAccount = (Account) otherObject;
//			double difference = balance - otherAccount.balance;
//			if (difference!=0){
//				return (int) difference; 
//			}
//			
//			int x = name.compareTo(otherAccount.name);
//			return x;
//			
//		}
//
//		public double getBalance() {
//			return balance;
//		}
//
//		public void setBalance(double balance) {
//			this.balance = balance;
//		}
//
//
//
//}


/*
 * 
 * 	private double balance;
		private String name;

		public Account(String name, double balance) {
			this.name = name;
			this.setBalance(balance);
	    } */
 


