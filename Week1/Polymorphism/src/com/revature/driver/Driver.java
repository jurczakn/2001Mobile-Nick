package com.revature.driver;

public class Driver {
	
	public static void main(String[] args) {
		
		Driver driver = new Driver();
		
		int x = 27;
		
		int y = 39;
		
		int z = -9;
		
		System.out.println(driver.sum(x, y));
		
		System.out.println(driver.sum(x,  y, z));
		
		System.out.println(driver.sum(x,  y, z, 77));
		
	}
	
	public int sum(int i, int j) {
		System.out.println("Inside 2 param sum");
		return i + j;
	}
	
	public int sum(int i, int j, int k) {
		System.out.println("Inside 3 param sum");
		return i + j + k;
	}
	
	private String sum(int i, int j, int k, int l) throws RuntimeException {
		int result = i + j + k + l;
		return "" + result;
	}

}
