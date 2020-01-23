package com.revature.service;

import com.revature.dao.CityDAO;
import com.revature.dao.CityPostgresDAO;
import com.revature.pojo.City;

public class CityServiceImpl implements CityService {
	
	private static CityDAO cityDao = new CityPostgresDAO();
	
	public void setCityDao (CityDAO cityDao) {
		this.cityDao = cityDao;
	}

	@Override
	public void makeCity(City city) {
		cityDao.createCity(city);
	}

	@Override
	public City findCityById(Integer id) {
		return cityDao.getCityById(id);
	}

}
