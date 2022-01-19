/*
 	MODEL
 	
 	VIEW
 	
 	CONTROLLER
 		Logical Operations
 			1. Operators for Computation
 			2. if/else and switch case for decision making
 			3. loops for iterations
 			
 			PS: For Controller, MODEL will be data provider
 */

public class Operators {

	public static void main(String[] args) {
		
		// Operators
		// 1. Arithmetic Operators
		// +, -, *, /, %
		
		double amount = 3565.55;
		double tax = 0.18;
		double total = amount + (tax*amount);
		System.out.println("Total to Pay: \u20b9"+total);
		
		int number = 10;
		int buckets = 3;
		int hashCode = number % buckets; // you will always get just -> 0 1 or 2 
		System.out.println("HashCode for number "+number+" with bucket size of "+buckets+" is: "+hashCode);
		
		// 2. Assignment Operators
		// =  +=, -=, *=, /=, %=
		int eWallet = 500; // assign operator to assign the value
		int myWallet = eWallet; // Value Copy Operation | Copy form Variable to Variable :)
		
		//eWallet = eWallet + 100;
		eWallet += 100; // short hand expression
		System.out.println("eWallet is: "+eWallet);
		
		eWallet %= 7; // eWallet = eWallet % 7; -> eWallet = 600 % 7;
		System.out.println("eWallet now is: "+eWallet);
		
		// 3. Increment and Decrement operators
		// ++ and --
		// ++ increments by 1
		// -- decrements by 1
		int quantity = 1;
		
		quantity++; // postfix
		++quantity; // prefix
		++quantity;
		
		quantity--;
		
		System.out.println("Quantity is: "+quantity); // 3
		
		System.out.println();
		
		//int value = quantity++; // copy the value first and update quantity later i.e. the last copy of data
		int value = ++quantity; // update quantity and copy the data into value i.e. the latest data
		System.out.println("value is: "+value);
		System.out.println("quantity is: "+quantity);
		
		eWallet = 300;
		
		// 4. Conditional or Relational
		// >, <, >=, <=, ==, !=
		int cabFare = 300;
		System.out.println("Can i book a Cab? "+(eWallet >= cabFare));
		
		int promoCode = 101;
		int promoCodeByUser = 201;
		
		System.out.println("Can i get a Dicsount? "+(promoCode == promoCodeByUser));
		
		// 5. Logical Operators
		// &&, ||, !
		System.out.println("Can i book can and get discount? "+ ( (eWallet >= cabFare) && (promoCode == promoCodeByUser) ) );
		
		boolean isGPSEnabled = true;
		System.out.println("Is GPS Enabled: "+isGPSEnabled);
		System.out.println("Is GPS Not Enabled: "+!isGPSEnabled);
		

	}

}
