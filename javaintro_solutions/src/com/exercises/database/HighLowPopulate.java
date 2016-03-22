package com.exercises.database;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Properties;
import java.util.Random;

public class HighLowPopulate {

	public static void main(String[] args)  {
		ResultSet rs = null;
		PreparedStatement stmt = null;
		Connection conn = null;
		try {
			InputStream is = HighLowPopulate.class.getClassLoader().getResourceAsStream("db.properties");
			Properties props = new Properties();
			props.load(is);
			Class.forName(props.getProperty("db.driver"));
			conn = DriverManager.getConnection(props.getProperty("db.url"),
					props.getProperty("db.username"),
					props.getProperty("db.password"));
			stmt = conn.prepareStatement("INSERT into HIGHLOW VALUES(?,?,?)");
			Random rnd = new Random();
			
			for (int i=0; i < 100; ++i){
				Calendar date = new GregorianCalendar(2018, Calendar.JANUARY, 1);
				date.add(Calendar.DATE, i); // add these many days
				double low = rnd.nextDouble() * 50; // 0-50
				double high = low + rnd.nextDouble() * 50; // 50-100
				
				stmt.setDate(1, new java.sql.Date(date.getTime().getTime()));
				stmt.setDouble(2, high);
				stmt.setDouble(3, low);
				stmt.addBatch();
			}
			stmt.executeBatch();
			System.out.println("100 rows inserted");
		} catch (SQLException | ClassNotFoundException | IOException e){
			System.err.println(e);
			e.printStackTrace();
		} finally {
			if ( rs != null ){
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if ( stmt != null ){
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if ( conn != null ){
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
