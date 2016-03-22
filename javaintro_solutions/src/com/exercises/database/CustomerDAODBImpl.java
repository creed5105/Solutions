package com.exercises.database;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

class CustomerDAODBImpl implements CustomerDAO {
	private Connection conn;
	
	public CustomerDAODBImpl(){
		super();
		try {
			InputStream is = EmployeeDBDAO.class.getClassLoader().getResourceAsStream("db.properties");
			Properties props = new Properties();
			props.load(is);
			Class.forName(props.getProperty("db.driver"));

			conn = DriverManager.getConnection(props.getProperty("db.url"),
					props.getProperty("db.username"),
					props.getProperty("db.password"));

		} catch (ClassNotFoundException |IOException |SQLException e) {
			e.printStackTrace();
			throw new DataUnavailableException(e);
		}
	}
	
	
	 
	public void addNewCustomer(int id, String firstname, String lastname, String email){
		String sql = "INSERT into JI_CUSTOMER(id, firstname, lastname, email) " +
	                 " VALUES ('" + 
				       id + "," + firstname + "','" +  lastname + "','" + email + "')";
		Statement stmt;
		try {
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}  
	  
	
	
	public List<Customer> getCustomers() {
		List<Customer> customers = new ArrayList<>();
		try {   
			Statement stmt = conn.createStatement();
			String sql = "SELECT id, firstname,lastname, email from " + 
			                         " JI_CUSTOMER WHERE id < 1000";
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()){
				  int id = rs.getInt("id");

				String firstName = rs.getString("firstname");      // or rs.getInt(2)
			   String lastName = rs.getString("lastname");      // or rs.getInt(2)
			   String email = rs.getString("email");      // or rs.getInt(2)

			   Customer customer = new Customer(id, firstName, lastName, email);
			   customers.add(customer);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return customers;

	}


	public List<String> getEmails() {
		List<String> emails = new ArrayList<>();
		try {
			Statement stmt = conn.createStatement();
			String sql = "SELECT email from JI_CUSTOMER ";
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()){
			   String email = rs.getString("email");      
			   emails.add(email);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return emails;
	}


	
}

 