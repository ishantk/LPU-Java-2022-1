package com.auribises.bean;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class Restaurant {
	
	String name;
	String phone;
	String operatingHours;
	float ratings;
	
	// Restaurant has a dependency -> Address :)
	// Reference Type and not value :)
	Address address; 				// HAS-A Relationship | 1 to 1
	
	// Restaurant has a dependency -> List :)
	// Reference Type and not value :)
	List<String> searchKeywords; 	// HAS-A Relationship | 1 to many
	
	// Assignment: Implement 1 to many relationship for Restaurant to have many FoodItem
	//  hint: list of ref in xml file
	List<FoodItem> foodItems; // Configure in xml file by creating setter and getter here
	
	public Restaurant() {
		System.out.println("[Restaurant] - Default Constructor");
	}

	
	// Constructor will take Address as input which is reference type
	@Autowired
	public Restaurant(Address address) {
		this.address = address;
		System.out.println("[Restaurant] - Parameterized Address Constructor");
	}



	public Restaurant(String name, String phone, String operatingHours, float ratings, Address address) {
		this.name = name;
		this.phone = phone;
		this.operatingHours = operatingHours;
		this.ratings = ratings;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getOperatingHours() {
		return operatingHours;
	}

	public void setOperatingHours(String operatingHours) {
		this.operatingHours = operatingHours;
	}

	public float getRatings() {
		return ratings;
	}

	public void setRatings(float ratings) {
		this.ratings = ratings;
	}

	public Address getAddress() {
		return address;
	}

	// Reference Type as Input to the setter method setAddress
	//@Autowired
	public void setAddress(Address address) {
		System.out.println("Property Address Initialized with Setter Injection");
		this.address = address;
	}
	
	public List<String> getSearchKeywords() {
		return searchKeywords;
	}

	public void setSearchKeywords(List<String> searchKeywords) {
		System.out.println("Property List Initialized with Setter Injection");
		this.searchKeywords = searchKeywords;
	}

	@Override
	public String toString() {
		return "Restaurant [name=" + name + ", phone=" + phone + ", operatingHours=" + operatingHours + ", ratings="
				+ ratings + ", address=" + address + "]";
	}

}
