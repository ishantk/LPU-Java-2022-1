package com.auribises.model;

public class Dish {

	Integer dishId;
	String name;
	Integer price;
	
	public Dish() {
		// TODO Auto-generated constructor stub
	}
	
	public Dish(Integer dishId, String name, Integer price) {
		this.dishId = dishId;
		this.name = name;
		this.price = price;
	}

	public Integer getDishId() {
		return dishId;
	}

	public void setDishId(Integer dishId) {
		this.dishId = dishId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Dish [dishId=" + dishId + ", name=" + name + ", price=" + price + "]";
	}
	
}
