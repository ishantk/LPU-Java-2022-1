package com.auribises.db;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.auribises.bean.Transaction;

public class DB {
	
	// will be injected with DriverManagerDataSource configuration from the Spring IOC
	DataSource dataSource;
	
	// Is used to perform CRUD operations from Spring
	JdbcTemplate jdbcTemplate;
	
	public DB() {
		System.out.println("[DB] Object Created");
	}

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		
		System.out.println("[DB] setDataSource executed - Setter Injection");
		// initialize the dataSource and then create the Object of JDBC Template using its constructor
		this.dataSource = dataSource;
		
		// JdbcTemplate constructor takes dataSource as input
		jdbcTemplate = new JdbcTemplate(dataSource);
		System.out.println("[DB] JDBC Template Created. We can now use CRUD Operations with it");
	}
	
	public void insertTransaction(Transaction transaction) {
		String sql = "insert into Transaction values (null, ?, ?, ?)";
		// update -> insert update and delete
		int result = jdbcTemplate.update(sql, transaction.userEmail, transaction.amount, transaction.dateTimeStamp);
		System.out.println("Transaction Inserted: "+result);
	}
	
	// Assignment: Update and Delete the Records yourself with JDBCTemplate
	
	public void fetchTransactions() {
		String sql = "select * from Transaction";
		List<Transaction> transactions = jdbcTemplate.query(sql, new TransactionMapper());
		transactions.forEach((transaction) -> System.out.println(transaction));
	}
	
	public void fetchTransactionByID(int tid) {
		String sql = "select * from Transaction where tid = ?";
		Transaction transaction = jdbcTemplate.queryForObject(sql, new Object[] {tid}, new TransactionMapper());
		System.out.println(transaction);
	}
	
	

}
