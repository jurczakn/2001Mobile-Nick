package com.revature.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.revature.dao.CityDAO;
import com.revature.pojo.City;
import com.revature.service.CityServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class CityServiceImplTest {
	
	private City city;
	
	private CityServiceImpl cityService = new CityServiceImpl();
	
	@Mock
	CityDAO cityDao;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
		city = new City();
		cityService.setCityDao(cityDao);
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMakeCity() {
		
		city.setName("Orlando");
		city.setPopulation(36000000);
		cityService.makeCity(city);
		verify(cityDao).createCity(city);
		
	}
	
	@Test
	public void testFindCityById() {
		
		city.setName("New York");
		city.setPopulation(10000000);
		
		when(cityDao.getCityById(5)).thenReturn(city);
		
		
		assertEquals("Should return New York", city, cityService.findCityById(5));
		
	}

}
