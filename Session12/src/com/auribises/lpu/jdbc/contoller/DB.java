package com.auribises.lpu.jdbc.contoller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 	
 	JDBC Procedure:
 	1. Load the JDBC MySQL Driver
 	   1.1 Download the jar file: use the official link: https://dev.mysql.com/downloads/connector/j/
 	   	   Or use mvnrepository: https://mvnrepository.com/artifact/mysql/mysql-connector-java/8.0.28
 	   1.2 Link the jar file in your project
 	   1.3 Load the Driver Class from .jar file in our java program using Class.forname API
 	   
 	2. Create Connection to Database
 	   we need: url to db, username, passwordd
 	   Use Connection API and DriverManager API to create connection to DB
 	   
 	3. Execute SQL Statement
 	   Create a String SQL Instruction and use the Statement or PreparedStatement API to perform execution
 	   
 	4. Close the Connection to DB
 	   Use the API close on Connection 
 */

public class DB {
	
	Connection connection;
	Statement statement;
	
	public DB() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("[DB] Driver Loaded");
			
			String url = "jdbc:mysql://localhost/estore";
			String user = "root";
			String password = "";
			
			connection = DriverManager.getConnection(url, user, password);
			System.out.println("[DB] Connection Created");
			
			statement = connection.createStatement();
			System.out.println("[DB] Statement Created");
			
		} catch (Exception e) {
			System.out.println("Something Went Wrong: "+e);
		}
	}
	
	public int executeSQLStatement(String sql) {
		
		int result = 0;
		
		try {
			// executeUpdate -> for : insert update and delete instructions
			result = statement.executeUpdate(sql);
			System.out.println("[DB] SQL Statement Executed");
			
		} catch (Exception e) {
			System.out.println("Something Went Wrong: "+e);
		}
		
		return result;
	}
	
	public void closeConnection() {
		try {
			connection.close();
			System.out.println("[DB] Connection Closed");
		} catch (Exception e) {
			System.out.println("Something Went Wrong: "+e);
		}
	}

}
