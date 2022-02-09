package com.auribises.session17;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.auribises.bean.Product;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to Spring Core AOP Demo" );
        ApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");
        
        //Product pRef = context.getBean("product", Product.class);
        Product pRef = context.getBean("productProxy", Product.class);
        System.out.println(pRef);
        
        // execution of some business method
        pRef.purchaseProduct("Home", "Evening 6PM");
        
        //ProxyFactoryBean: We need to configure this built in Spring FW AOP Class in xml file
        //					So that our before and after advice works
        
        /*Kind of Structure to attributes which we need to configure
         	class ProxyFactoryBean{
	        	Object target;
	        	List<Object> interceptorNames;
        	}
        */
        
    }
}
