package com.exercises.database;


import java.util.List;


public interface EmployeeDAO {
	public List<Employee> getEmployees() throws DataUnavailableException ;
	
	public List<Employee> getPartTimeEmployees() throws DataUnavailableException ;
	
	public List<Employee> getFullTimeEmployees() throws DataUnavailableException ;
	
	public Employee getEmployeeByID(int id) throws DataUnavailableException ;
	
}


 