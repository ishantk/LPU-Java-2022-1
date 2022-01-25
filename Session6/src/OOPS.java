/*
 	
 	OOPS: Object Oriented Programming Structure -> emphasis itself is on object
 		  1. Object
 		  2. Class
 		  
 		  What is an Object ?
 		  	
 		  	Real World:
 		  		Anything which exists is an object
 		  		
 		  	Computer Science:
 		  		Multi Value Container -> Reference Type
 		  			can be both homogeneous or hetrogeneous
 		  
 		  
 		  What is a Class ?
 		  	
 		  	Real World:
 		  		Class is a drawing of an object
 		  		
 		  	Computer Science:
 		  		Class is a textual representation of the object in memory
 		  		i.e. we describe/define the object using class
 	
 	
 		Q> Why create objects and how we will come to know of the object to be created ?
 		A> Study the requirement sheet of the software solution to be developed
 		
 		Requirement: 
 		Create a Food Delivery App, in which a user can login and place and order by adding
 		food items in the cart. Delivery Agent will deliver the order to the User's Address by picking up from the Restaurant
 	
 		Principle of OOPS
 		1. Identification of Objects
 			Simply pickup the terms which will have lot of data associated (attributes/data members) with it
 			eg: User : name, phone, email, address, gender, city, state etc...
 				Restaurant: name, phone, email, address, ratings, reviews, operatingHours, pricePerPerson
 				Dish: name, description, price, quantity...
 				.
 				..
 				....
 				
 				Object: User
 				Attributes: name, phone, email, address, gender, city, state 
 				
 		2. Create its class
 				this is a definition of an object as identified above
 				
 		3. From the class create a real object in memory		
 */

// 1. Identification of Object
//    User: name, phone, email, address, gender, city, state 

// 2. Create its class
// Whatever we wish to have inside the object, we write inside the class
class User{ // this is the definition of User Object
	
	// Attributes: Property of Object and not of class i.e. they belong to object and not to class
	String name;
	String phone;
	String email;
	char gender;
	String addressLine;
	String city;
	String state; 
	int zipCode;
	
}


public class OOPS {

	public static void main(String[] args) {
	
		// 3. From the class create a real object in memory		
		User user1 = new User(); // Object Construction Statement // user registered from the mobile applocation
		User user2 = new User();
		
		// consider the same user logged in from the web
		User user3 = user1; // Reference Copy Operation
		
		// new is an operator which creates the objects in the RAM area i.e. HEAP
		// new creates the objects dynamically i.e. when program is executed
		
		// user1 and user2 are reference variables
		// they contain the hash code of the User Object
		System.out.println("user1 is: "+user1);
		System.out.println("user2 is: "+user2);
		System.out.println("user3 is: "+user3);
		
		System.out.println();
		
		// Operations on the Objects
		// 1. Add Data
		user1.name = "John";
		user3.phone = "+91 99999 11111"; // this is same as user1 adding the data
		user3.addressLine = "Redwood Shores";
		user1.zipCode = 12001;
		user1.email = "john@example.com";
		user1.city = "ABC";
		user1.state =" XYZ";
		user1.gender = 'M';
		
		user2.name = "Fionna";
		user2.phone = "+91 80808 10101"; 
		user2.addressLine = "Country Homes";
		user2.zipCode = 14001;
		user2.email = "fionna@example.com";
		user2.city = "PQR";
		user2.state =" XYZ";
		user2.gender = 'F';
		
		// 2. Update Data
		
		user1.name = "John Watson";
		user3.zipCode = 141001;
		
		// 3. Read Data
		System.out.println("user1 details:");
		System.out.println(user1.name+" lives in "+user1.addressLine+" with zipCode "+user1.zipCode);
		System.out.println();
		
		System.out.println("user2 details:");
		System.out.println(user2.name+" lives in "+user2.addressLine+" with zipCode "+user2.zipCode);
		System.out.println();
		
		System.out.println("user3 details:");
		System.out.println(user3.name+" lives in "+user3.addressLine+" with zipCode "+user3.zipCode);
		System.out.println();
		
		// 4. Delete Data
		// mark your reference to null, so that GC can figure out what is not requried naymore
		/*user1 = null;
		user2 = null;
		user3 = null;
		System.gc(); // Let GC collect the unused objects
		*/
		
		// Above thing is taken care automatically by GC in java
		// In very low memory condition only implement above System.gc call

	}

}
