package com.auribises.bean;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AfterAdvice implements AfterReturningAdvice{

	// afterReturning method will be executed after the core business logic
	// This method can be used for PostProcessing
	public void afterReturning(Object returnValue, Method method, Object[] inputs, Object bean) throws Throwable {
		
		System.out.println();
		if(method.getName().equals("purchaseProduct")) {
			
			System.out.println("[AfterAdvice] PostProcessing started for "+method.getName());
			
			// Assignment: Use Abstraction to notify the User Object for the Successful Transaction and Product Purchase
			// Get the Reference to the Product Object
			Product product = (Product)bean;
			if(product.isCanBuy()) {
				// 3. [POST-PROCESSING] Notify the Customer and may be delivery and dispatch teams for the Order
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("Email Sent with an Invoice");
				System.out.println("You Product "+product.getName()
					+" will be delivered at "+inputs[0]+" by "+inputs[1]);
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println();
				System.out.println("Notified Logistcis Team for Dispatch");
			}else {
				System.out.println("Sorry! Please Try Again with Purchase");
			}
			
			System.out.println("[AfterAdvice] PostProcessing finished for "+method.getName());
		}
		System.out.println();
	}

}
