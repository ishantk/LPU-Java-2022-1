package com.auribises.exceptions;

import java.io.IOException;

/*
 		Checked Exceptions
 			All the Exception are Checked
 			IOException
 			SQLException
 			InterruptedException
 			.
 			..
 			....
 			
 		UnChecked Exceptions
 			Only RuntimeException and its children are called UnCehcked Exceptions
 			ArrayIndexOutOfBoundsException
 			NullPointerException
 			.
 			...
 		
 */

// Customized Exception Class
// Unchecked Exception
class MyBankingException extends RuntimeException{
	MyBankingException(String message){
		super(message);
	}
}

//Checked Exception
class YourBankingException extends Exception{
	YourBankingException(String message){
		super(message);
	}
}

class BankAccount{
	
	String name;
	int balance;
	int minBalance;
	
	int attempts;
	
	BankAccount(){
		minBalance = 2000;
		attempts = 0;
	}

	BankAccount(String name, int balance) {
		this();
		this.name = name;
		this.balance = balance;
	}
	
	void checkAccountDetails() {
		System.out.println(name+" has a balance of "+balance);
	}
	
	void withdraw(int amount) throws IOException, YourBankingException{
		balance -= amount;
		
		if(balance < minBalance) {
			balance += amount;
			System.out.println("[WITHDRAW] Failed. Low Balance: "+balance);
			attempts++;
		}else {
			System.out.println("[WITHDRAW] Success. New Balance: "+balance);
		}
		
		if(attempts == 3) {
			
			// ArithmeticException is a built in exception class
			// it is child of RuntimeException class in Java i.e. UnChecked Exception
			//ArithmeticException exception = new ArithmeticException("Illegal Attempts "+attempts);
			//MyBankingException exception = new MyBankingException("Illegal Attempts "+attempts);
			
			
			// IOException is a built in exception class
			// its a direct child of Exception and falls under the category of Checked Exception
			//IOException exception = new IOException("Illegal Attempts "+attempts);
			YourBankingException exception = new YourBankingException("Illegal Attempts "+attempts);
			throw exception;
		}
	}
	
}

public class ThrowThrowsDemo {

	public static void main(String[] args) {
		
		System.out.println("Banking Started");

		BankAccount account = new BankAccount("fionna", 10000);
		account.checkAccountDetails();
		
		try {
			for(int i=1;i<=1000;i++) {
				account.withdraw(3000);
			}
		}catch(Exception e) {
			System.out.println("Exception: "+e);
		}
		
		System.out.println("Banking Finished");
		
	}

}
