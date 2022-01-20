import java.util.Scanner;

/*
 	View
 		Console Based -> black screen with text
 		GUI Based -> Screen with interfaces having ui elements like textfields, buttons etc
 	
 	Controller
 		Operators
 		if/else
 		loops
 */
public class ConditionalConstructs {

	public static void main(String[] args) {
		
		// Read data from User using a class called Scanner
		Scanner scanner = new Scanner(System.in); // Scanner Object Construction
		
		System.out.println("Enter an Amount: ");
		double amount = scanner.nextDouble(); // to read a double
		
		System.out.println("Enter Promo Code: ");
		//String promoCode = scanner.nextLine(); // to read a String
		int promoCode = scanner.nextInt();
		
		scanner.close(); // release the memory resources
		
		
		System.out.println("Amount is: "+amount);
		System.out.println("Promo Code is: "+promoCode);
		
		// 2 Promo Codes :)
		
		int JUMBO = 101;   // Flat 50% off for the items worth 200 or more
		int ZOMHELLO = 201; // Flat 60% off for the items worth 159 or more upto 120
		
		// Simple if/else -> replaced with ternary operator :)
		/*if(amount >= 159) {
			System.out.println("You will get Dicsount");
		}else {
			System.out.println("No Discount Available");
		}*/
		
		
		double discount = 0;
		
		/*if(promoCode == JUMBO && amount >=200) {
			System.out.println("Promo Code Applied Successfully");
			discount = 0.5 * amount;
		}else {
			System.out.println("Invalid Promo Code or amount is lesser");
		}*/
		
		// Nested if/else
		/*if(amount >= 200) {
			
			// Nested if/else
			if(promoCode == JUMBO) {
				discount = 0.5 * amount;
				System.out.println("Promo Code JUMBO Applied Successfully");
			}else {
				System.out.println("Invalid Promo Code. Please try using JUMBO or ZOMHELLO codes");
			}
			
		}else {
			System.out.println("Amount is Lesser. Please add items worth "+(200-amount)+" more");
		}*/
		
		
		// Ladder if/else
		/*if(promoCode == JUMBO) {
			
			// Nested if/else
			if(amount >= 200) {
				discount = 0.5 * amount;
				System.out.println("Discount is: "+discount);
				System.out.println("Promo Code JUMBO Applied Successfully");
			}else {
				System.out.println("Amount is Lesser. Please add items worth "+(200-amount)+" more");
			}
			
		}else if(promoCode == ZOMHELLO) {
			
			// Nested if/else
			if(amount >= 159) {
				discount = 0.6 * amount;
				
				if(discount >= 120) {
					discount = 120;
				}
				
				System.out.println("Discount is: "+discount);
				
				System.out.println("Promo Code ZOMHELLO Applied Successfully");
			}else {
				System.out.println("Amount is Lesser. Please add items worth "+(159-amount)+" more");
			}
			
		}else {
			System.out.println("Invalid Promo Code");
		}*/
		
		
		
		// Assignment: 1. Implement Ternary Operators if possible in above scenario
		// 			   2. Whenever a wrong promo code is applied, tell the user whats the right promo code 
		//			   3. implement a use case i.e. Book a Cab by taking OLA/Uber as a case study
		
		// switch case
		
		//int case1 = 101;
		final int case1 = 101; // final is a constant in java
		//case1 = 2000; // error
		
		switch (promoCode) {
			
			//case case1: -> cases cannot be variables :) -> error
			//case 101:	
			case case1:	// -> ok if you mark case1 as final :)
				// Nested if/else
				if(amount >= 200) {
					discount = 0.5 * amount;
					System.out.println("Discount is: "+discount);
					System.out.println("Promo Code JUMBO Applied Successfully");
				}else {
					System.out.println("Amount is Lesser. Please add items worth "+(200-amount)+" more");
				}
				
				break;
				
			case 201:
				
				// Nested if/else
				if(amount >= 159) {
					discount = 0.6 * amount;
					
					if(discount >= 120) {
						discount = 120;
					}
					
					System.out.println("Discount is: "+discount);
					
					System.out.println("Promo Code ZOMHELLO Applied Successfully");
				}else {
					System.out.println("Amount is Lesser. Please add items worth "+(159-amount)+" more");
				}
				
				break;
				
			default:
				System.out.println("Invalid Promo Code");
		}
		
		amount -= discount;
		System.out.println("Please Pay: \u20b9"+amount);
		
		// We can have nested switch cases as well :)
		
		
	}

}
