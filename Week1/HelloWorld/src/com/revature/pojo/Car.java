package com.revature.pojo;

/*
 * POJO: Plain Old Java Object
 * 
 * Simple object that contains State(fields) and accessors/mutators(getters/setter)
 */

public class Car {
	
	private String make;// = "Chevy".toUpperCase();
	
	private String model;
	
	private int year;
	
	public String getMake() {
		return this.make;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public int getYear() {
		return this.year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}

}
