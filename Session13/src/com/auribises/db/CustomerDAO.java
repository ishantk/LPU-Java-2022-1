package com.auribises.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.auribises.model.Customer;

public class CustomerDAO implements DAO<Customer>{

	// Get the reference of DB Object which is singleton :)
	DB db = DB.getDB();
	
	@Override
	public int insert(Customer object) {
		int result = 0;

		String sql = "insert into Customer values(null, ?, ?, ?, ?, ?)";
		// in above sql we substituted the ? instead of values
		// we are not concatenating the values in String
		try {
			
			Connection connection = db.getConnection();
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, object.name);
			statement.setString(2, object.phone);
			statement.setString(3, object.email);
			statement.setInt(4, object.rewardPoints);
			statement.setString(5, object.registeredOnDate);
			result = db.executeUpdate(statement);
		}catch (Exception e) {
			System.err.println("Some Exception: "+e);
		}
		
		return result;
	}

	@Override
	public int update(Customer object) {
		int result = 0;
		
		String sql = "update Customer set name = ?, phone = ?, email = ?, rewardPoints = ? where cid = ?";
		// in above sql we substituted the ? instead of values
		// we are not concatenating the values in String
		try {
			
			Connection connection = db.getConnection();
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, object.name);
			statement.setString(2, object.phone);
			statement.setString(3, object.email);
			statement.setInt(4, object.rewardPoints);
			statement.setInt(5, object.cid);
			result = db.executeUpdate(statement);
		}catch (Exception e) {
			System.err.println("Some Exception: "+e);
		}
		
		return result;
	}

	@Override
	public int delete(int id) {
		int result = 0;
		
		String sql = "delete from Customer where cid = ?";
		// in above sql we substituted the ? instead of values
		// we are not concatenating the values in String
		try {
			
			Connection connection = db.getConnection();
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setInt(1, id);
			result = db.executeUpdate(statement);
		}catch (Exception e) {
			System.err.println("Some Exception: "+e);
		}
		
		return result;
	}

	@Override
	public ArrayList<Customer> query() {
		
		// ArrayList is going to represent records in Table :)
		ArrayList<Customer> customers = new ArrayList<Customer>();
		
		String sql = "select * from Customer";
		
		try {
			Connection connection = db.getConnection();
			PreparedStatement statement = connection.prepareStatement(sql);
			
			ResultSet set = db.executeQuery(statement);
			if(set != null) {
				// next method will tell do we have the data in the ResultSet or not as next row for the table
				while(set.next()) {
					Customer customer = new Customer();
					customer.cid = set.getInt(1); // column number
					customer.name = set.getString("name"); // column name
					customer.phone = set.getString(3); // column number
					customer.email = set.getString("email"); // column name
					customer.rewardPoints = set.getInt("rewardPoints"); // column name
					customer.registeredOnDate = set.getString("registeredOnDate"); // column name
					customers.add(customer);
				}
			}
			
		}catch (Exception e) {
			System.err.println("Some Exception: "+e);
		}
		
		return customers;
	}

}
