package com.auribises.session16;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.auribises.bean.Connection;

public class App {
    public static void main( String[] args ){
        
    	System.out.println( "Welcome to Spring Core" );
        
        // Traditionally we create objects in main file with new :)
        // Connection Object Construction
        
    	/*Connection con1 = new Connection();
        con1.setUrl("jdbc:mysql://localhost/estore");
        con1.setUsername("auribises");
        con1.setPassword("password123");
        System.out.println("con1 is: "+con1);*/
        
        
        /*
          	Spring FW:
          	 IOC: Inversion of Control
          	 	  You can configure the data for object in an XML File
          	 	  and Let Spring IOC Container create and manage the objects for your project
         		  
         		  We will not create objects as developer, Spring FW will do it for us :)
         		  
         	Spring Core IOC Procedure (Link Spring Core Jars before using Spring FW) 
         	1. Create an xml file in your source directory [Ref Link: https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#spring-core]
         	2. Use IOC Container to parse your xml file
         		  	2.1 BeanFactory
         		  	2.2 ApplicationContext
         	3. Using IOC Container get the reference of the objects and use them in your project	  	
         */
    	
    	// 1st IOC Container: BeanFactory
    	/*Resource resource = new ClassPathResource("beans.xml");
    	BeanFactory factory = new XmlBeanFactory(resource);
    	
    	// BeanFactory IOC Container creates the objects in a lazy way
    	// which means, whenever we request with getBean method for the Object's Reference
    	// at that time BeanFactory creates the Objects
    	
    	// getBean Method returns the reference to the object which it created
    	Connection c1 = (Connection)factory.getBean("con1");
    	Connection c2 = factory.getBean("con2", Connection.class);
    	Connection c3 = factory.getBean("con1", Connection.class);
    	
    	System.out.println("c1 is: "+c1+" and hashcode is: "+c1.hashCode());
    	System.out.println("c2 is: "+c2+" and hashcode is: "+c2.hashCode());
    	System.out.println("c3 is: "+c3+" and hashcode is: "+c3.hashCode());*/
    	
    	// 2nd IOC Container: ApplicationContext
    	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    	// ApplicationContext IOC Container creates the objects with eager loading
    	// i.e. before we request for the Beans, they are already created for us
    	
    	// Execute the same method on the context like we did it for factory
    	Connection c1 = (Connection)context.getBean("con1");
    	//Connection c2 = context.getBean("con2", Connection.class);
    	//Connection c3 = context.getBean("con1", Connection.class);
    	
    	System.out.println("c1 is: "+c1+" and hashcode is: "+c1.hashCode());
    	//System.out.println("c2 is: "+c2+" and hashcode is: "+c2.hashCode());
    	//System.out.println("c3 is: "+c3+" and hashcode is: "+c3.hashCode());
    	
    	// Closing the Application Context :)
    	ClassPathXmlApplicationContext cxt = (ClassPathXmlApplicationContext)context;
    	cxt.close();
    	
    	// LifeCycle of a Bean
    	// 1. Constructor
    	// 2. BeanPostProcessor - before initialization
    	// 3. init method
    	// 4. BeanPostProcessor - after initialization
    	// 5. destroy method
    	
    }
}
