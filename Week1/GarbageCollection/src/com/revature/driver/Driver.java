package com.revature.driver;

import com.revature.pojo.Planet;

public class Driver {

	public static void main(String[] args) {
		
		for (int i = 1; i < 1000000; i++) {
			new Planet("Planet: " + i);
			System.out.println("Created Planet: " + i);
			//System.gc();
		}
		
	}

}
