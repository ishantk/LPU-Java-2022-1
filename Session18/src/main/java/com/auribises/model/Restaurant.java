package com.auribises.model;

import java.util.List;

public class Restaurant {

	Integer rid;
	String name;
	String phone;
	String operatingHours;
	Float ratings;
	Integer pricePerPerson;
	
	List<Dish> dishes; 	// HAS-A relationship | 1 to many
	
	public Restaurant() {
		// TODO Auto-generated constructor stub
	}

	public Integer getRid() {
		return rid;
	}

	public void setRid(Integer rid) {
		this.rid = rid;
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

	public Float getRatings() {
		return ratings;
	}

	public void setRatings(Float ratings) {
		this.ratings = ratings;
	}

	public Integer getPricePerPerson() {
		return pricePerPerson;
	}

	public void setPricePerPerson(Integer pricePerPerson) {
		this.pricePerPerson = pricePerPerson;
	}

	public List<Dish> getDishes() {
		return dishes;
	}

	public void setDishes(List<Dish> dishes) {
		this.dishes = dishes;
	}

	@Override
	public String toString() {
		return "Restaurant [rid=" + rid + ", name=" + name + ", phone=" + phone + ", operatingHours=" + operatingHours
				+ ", ratings=" + ratings + ", pricePerPerson=" + pricePerPerson + ", dishes=" + dishes + "]";
	}
}
