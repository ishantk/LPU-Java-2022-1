package com.auribises.session18;

import java.util.ArrayList;
import java.util.List;

import com.auribises.db.DB;
import com.auribises.model.Dish;
import com.auribises.model.Restaurant;

public class OneToManyApp {

	public static void main(String[] args) {
		
		Dish dish1 = new Dish(null, "Channa Bahtura", 100);
		Dish dish2 = new Dish(null, "Masala Dosa", 100);
		Dish dish3 = new Dish(null, "Coffee", 80);
		Dish dish4 = new Dish(null, "Idli",300);
		Dish dish5 = new Dish(null, "Tea",20);
		
		List<Dish> dishes = new ArrayList<Dish>();
		dishes.add(dish1); // 0
		dishes.add(dish2); // 1
		dishes.add(dish3); // 2
		dishes.add(dish4); // 3
		dishes.add(dish5); // 4
		
		Restaurant restaurant = new Restaurant();
		restaurant.setName("Fionnas Chai Paani");
		restaurant.setPhone("+91 99999 11111");
		restaurant.setOperatingHours("10:00 to 22:00");
		restaurant.setRatings(4.5f);
		restaurant.setPricePerPerson(100);
		
		// 1 to many fulfillment
		restaurant.setDishes(dishes);
		
		System.out.println(restaurant);
		
		DB db = new DB();
		//db.insertRestaurant(restaurant);
		
		// 1st Level Cache - Managed by Session API in Hibernate
		// 2nd Level Cache - Managed by SessionFactory API in Hibernate
		// 3rd Level Cache - To be configured by developer
		// If you fetch the same data again and again, hibernate will not execute select statement again and again :)
		db.fetchRestaurant(1);
		db.fetchRestaurant(1);
		
		db.close();

	}

}
