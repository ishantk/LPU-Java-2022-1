package com.auribises.db;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.auribises.model.Employee;

public class HibernateApp {

	public static void main(String[] args) {
		
		/*
		 	Hibernate Procedure
		 		1. Create the Model
		 		2. Link the Jar Files | Configure your pom.xml file with dependency
		 		3. Copy the hibernate configuration file and put the database configuration and hibernate configuration
		 		4. Copy the hibernate mapping file in source directory and link class with table
		 		5. In the main class use Hibernate APIs to perform CRUD Operations
		 */
		
		// 3 APIs to be used from Hibernate
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction=null;
		
		try {
			
			// Parsing hibernate.cfg.xml file i.e. reading the details from the file
			StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
			// build the session factory
			factory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
			
			session = factory.openSession();
			transaction = session.beginTransaction();
			
			Employee employee = new Employee(null, "Fionna Flynn", "fionna.flynn@estore.in", 500000);
			
			// save method -> execute insert for us :)
			session.save(employee);
			
			// commit method on transaction will make the SQL Execute
			transaction.commit();
			System.out.println("Transaction Commited");
			
			session.close();
			factory.close();
			
		} catch (Exception e) {
			System.err.println("Something Went Wrong: "+e);
		}

	}

}
