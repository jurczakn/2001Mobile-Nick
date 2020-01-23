package com.revature.dao;

import com.revature.pojo.City;

public interface CityDAO {
	
	public void createCity(City city);
	
	public City getCityById(Integer id);

}
