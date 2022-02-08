package com.auribises.bean;

public class Address {

	String adrsLine;
	String city;
	String state;
	int zipCode;
	
	public Address() {
		System.out.println("[Address] - Default Constructor");
	}

	public Address(String adrsLine, String city, String state, int zipCode) {
		this.adrsLine = adrsLine;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}

	public String getAdrsLine() {
		return adrsLine;
	}

	public void setAdrsLine(String adrsLine) {
		this.adrsLine = adrsLine;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return "Address [adrsLine=" + adrsLine + ", city=" + city + ", state=" + state + ", zipCode=" + zipCode + "]";
	}
	
}
