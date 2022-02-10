package com.auribises.model;

public class VeggiePizza extends Pizza{
	
	String veggieToppings;
	Integer spiceLevel;
	
	public VeggiePizza() {
		// TODO Auto-generated constructor stub
	}

	public VeggiePizza(String veggieToppings, Integer spiceLevel) {
		this.veggieToppings = veggieToppings;
		this.spiceLevel = spiceLevel;
	}

	public String getVeggieToppings() {
		return veggieToppings;
	}

	public void setVeggieToppings(String veggieToppings) {
		this.veggieToppings = veggieToppings;
	}

	public Integer getSpiceLevel() {
		return spiceLevel;
	}

	public void setSpiceLevel(Integer spiceLevel) {
		this.spiceLevel = spiceLevel;
	}

	@Override
	public String toString() {
		return "VeggiePizza [veggieToppings=" + veggieToppings + ", spiceLevel=" + spiceLevel + ", id=" + id + ", name="
				+ name + ", price=" + price + "]";
	}

}
