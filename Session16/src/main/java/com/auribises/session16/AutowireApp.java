package com.auribises.session16;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.auribises.bean.Restaurant;

public class AutowireApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("autowire.xml");
		Restaurant restaurant = context.getBean("restRef", Restaurant.class);
		
		System.out.println(restaurant);
		System.out.println(restaurant.getAddress());

	}

}
