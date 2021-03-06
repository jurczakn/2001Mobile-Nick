package com.revature.test;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;
import org.postgresql.core.BaseStatement;

import com.revature.dao.CityPostgresDAO;
import com.revature.pojo.City;
import com.revature.util.ConnectionUtil;

@RunWith(MockitoJUnitRunner.class)
public class CityPostgresDAOTest {
	
	private CityPostgresDAO cityDao = new CityPostgresDAO();
	
	private City city;
	
	@Mock
	private Connection conn;
	
	@Spy
	private Statement stmt = ConnectionUtil.getConnection().createStatement();

	@Spy
	private PreparedStatement findStmt = ConnectionUtil.getConnection().prepareStatement("select * from city where city_id = ?");
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
		when(conn.createStatement()).thenReturn(stmt);
		
		cityDao.setConn(conn);
		
		city = new City();
		
	}

	@After
	public void tearDown() throws Exception {
		
		ConnectionUtil.getConnection().createStatement().executeUpdate("truncate table city");
		
	}

	@Test
	public void createCity() throws SQLException {
		city.setName("Chicago");
		city.setPopulation(27000000);
		cityDao.createCity(city);
		
		verify(stmt).executeUpdate("insert into city (name, population) values('Chicago', 27000000)");
		
	}
	
	@Test
	public void testGetCityById() throws SQLException{
		when(conn.createStatement()).thenReturn(findStmt);
		
	}
	
	public CityPostgresDAOTest() throws SQLException {
		super();
	}

}
