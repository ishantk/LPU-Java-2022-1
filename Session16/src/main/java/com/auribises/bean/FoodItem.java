package com.auribises.bean;

// FoodItem Bean
public class FoodItem {

	String name;
	int price;
	
	public FoodItem() {
		System.out.println("[FoodItem] - Default Constructor");
	}

	public FoodItem(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "FoodItem [name=" + name + ", price=" + price + "]";
	}
	
}
