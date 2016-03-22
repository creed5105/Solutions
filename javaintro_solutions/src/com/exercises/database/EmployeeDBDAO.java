package com.exercises.database;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class EmployeeDBDAO implements EmployeeDAO {

	Connection conn = null;	

	public EmployeeDBDAO() throws DataUnavailableException {
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

	@Override
	public List<Employee> getEmployees() throws DataUnavailableException {
			String sql = "SELECT id, name,employee_type,salary,hourly_rate," + 
						 " hours_for_month from JI_EMPLOYEE ";
			return getEmployeesIntoList(sql);
	}

	@Override
	public List<Employee> getPartTimeEmployees()
			throws DataUnavailableException {
			String sql = "SELECT id, name,employee_type,salary,hourly_rate,hours_for_month from JI_EMPLOYEE where employee_type='PT' ";
			return getEmployeesIntoList(sql);
	}

	@Override
	public List<Employee> getFullTimeEmployees()
			throws DataUnavailableException {
		String sql = "SELECT id, name,employee_type,salary,hourly_rate,hours_for_month from JI_EMPLOYEE  where employee_type=\'FT\'  ";
		return getEmployeesIntoList(sql);
	}


	private List<Employee> getEmployeesIntoList(String query) throws DataUnavailableException {

		List<Employee> employees = new ArrayList<>();
		
	//	System.out.println("**** CHECKING *****\n" + query);
		
		ResultSet rs = null;
		PreparedStatement stmt = null;
		try {
			stmt = conn.prepareStatement(query);
			rs = stmt.executeQuery(query);

			while (rs.next()){
				int id = rs.getInt("id");
				String name = rs.getString("name");      
				String employeeType = rs.getString("employee_type");

				if (employeeType.equals("FT")) {
					double salary = rs.getDouble("salary");
					employees.add(new FullTimeEmployee(id, name,salary));
				}
				else if (employeeType.equals("PT")) {
					double hourlyRate = rs.getDouble("hourly_Rate");
					double hours = rs.getDouble("hours_for_month");
					employees.add(new PartTimeEmployee(id, name,hourlyRate,hours));
				}
			}
		} catch (SQLException e) {
			System.err.println("Issue with query " + query);
			throw new DataUnavailableException(e);
		}
			return employees;
		}



		@Override
		public Employee getEmployeeByID(int id) throws DataUnavailableException {
			// TODO Auto-generated method stub
			return null;
		}



	}
