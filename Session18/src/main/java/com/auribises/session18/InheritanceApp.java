package com.auribises.session18;

import com.auribises.db.DB;
import com.auribises.model.Pizza;
import com.auribises.model.VeggiePizza;

public class InheritanceApp {

	public static void main(String[] args) {
		
		Pizza pizza = new Pizza();
		pizza.setName("Exotic Pizza");
		pizza.setPrice(350);
		
		
		VeggiePizza veggiePizza = new VeggiePizza();
		veggiePizza.setName("Veggie Supreme Pizza");
		veggiePizza.setPrice(500);
		veggiePizza.setVeggieToppings("brocolli, paneer, bell peppers");
		veggiePizza.setSpiceLevel(2);
		
		
		System.out.println("pizza: "+pizza);
		System.out.println("veggiePizza: "+veggiePizza);

		DB db = new DB();
		db.insertPizza(pizza);
		db.insertVeggiePizza(veggiePizza);
		db.close();
	}

}
