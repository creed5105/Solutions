package com.exercises.database;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;


public class EmployeeDBDAOTest {

	@Test
	public void testGetEmployees() throws DataUnavailableException {
		EmployeeDAO dao = new EmployeeDBDAO();
		List<Employee> employees = dao.getEmployees();
		assertEquals("checking employee count from db",5,employees.size())	;	
	}

}
