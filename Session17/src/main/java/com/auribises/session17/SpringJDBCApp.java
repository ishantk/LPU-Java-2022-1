package com.auribises.session17;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.auribises.bean.Transaction;
import com.auribises.db.DB;

public class SpringJDBCApp {

	public static void main(String[] args) {
		
		// For the DataBase Configuration we need to configure the DriverManagerDataSource in XML File
		ApplicationContext context = new ClassPathXmlApplicationContext("springjdbc.xml");
		DB dbRef = context.getBean("db", DB.class);
		
		/*Transaction t1 = new Transaction("john@example.com", 2000, "2022-02-09 12:00:00");
		Transaction t2 = new Transaction("fionna@example.com", 3000, "2022-02-09 13:00:00");
		Transaction t3 = new Transaction("george@example.com", 12000, "2022-02-09 16:00:00");
		
		dbRef.insertTransaction(t1);
		dbRef.insertTransaction(t2);
		dbRef.insertTransaction(t3);*/
		
		dbRef.fetchTransactions();
		
		System.out.println();
		dbRef.fetchTransactionByID(2);
		
		
	}

}
