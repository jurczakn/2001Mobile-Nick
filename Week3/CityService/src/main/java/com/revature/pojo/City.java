package com.revature.pojo;

public class City {
	
	private Integer id;
	
	private String name;
	
	private Integer population;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPopulation() {
		return population;
	}

	public void setPopulation(Integer population) {
		this.population = population;
	}

	@Override
	public String toString() {
		return "City [id=" + id + ", name=" + name + ", population=" + population + "]";
	}

	public City(Integer id, String name, Integer population) {
		super();
		this.id = id;
		this.name = name;
		this.population = population;
	}

	public City() {
		super();
		// TODO Auto-generated constructor stub
	}

}

