package com.revature.driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Driver {
	
	private static final String URL = "";
	
	private static final String USERNAME = "";
	
	private static final String PASSWORD = "";

	public static void main(String[] args) {
		
		try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)){
			String sql = "create table pet ("
					+ "p_id serial primary key,"
					+ "name text,"
					+ "type text"
					+ ")";
			
			String sql2 = "insert into pet (name, type) values('walace', 'turtle')";
			
			Statement stmt = conn.createStatement();
			
			stmt.executeUpdate(sql2);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
