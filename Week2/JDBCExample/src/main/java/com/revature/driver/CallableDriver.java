package com.revature.driver;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import com.revature.util.ConnectionFactory;

public class CallableDriver {

	private static Connection conn = ConnectionFactory.getConnection();
	
	public static void main(String[] args) {
		
		ResultSet rs = null;
		
		//CallableStatement call = conn.prepareCall(sql); -- used to call functions in postges and stored procs in other sql languages
		PreparedStatement call;
		try {
			conn.setAutoCommit(false);
			call = conn.prepareCall("call expensive_tracks(?, ?)");
			call.setDouble(1, 3.99);
			call.setObject(2, rs, Types.OTHER);
			
			ResultSet ret = call.executeQuery();
			
			ret.next();
			rs = (ResultSet) ret.getObject(1);
			
			while(rs.next()) {
				System.out.println("TrackTitle: " + rs.getString(1));
				System.out.println("UnitPrice: " + rs.getDouble(2));
				System.out.println("+++++++++++++++++++++++++++++++++");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			conn.setAutoCommit(true);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
