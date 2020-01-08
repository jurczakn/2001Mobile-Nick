package com.revature.pojo;

public class Planet {
	
	public String name;
	
	public Planet(String name) {
		this.name = name;
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("Destroying Planet " + this.name);
	}
	
	

}
