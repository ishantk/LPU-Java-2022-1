package com.auribises.session18;

import com.auribises.db.DB;
import com.auribises.model.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to Hibernate" );
        
        Employee e1 = new Employee(null, "Leo", "leo@estore.in", 400000);
        Employee e2 = new Employee(null, "Anna", "anna@estore.in", 900000);
        Employee e3 = new Employee(null, "Dave Watson", "dave.watson@estore.in", 850077);
        
        //Employee employee = new Employee();
        //employee.setEid(2);
        
        DB db = new DB();
        
        //db.insertEmployee(e1);
        //db.insertEmployee(e2);
        //db.insertEmployee(e3);
        
        //db.executeBatch();
        
        //db.fetchEmployee(1);
        //db.fetchEmployee(5);
        //db.fetchEmployee(50);
        
        //db.updateEmployee(e3);
        
        //db.deleteEmployee(employee);
        db.fetchEmployees();
        
        db.close();
    }
}
