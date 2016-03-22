package com.exercises.files;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

public class CustomerRetrievalService {

	//to be used if file is not found in classpath
	private final String FALLBACK_FILE = "CustomersFallback.txt";
	
	private String fileName;
	private ArrayList<Customer> customers = new ArrayList<>();
	
	public CustomerRetrievalService(String fileName) throws Exception {
		super();
		this.fileName = fileName;
		refreshCustomers();
	}
	
	public ArrayList<Customer> getCustomers() {
		return customers;
	}
	
	public void refreshCustomers() throws Exception  {
		
		ClassLoader cl = this.getClass().getClassLoader();
		URL url = cl.getResource(fileName);

		BufferedReader reader;
		try {
			reader = new BufferedReader(new InputStreamReader(url.openStream()));
		} catch (Exception e) {
			url = cl.getResource(FALLBACK_FILE);
			try {
				reader = new BufferedReader(new InputStreamReader(url.openStream()));
			} catch (IOException e1) {
				System.out.println("Backup file failed: " + FALLBACK_FILE);
				throw new Exception("Exception thrown with backup file " + FALLBACK_FILE, e1);
			}
		}
		
		String line = "";
		String cvsSplitBy = ",";
		customers = new ArrayList<>();
		
		while ((line = reader.readLine()) != null) {
		    // use comma as separator
			String[] customerData = line.split(cvsSplitBy);
			String name = customerData[0].trim();
			
			int id = Integer.parseInt(customerData[1].trim());
			String email = customerData[2].trim();
			
			customers.add(new Customer(id,name,email));
		}
		
		reader.close();
		
	}

}
