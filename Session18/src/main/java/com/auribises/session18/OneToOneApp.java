package com.auribises.session18;

import com.auribises.db.DB;
import com.auribises.model.Address;
import com.auribises.model.Customer;

public class OneToOneApp {

	public static void main(String[] args) {
		
		
		Address address = new Address();
		address.setAdrsLine("2144 B20");
		address.setCity("Ludhiana");
		address.setZipCode(141001);
		
		Customer customer = new Customer();
		customer.setName("John");
		customer.setPhone("91 99999 11111");
		customer.setEmail("john@example.com");
		
		// Fulfilling 1 to 1 relationship :)
		customer.setAddress(address);
		address.setCustomer(customer);
		
		System.out.println(customer);
		
		// From Hibernate we want if we insert Customer Object, Address Object gets stored also in the corresponding table
		// Both Customer and Address Table they should be related to each other
		// cid in Customer Table should be aid in Address Table 
		
		DB db = new DB();
		db.insertCustomer(customer);

		// Assignment: Explore other CRUD operations
		db.close();

	}

}
