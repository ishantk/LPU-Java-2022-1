package com.auribises.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import com.auribises.db.CustomerDAO;
import com.auribises.db.DAO;
import com.auribises.model.Customer;

public class CMSApp {
	
	DAO<Customer> dao;

	public CMSApp() {
		
		System.out.println("~~~~~~~~~~~~~~~~~~~");
		System.out.println("Welcome to CMS App");
		System.out.println("~~~~~~~~~~~~~~~~~~~");
		
		dao = new CustomerDAO(); // Polymorphic Statement
		
	}
	
	void showMenu() {
		
		Scanner scanner = new Scanner(System.in);
		
		do {
		
			System.out.println("~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("1. Register Customer");
			System.out.println("2. Update Customer");
			System.out.println("3. Delete Customer");
			System.out.println("4. Fetch All Customers");
			System.out.println("5. To Quit");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~");
			System.out.println();
			System.out.println("Select Your Option: ");
			
			int choice = scanner.nextInt();
			
			if(choice == 1) {
				
				Customer customer = new Customer();
				customer.inputCustomerDetails();
				
				int result = dao.insert(customer);
				
				String message = result>0 ? customer.name+" Registered" : customer.name+" Registration Failed";
				System.out.println(message);
				
			}else if(choice == 2) {
				System.out.println("Enter Customer ID to Update: ");
				int cid = scanner.nextInt();
				
				Customer customer = new Customer();
				customer.inputCustomerDetails();
				customer.cid = cid; // allocate customer id to be updated
				
				int result = dao.update(customer);
				
				String message = result>0 ? customer.name+" Updated" : customer.name+" Updation Failed";
				System.out.println(message);
				
			}else if(choice == 3) {
				
				System.out.println("Enter Customer ID to Delete: ");
				int cid = scanner.nextInt();
				
				int result = dao.delete(cid);
				
				String message = result>0 ? cid+" Deleted" : cid+" Deletion Failed";
				System.out.println(message);
				
			}else if (choice == 4) {
				
				ArrayList<Customer> customers = dao.query();
				
				// Anonymous Class
				Comparator<Customer> comparator1 = new Comparator<Customer>() {
					public int compare(Customer o1, Customer o2) {
						return o1.name.compareToIgnoreCase(o2.name);
					}
				};
				
				// Lambda Expression
				//Comparator<Customer> comparator2 = (o1, o2) -> o2.rewardPoints - o1.rewardPoints;
				
				//Collections.sort(customers, comparator1);
				//Collections.sort(customers, comparator2);
				
				Collections.sort(customers, (o1, o2) -> o2.rewardPoints - o1.rewardPoints);
				
				customers.forEach((customer)->System.out.println(customer));
				
				// Assignment: Use Method Reference Technique to solve Sorting on Comparator :)
				
			}else if(choice == 5) {
				System.out.println("Thank You for Using our app");
				scanner.close();
				break;
			}else{
				System.out.println("Invalid Choice");
			}
			
		}while(true);
		
	}
	
	public static void main(String[] args) {
		
		CMSApp app = new CMSApp();
		app.showMenu();

		// Assignment:    Create the Method in DAO to fetch Customers based on where conditions
		//				  select all the customers with email as gmail.com
		//				  select all the customers registered on some particular date
		//				  select all the customers registered on in date range
		//				  select all the customers with rewardpoints > someNumber
		
	}

}
