package com.auribises.db;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.criterion.Restrictions;

import com.auribises.model.Customer;
import com.auribises.model.Employee;
import com.auribises.model.Pizza;
import com.auribises.model.Restaurant;
import com.auribises.model.VeggiePizza;

// Assignment: To Use DB as Singleton make changes here

public class DB {
	
	// 3 APIs to be used from Hibernate
	SessionFactory factory;
	Session session;
	Transaction transaction;
	
	public DB() {
		try {
			
			// Parsing hibernate.cfg.xml file i.e. reading the details from the file
			StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
			// build the session factory
			factory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
			
			session = factory.openSession();
			System.out.println("[DB] Hibernate Session Initialized");
		} catch (Exception e) {
			System.err.println("Something Went Wrong: "+e);
		}
	}
	
	public void insertEmployee(Employee employee) {
		try {
			transaction = session.beginTransaction();
			session.save(employee);
			transaction.commit();
			System.out.println("[DB] Employee "+employee.getName()+" Saved :)");
			
		} catch (Exception e) {
			System.err.println("Something Went Wrong: "+e);
		}
	}
	
	public void executeBatch() {
		try {
			transaction = session.beginTransaction();
			
			for(int i=1;i<=50;i++) {
				Employee employee = new Employee(null, "Employee "+i, "employee"+i+"@estore.in", 500000+i);
				session.save(employee);
			}
		
			transaction.commit();
			System.out.println("[DB] Employee Batch Executed :)");
			
		} catch (Exception e) {
			System.err.println("Something Went Wrong: "+e);
		}
	}
	
	public void fetchEmployee(int eid) {
		try {
			
			transaction = session.beginTransaction();
			
			// Get a single object from database
			Employee employee = session.get(Employee.class, eid);
			
			transaction.commit();
			System.out.println("[DB] Employee: "+employee);
			
		} catch (Exception e) {
			System.err.println("Something Went Wrong: "+e);
		}
	}
	
	public void fetchRestaurant(int rid) {
		try {
			
			transaction = session.beginTransaction();
			
			// Get a single object from database
			Restaurant restaurant = session.get(Restaurant.class, rid);
			
			transaction.commit();
			System.out.println("[DB] Restaurant: "+restaurant);
			restaurant.getDishes().forEach((dish)->System.out.println(dish));
			
		} catch (Exception e) {
			System.err.println("Something Went Wrong: "+e);
		}
	}
	
	public void updateEmployee(Employee employee) {
		try {
			
			transaction = session.beginTransaction();
			
			// Get a single object from database to be updated
			Employee employeeToUpdate = session.get(Employee.class, employee.getEid());
			
			// Update employeeToUpdate Object with new details in employee
			employeeToUpdate.setName(employee.getName());
			employeeToUpdate.setEmail(employee.getEmail());
			employeeToUpdate.setSalary(employee.getSalary());
			
			session.update(employeeToUpdate);
			
			transaction.commit();
			System.out.println("[DB] Employee Updated: "+employeeToUpdate);
			
		} catch (Exception e) {
			System.err.println("Something Went Wrong: "+e);
		}
	}
	
	public void deleteEmployee(Employee employee) {
		try {
			
			transaction = session.beginTransaction();
			
			session.delete(employee);
			
			transaction.commit();
			System.out.println("[DB] Employee Deleted: "+employee.getEid());
			
		} catch (Exception e) {
			System.err.println("Something Went Wrong: "+e);
		}
	}
	
	public void fetchEmployees() {
		try {
			
			transaction = session.beginTransaction();
			
			// Hibernate Query Language
			//String hql = "From Employee";
			//String hql = "From Employee where salary >= 500030";
			//List<Employee> employees = session.createQuery(hql).list();
			
			// Criteria API
			Criteria criteria = session.createCriteria(Employee.class);
			criteria.add(Restrictions.gt("salary", 500040));
			List<Employee> employees = criteria.list();
			
			employees.forEach((employee)->System.out.println(employee));
			
			transaction.commit();
			
		} catch (Exception e) {
			System.err.println("Something Went Wrong: "+e);
		}
	}
	
	public void insertCustomer(Customer customer) {
		try {
			transaction = session.beginTransaction();
			session.save(customer);
			transaction.commit();
			System.out.println("[DB] Customer "+customer.getName()+" Saved :)");
			
		} catch (Exception e) {
			System.err.println("Something Went Wrong: "+e);
		}
	}
	
	public void insertRestaurant(Restaurant restaurant) {
		try {
			transaction = session.beginTransaction();
			session.save(restaurant);
			transaction.commit();
			System.out.println("[DB] Restaurant "+restaurant.getName()+" Saved :)");
			
		} catch (Exception e) {
			System.err.println("Something Went Wrong: "+e);
		}
	}
	
	public void insertPizza(Pizza pizza) {
		try {
			transaction = session.beginTransaction();
			session.save(pizza);
			transaction.commit();
			System.out.println("[DB] Pizza "+pizza.getName()+" Saved :)");
			
		} catch (Exception e) {
			System.err.println("Something Went Wrong: "+e);
		}
	}
	
	public void insertVeggiePizza(VeggiePizza pizza) {
		try {
			transaction = session.beginTransaction();
			session.save(pizza);
			transaction.commit();
			System.out.println("[DB] Pizza "+pizza.getName()+" Saved :)");
			
		} catch (Exception e) {
			System.err.println("Something Went Wrong: "+e);
		}
	}
	
	public void close() {
		try {
			session.close();
			factory.close();
			System.out.println("[DB] Hibernate Session Closed");
		} catch (Exception e) {
			System.err.println("Something Went Wrong: "+e);
		}
	}

}

// Assignment: Explore all CRUD operations with mappings :) i.e. 1 to 1 , 1 to many and inheritance
