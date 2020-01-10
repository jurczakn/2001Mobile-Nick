package com.revature.driver;

import com.revature.dao.MapDAO;
import com.revature.dao.MapDAOSerialization;
import com.revature.pojo.Map;

public class Driver {

	private static MapDAO mDao = new MapDAOSerialization();

	public static void main(String[] args) {

		//Map myMap = new Map(null, 778.3, 2329.2, "New York");
		//mDao.createMap(myMap);
		System.out.println(mDao.readMap("New York"));
		System.out.println("ok");
	}

}
