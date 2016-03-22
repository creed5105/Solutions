package com.exercises.database;

import java.util.List;

public interface CustomerDAO {
	public void addNewCustomer(int id, String firstName,String lastName, String email);
	    
	public List<Customer> getCustomers() ;
		
	
}
