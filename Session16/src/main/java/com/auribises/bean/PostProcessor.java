package com.auribises.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class PostProcessor implements BeanPostProcessor{

	
	// executed automatically by Spring FW whenever we have PostProcessor class configured in beans.xml file

	// executed after init method
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		
		System.out.println("[PostProcessor - AFTER]  Initialization "+beanName);
		
		Connection connection = (Connection)bean;
		
		String password = connection.getPassword();
		connection.setPassword(password.replace('s', 'q'));
		
		System.out.println("[PostProcessor - AFTER] Password Secured");
		
		return bean;
	}
	
	
	// executed before init method
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
	
		System.out.println("[PostProcessor - BEFORE]  Initialization "+beanName);

		Connection connection = (Connection)bean;
		connection.setPassword("password");
		
		System.out.println("[PostProcessor - BEFORE] Password Changed");
		
		return bean;
	}
}
