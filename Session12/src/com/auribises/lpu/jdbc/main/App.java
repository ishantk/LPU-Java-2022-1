package com.auribises.lpu.jdbc.main;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.auribises.lpu.jdbc.contoller.DB;
import com.auribises.lpu.jdbc.model.Customer;

public class App {
	
	
	DB db;
	
	App(){
		db = new DB();
	}
	
	
	void createNewCutomer() {
		
		Scanner scanner = new Scanner(System.in);
		
		Customer customer = new Customer();
		customer.cid = 0;
		
		System.out.println("Enter Customer Name: ");
		customer.name = scanner.nextLine();
		
		System.out.println("Enter Customer Phone: ");
		customer.phone = scanner.nextLine();
		
		System.out.println("Enter Customer Email: ");
		customer.email = scanner.nextLine();
		
		customer.rewardPoints = 100;
		
		
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		customer.registeredOnDate = formatter.format(date);
		
		System.out.println("Please Review Customer Details: ");
		System.out.println(customer);
		
		System.out.println(customer.toSQL());
		
		int result = db.executeSQLStatement(customer.toSQL());
		String message = result > 0 ? customer.name+" Saved Successfully" :  customer.name+" Not Saved";
		System.out.println(message);
		
		scanner.close();
	}
	
	void exitApp() {
		db.closeConnection();
		System.out.println("Customer Management App Finished");
	}

	public static void main(String[] args) {
		
		System.out.println("Customer Management App Started");
		App app = new App();
		app.createNewCutomer();
		app.exitApp();
	}

}
