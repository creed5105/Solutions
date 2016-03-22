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

public class HighLowQuery {

	public static void main(String[] args)  {
		ResultSet rs = null;
		PreparedStatement stmt = null;
		Connection conn = null;
		try {
			InputStream is = HighLowQuery.class.getClassLoader().getResourceAsStream("db.properties");
			Properties props = new Properties();
			props.load(is);
			Class.forName(props.getProperty("db.driver"));
			conn = DriverManager.getConnection(props.getProperty("db.url"),
					props.getProperty("db.username"),
					props.getProperty("db.password"));
			stmt = conn.prepareStatement("SELECT * from HIGHLOW WHERE high_temp > ? and low_temp < ?");
			stmt.setDouble(1, 80);
			stmt.setDouble(2, 40);
			rs = stmt.executeQuery();
			List<HighLow> results = new ArrayList<HighLow>();
			while (rs.next()){
				HighLow obj = new HighLow(rs.getDate("date_of_record"),
						rs.getDouble("high_temp"), rs.getDouble("low_temp"));
				results.add(obj);
			}
			for (HighLow obj : results){
				System.out.println(obj);
			}
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
