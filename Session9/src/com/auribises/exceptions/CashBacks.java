package com.auribises.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CashBacks {

	public static void main(String[] args) {
		
		System.out.println("CashBacks App Started");
		
		int[] cashBacks = {100, 30, 70, 90, 80, 22, 65, 89, 99};
		
		System.out.println("Enter Your Lucky Number: ");
		Scanner scanner = new Scanner(System.in);
		
		int cashBack = 0;
		int extraCashBack = 0;
		try {
			int luckyNumber = scanner.nextInt();
			cashBack = cashBacks[luckyNumber];
		}catch(Exception e) { // RTP :)
			//System.out.println("Something Went Wrong: "+e);
			e.printStackTrace();
		}
		/*catch(ArrayIndexOutOfBoundsException refVar) {
			System.out.println("Error is: "+refVar);
		}catch(InputMismatchException refVar) {
			System.out.println("Something Went Wrong: "+refVar);
		}*/finally {
			System.out.println("Finally...");
			System.out.println("Lets make you more Lucky :)");
			if(cashBack > 0) {
				extraCashBack = cashBack / 5;
			}else {
				extraCashBack = 5;
			}
			System.out.println("Some Extra CashBack for You: "+extraCashBack);
			scanner.close();
		}
		System.out.println("CashBack Earned: "+cashBack);
		
		System.out.println("CashBacks App Finished");

	}

}

// Exception -> error which occurs at run time and crashes the program 


/*
 	Exception Hierarchy
 	
 	Throwable
 		Exception
 			RuntimeException
 			IOException
 			SQLException
 			.
 			...
 			........
 	
 	All in all, Exception as a class is parent to all the classes of Exception in Java
 	Hence, as per polymorphic statement ref var of Exception can refer to any child object :)
 	
 	
 	try{
 	
 	}catch(){
 	
 	}
 	
 	// program will crash but before crash finally will be executed
 	try{
 	
 	}finally{
 	
 	}
 	
 	try{
 	
 		try{
 	
	 	}catch(){
	 	
	 	}finally{
	 	
	 	}
 	
 	}catch(){
 	
 		try{
 	
	 	}catch(){
	 	
	 	}finally{
	 	
	 	}
 	
 	}finally{
 	
 	 	try{
 	
	 	}catch(){
	 	
	 	}finally{
	 	
	 	}
 	}
 	
 */


