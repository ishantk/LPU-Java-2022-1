package com.auribises.session20b.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.auribises.session20b.model.Customer;
import com.auribises.session20b.repository.CustomerRepository;

@RestController
@RequestMapping(path="/mongo-customer-api")
public class AppController {
	
	@Autowired
	CustomerRepository customerRepository;
	
	@PostMapping(path="/add")
	public ResponseEntity<Customer> addCustomer(@RequestParam String name, @RequestParam String phone, @RequestParam String email){
		
		System.out.println("[AppController]: Add Customer Started");
		
		try {
			Customer customer = new Customer(null, name, phone, email);
			customerRepository.save(customer);
			System.out.println("[AppController]: Customer Added");
			// JSON Response for the Customer Creation :)
			return new ResponseEntity<Customer>(customer, HttpStatus.OK);
		} catch (Exception e) {
			System.err.println("[AppController]: Customer Failed to Add: "+e);
			e.printStackTrace();
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping(path="/customers")
	public ResponseEntity<ArrayList<Customer>> getAllCustomer(){
		try {
			ArrayList<Customer> customers = new ArrayList<Customer>();
			customerRepository.findAll().forEach((customer)->customers.add(customer));
			return new ResponseEntity<ArrayList<Customer>>(customers, HttpStatus.OK);			
		} catch (Exception e) {
			System.err.println("[AppController]: Customer Failed to Add: "+e);
			e.printStackTrace();
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	/*@GetMapping(path="/update/{id}")
	public ResponseEntity<Customer> updateCustomer(
			@PathVariable("id") Integer id,
			@RequestParam String name, @RequestParam String phone, @RequestParam String email){
		
		System.out.println("[AppController]: Add Customer Started");
		
		try {
			Customer customer = new Customer(id, name, phone, email);
			customerRepository.save(customer); // same method to perform update and insert :)
			System.out.println("[AppController]: Customer Added");
			// JSON Response for the Customer Creation :)
			return new ResponseEntity<Customer>(customer, HttpStatus.OK);
		} catch (Exception e) {
			System.err.println("[AppController]: Customer Failed to Add: "+e);
			e.printStackTrace();
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}*/
	
	@GetMapping(path="/update/{id}")
	public ResponseEntity<Customer> updateCustomer(@PathVariable("id") String id){
		
		System.out.println("[AppController]: Add Customer Started");
		
		try {
			Customer customer = new Customer(id, "John Jackson", "+91 99999 12345", "john.jackson@example.com");
			customerRepository.save(customer); // same method to perform update and insert :)
			System.out.println("[AppController]: Customer Updated");
			// JSON Response for the Customer Creation :)
			return new ResponseEntity<Customer>(customer, HttpStatus.OK);
		} catch (Exception e) {
			System.err.println("[AppController]: Customer Failed to Update: "+e);
			e.printStackTrace();
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping(path="/delete/{id}")
	public ResponseEntity<Customer> deleteCustomer(@PathVariable("id") String id){
		
		System.out.println("[AppController]: Add Customer Started");
		
		try {
			Customer customer = new Customer();
			customer.setId(id);
			
			// Get the Customer from the Database to be deleted :)
			Customer cRef = customerRepository.findById(id).get();
			
			customerRepository.delete(cRef);
			
			System.out.println("[AppController]: Customer Deleted");
			// JSON Response for the Customer Creation :)
			return new ResponseEntity<Customer>(cRef, HttpStatus.OK);
		} catch (Exception e) {
			System.err.println("[AppController]: Customer Failed to Update: "+e);
			e.printStackTrace();
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}


}

