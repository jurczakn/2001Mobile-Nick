package com.revature.pojo;

import java.io.Serializable;

/*
 * Serializable is a Marker Interface
 * Marker Interface - Interface with no abstract methods
 * It works as check for the compiler.
 */
public class Map implements Serializable{
	
	private java.util.Map<String, String> legend;
	
	private transient double longitude;
	
	private double latitude;
	
	private String caption;

	public java.util.Map<String, String> getLegend() {
		return legend;
	}

	public void setLegend(java.util.Map<String, String> legend) {
		this.legend = legend;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	@Override
	public String toString() {
		return "Map [legend=" + legend + ", longitude=" + longitude + ", latitude=" + latitude + ", caption=" + caption
				+ "]";
	}

	public Map() {
		super();
	}

	public Map(java.util.Map<String, String> legend, double longitude, double latitude, String caption) {
		super();
		this.legend = legend;
		this.longitude = longitude;
		this.latitude = latitude;
		this.caption = caption;
	}
	
}
