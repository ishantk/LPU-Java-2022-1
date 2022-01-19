/*
		 	MODEL 
		 		Storage Container
		 			1. Single Value Containers	| PRIMITIVE TYPES
		 				a single value
		 					
		 					INTEGRAL
		 					FLOATING POINT
		 					CHARACTER
		 					LOGICAL
		 				
		 			2. Multi Value Containers	| REFERENCE TYPES
		 				More than one value
		 				2.1 Homogeneous
		 					STRING
		 					ARRAY
		 					OBJECT
		 				
		 				2.2 Hetrogeneous
		 					OBJECT
		 			
		 	VIEW 
		 	
		 	CONTROLLER
		 	
		 	
		 	DATA TYPES -> To create a storage container we need to define the type of it
			 	1. Integral
			 		byte	8 bits
			 		short	16 bits
			 		int 	32 bits
			 		long	64 bits
			 		
			 	2. Floating Point
			 		float	32 bits
			 		double	64 bits
			 		
			 	3. Character
			 		char	16 bits
			 		
			 	4. 	Logical
			 		boolean	8 bits [out of 8 bits only 1 bit is used]
		 	
*/


// class is a basic requirement for the java program
public class DataTypes {

	// main method
	// from where the execution begins
	public static void main(String[] args) {
		
		// 1. Creational Statement -> Create a Storage Container named as age | age(variable)
		// Store the data 35 in it | 35 (literal)
		// byte is the type of storage container which means allocate a sixe of 8 bits
		byte age = 35; // 0 0 0 0  0 0 0 0  0 0 0 0  0 1 0 0 
		// age is 8 bits (stack) while 35 is 32 bits (constant pool)
		
		// 2. Read Statement
		System.out.println("1. age is: "+age);

		// 3. Update Statement
		age = 40;
		System.out.println("2. age is: "+age);
		// 8bits -> 2 power 8 | 256 | 256/2 => -128 to 0 to 127
		//age = 128; // error :(
		
		// DOWN CASTING
		// Literal of size 32 bits is copied into 8 bits
		// It is taken case by compiler automatically -> IMPLICIT DOWN CASTING
		
		// We can do it ourself as well
		age = (byte)256;
		System.out.println("3. age is: "+age);

		short s = 120; // short is 16 bits
		
		int eWallet = 300; // int is 32 bits
		
		long phoneNumber = 9090910101L; // 9090910101L -> 64 bit literal in memory

		// Upcasting
		// here 32 bits are copied into 64 bits 
		long data = 200; // 200 -> 32bits :)
		
		
		// Downcasting
		// here 64bits are copied into 32 bits
		// we will get error in downcasting -> add a manual cast
		// but this can be a problem -> as we may loose the data
		int number = (int)data;
		
		// Floating Point
		//float percentage = 75.7; // percentage -> 32 bits | 75.7 -> 64 bits
		float percentage = 75.7F; // percentage -> 32 bits | 75.7 -> 32 bits
		double discount = 0.25;  // discount -> 64 bits | 0.25 64 bits
	
		// Down Casting
		float pi = (float)3.14;
		// Up Casting
		double piAgain = pi;
		
		
		char ch = 65; // ASCII Code
		ch = 'B';     // store the character directly in single quotes
		ch = '\u20b9';
		System.out.println("ch is: "+ch);
		
		char ch1 = '\u0907';
		char ch2 = '\u0936';
		char ch3 = '\u093E';
		System.out.println(ch1+""+ch2+""+ch3);
		
		// Try writing your name in your native language :)
		
		boolean internet = true;
		internet = false;
		
		System.out.println("Is internet enabled: "+internet);
		
		// Primitives cannot store data as multiple values :)
		// eg: we cannot put lot of data in the same container :)
		//int numbers = 10, 20, 30; // error
		//char chr = 'ABCD'; // error

	}

}
