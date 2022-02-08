package com.auribises.session16;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.auribises.bean.Pizza;

public class InheritanceApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("inheritance.xml");
		Pizza pizza = context.getBean("pRef", Pizza.class);
		System.out.println("Pizza Details");
		System.out.println(pizza);

	}

}
