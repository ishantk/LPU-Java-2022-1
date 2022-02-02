package com.auribises.lpu.jdbc.model;

/*
 
 
 	MySQL Installation: https://dev.mysql.com/downloads/installer/
 	Install the database and do remember username and password for your database :)
 	By default username is root and password is blank(nothing)
 	
 	After installation go to command prompt/terminal window
 	execute the command mysql -u root -p
 	
 	MySQL DB Stores data in tables :)
 	
 	1. Create the Table in MySQL
 	
 	ORM: Object Relational Mapping
 	
 	Java: Create Class
 	class Customer {
		public int cid;
		public String name;
		public String phone;
		public String email;
		public int rewardPoints;
		public String registeredOnDate;
	}
 	
 	SQL: Create Table
 	create table Customer (
		cid int primary key auto_increment,
		name varchar(256),
		phone varchar(256),
		email varchar(256),
		rewardPoints int,
		registeredOnDate date
	);
	
	Java: Create Customer Object
	Customer customer = new Customer(1, "John", "+91 99999 11111", "john@example.com", 100, "02-02-2022");
	
	SQL: Insert Customer Row/Record
	insert into Customer values(0, 'John', '+91 99999 11111', 'john@example.com', 100, '2022-02-02');
 	
 */

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

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", phone=" + phone + ", email=" + email + ", rewardPoints="
				+ rewardPoints + ", registeredOnDate=" + registeredOnDate + "]";
	}
	
	public String toSQL() {
		return "insert into Customer values(0, '"+name+"', '"+phone+"', '"+email+"', "+rewardPoints+" , '"+registeredOnDate+"');";
	}
	
}
