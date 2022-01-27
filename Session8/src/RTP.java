import java.util.Scanner;

class Cab{
	
	int baseFare;
	
	Cab(){
		baseFare = 50;
		System.out.println("[Cab] Object Constructed with baseFare: \u20b9"+baseFare);
	}
	
	void bookCab(String fromLocation, String toLocation) {
		System.out.println("[Cab] Booked from "+fromLocation+" to "+toLocation);
		System.out.println("[Cab] Please Pay: \u20b9"+baseFare);
	}
	
	void stopTrip() {
		System.out.println("Thank You for riding with us");
	}
	
}

// Sedan is an extended version of Cab
class Sedan extends Cab{
	
	boolean isMultiMediaEnabled;
	int softDrinks;
	int chips;
	
	Sedan(){
		baseFare += 80; // updating the baseFare of Parent
		isMultiMediaEnabled = true;
		softDrinks = 2;
		chips = 5;
		System.out.println("[Sedan] Object Constructed with new baseFare: \u20b9"+baseFare);
	}
	
	void bookCab(String fromLocation, String toLocation) {
		System.out.println("[Sedan] Booked from "+fromLocation+" to "+toLocation);
		
		if(isMultiMediaEnabled) {
			System.out.println("[Sedan] Please use the username: guest and password: guest@123 to stream movies");
		}
		
		System.out.println("[Sedan] You can have "+softDrinks+" soft drinks");
		System.out.println("[Sedan] You can eat from "+chips+" variety of chips");
		
		System.out.println("[Sedan] Please Pay: \u20b9"+baseFare);
	}
	
}

class SharedCab extends Cab{
	
	int numberOfPassengers;
	
	SharedCab(){
		baseFare -= 20;
		numberOfPassengers = 3;
		System.out.println("[SharedCab] Object Constructed with baseFare: \u20b9"+baseFare);
	}
	
	SharedCab(int passengers){
		//....
	}
	
	void bookCab(String fromLocation, String toLocation) {
		System.out.println("[SharedCab] Booked from "+fromLocation+" to "+toLocation);
		System.out.println("[SharedCab] Total of "+numberOfPassengers+" will be sharing the cab");
		System.out.println("[SharedCab] Please Pay: \u20b9"+baseFare);
	}
	
	void splitFare() {
		System.out.println("You can choose an option to split fare among other passengers");
	}
	
}

// Design Pattern -> Factory Design Pattern :)
class CabFactory{
	
	static Cab selectCab(int type) {
		
		Cab cab = null;
		
		// RTP :)
		if(type == 1) {
			cab = new Sedan(); // cab is selected as Sedan by user
		}else if(type == 2) {
			cab = new SharedCab(); // cab is selected as SharedCab by user
		}else {
			System.out.println("Please enter a valid choice");
		}
	
		return cab;
	}
	
}


/*
 	Hierarchy
 	
 	 Cab
 	  |
Sedan	SharedCab 	 
 	 
 */

public class RTP {

	public static void main(String[] args) {
		
		/*Cab cab;
		cab = new Cab();
		cab.bookCab("Home", "Work");*/
		
		
		/*Sedan sedan;
		sedan = new Sedan();
		sedan.bookCab("Home", "Work");*/
		
		/*SharedCab sharedCab;
		sharedCab = new SharedCab();
		sharedCab.bookCab("Home", "Work");*/
		
		// Polymorphic Statement -> Ref Var of Parent can refer to the Child object
		/*Cab cab;
		cab = new Sedan();
		cab.bookCab("Home", "Work"); // this will execute the method of child and not parent
		
		System.out.println();
		
		cab = new SharedCab();
		cab.bookCab("Home", "Work"); */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Select the Cab");
		System.out.println("1. Sedan\n2. Shared");
		int typeOfCab = scanner.nextInt();
		
		Cab cab = CabFactory.selectCab(typeOfCab);
		if(cab != null) {
			cab.bookCab("Home", "Work");
			//cab.stopTrip(); // OK
			//cab.splitFare();  // error: parent's reference can execute overrided methods or the methods inside it and nto the child's methods
		}
		scanner.close();
	}
	
	// Assignment: Implement RTP on Amazon Different Payments Methods :)
	//			   Use Factory Design Pattern in your implementation :)	
}
