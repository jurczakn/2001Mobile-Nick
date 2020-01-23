package com.revature.dao;

import java.sql.Connection;
import java.sql.SQLException;

import com.revature.pojo.City;
import com.revature.util.ConnectionUtil;

public class CityPostgresDAO implements CityDAO {

	private Connection conn = ConnectionUtil.getConnection();
	
	public void createCity(City city) {
			String sql = "insert into city (name, population) values('" 
					+ city.getName() + "', " + city.getPopulation() + ")";
			try {
				conn.createStatement().executeUpdate(sql);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	public void setConn(Connection conn) {
		this.conn = conn;
	}

	@Override
	public City getCityById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
