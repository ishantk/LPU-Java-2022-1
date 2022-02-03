package com.auribises.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Customer {

	public int cid;
	public String name;
	public String phone;
	public String email;
	public int rewardPoints;
	public String registeredOnDate;
	
	public Customer(){
		
	}
	
	public Customer(int cid, String name, String phone, String email, int rewardPoints, String registeredOnDate) {
		this.cid = cid;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.rewardPoints = rewardPoints;
		this.registeredOnDate = registeredOnDate;
	}
	
	public void inputCustomerDetails() {
		
		Scanner scanner = new Scanner(System.in);
				
		System.out.println("Enter Customer Name: ");
		name = scanner.nextLine();
		
		System.out.println("Enter Customer Phone: ");
		phone = scanner.nextLine();
		
		System.out.println("Enter Customer Email: ");
		email = scanner.nextLine();
		
		System.out.println("Enter Customer Reward Points: ");
		rewardPoints = scanner.nextInt();
		
		
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		registeredOnDate = formatter.format(date);
		
		System.out.println("Please Review Customer Details: ");
		System.out.println(toString());
		
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", phone=" + phone + ", email=" + email + ", rewardPoints="
				+ rewardPoints + ", registeredOnDate=" + registeredOnDate + "]";
	}
	
	public String toSQL() {
		return "insert into Customer values(0, '"+name+"', '"+phone+"', '"+email+"', "+rewardPoints+" , '"+registeredOnDate+"');";
	}
	
}
