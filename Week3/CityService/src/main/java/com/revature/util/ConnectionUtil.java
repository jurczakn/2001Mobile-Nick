package com.revature.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
	
	private static String url;
	
	private static String username;
	
	private static String password;
	
	private static ConnectionUtil cu;
	
	public static Connection getConnection() {
		if (cu == null) {
			cu = new ConnectionUtil();
		}
		return cu.createConnection();
	}
	
	private ConnectionUtil() {
		url = "jdbc:postgresql://" + System.getenv("POSTGRES_2001_URL") + ":5432/postgres?";
		username = System.getenv("POSTGRES_2001_USERNAME");
		password = System.getenv("POSTGRES_2001_PASSWORD");
	}
	
	private Connection createConnection() {
		Connection conn = null;
		
		try {
			conn = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return conn;
		
	}

}
