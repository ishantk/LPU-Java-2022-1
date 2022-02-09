package com.auribises.bean;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeAdvice implements MethodBeforeAdvice{

	// before method will be executed before the core business logic
	// This method can be used for PreProcessing
	// 1. [PRE-PROCESSING] Check the Stock based on which purchase can be made
	public void before(Method method, Object[] inputs, Object bean) throws Throwable {
		System.out.println();
		if(method.getName().equals("purchaseProduct")) {
			
			System.out.println("[BeforeAdvice] PreProcessing started for "+method.getName());
			
			// Get the Reference to the Product Object
			Product product = (Product)bean;
			// Assignment: Read the Stock Data from the Table and perform PreProcessing
			if(product.stock < 1) {
				System.out.println("[BeforeAdvice] PreProcessing. Product Out of Stock..");
				product.setCanBuy(false);
			}else {
				product.setCanBuy(true);
			}
			
			System.out.println("[BeforeAdvice] PreProcessing finished for "+method.getName());
		}
		
		if(method.getName().equals("updateProduct")) {
			//....
		}
		
		System.out.println();
	}

}
