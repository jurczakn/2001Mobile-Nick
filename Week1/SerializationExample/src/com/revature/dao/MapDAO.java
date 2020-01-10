package com.revature.dao;

import com.revature.pojo.Map;

public interface MapDAO {
	
	public void createMap(Map m);
	
	public Map readMap(String caption);

}
