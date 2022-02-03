package com.auribises.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DB {
	
	Connection connection;
	Statement statement;
	
	// Create the Object of DB inside the class itself
	// We have created only 1 object inside the class and made the constructor private
	// Hence, their will be no more object of DB
	// This is Singleton Design Pattern
	private static DB db = new DB();
	
	// you cannot create DB Objects
	private DB() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("[DB] Driver Loaded");
			
			String url = "jdbc:mysql://localhost/estore";
			String user = "root";
			String password = "";
			
			connection = DriverManager.getConnection(url, user, password);
			System.out.println("[DB] Connection Created");
			
			//statement = connection.createStatement();
			//System.out.println("[DB] Statement Created");
			
		} catch (Exception e) {
			System.out.println("Something Went Wrong: "+e);
		}
	}
	
	public static DB getDB() {
		return db;
	}
	
	public Connection getConnection() {
		return connection;
	}
	
	
	public int executeUpdate(PreparedStatement statement) {
		
		int result = 0;
		
		try {
			// executeUpdate -> for : insert update and delete instructions
			result = statement.executeUpdate();
			System.out.println("[DB] SQL Statement Executed");
			
		} catch (Exception e) {
			System.out.println("Something Went Wrong: "+e);
		}
		
		return result;
	}
	
	public ResultSet executeQuery(PreparedStatement statement) {
		
		ResultSet set = null; // data structure which will have data of table i.e. all the rows
		
		try {
			// executeUpdate -> for : query
			set = statement.executeQuery();
			System.out.println("[DB] SQL Statement Executed");
			
		} catch (Exception e) {
			System.out.println("Something Went Wrong: "+e);
		}
		
		return set;
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