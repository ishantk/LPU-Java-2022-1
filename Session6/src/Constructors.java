// 1. Think of an Object
//    FlightBooking: fromLocation, toLoaction, departureDate, numOfTravellers, travelClass

// 2. Create the class
class FlightBooking{
	
	String fromLocation;
	String toLoaction;
	String departureDate;
	int numOfTravellers;
	String travelClass;
	
	
	// Constructors: Property of Object
	// Constructor: Same name as that of class name
	//				it has no return type
	//			    for this constructor we have no input

	// DEFAULT CONSTRUCTOR
	FlightBooking(){
		fromLocation = "Delhi";
		toLoaction = "Bangalore";
		departureDate = "26th Jan, 2022";
		numOfTravellers = 4;
		travelClass = "Economy";
	}
	
	// If we do not create a default constructor to give some default or initial values to the attributes
	// compiler creates one in the class which will initialize the attributes to nulls and 0's
	
	
	// PARAMTERIZED CONSTRUCTOR
	// Overloaded Constructors
	FlightBooking(String fl, String tl, String dd, int nt, String tc){
		fromLocation = fl;
		toLoaction = tl;
		departureDate = dd;
		numOfTravellers = nt;
		travelClass = tc;
	}
	
	// Method to update the Flight Booking Details
	void updateFlightBooking(String fl, String tl, String dd, int nt, String tc){
		fromLocation = fl;
		toLoaction = tl;
		departureDate = dd;
		numOfTravellers = nt;
		travelClass = tc;
	}
	
	void showFlightDetails() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Booking Details:");
		System.out.println(fromLocation+" to "+toLoaction
				+" on "+departureDate+" for "+numOfTravellers+" in "+travelClass);
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println();
	}
}

public class Constructors {

	public static void main(String[] args) {
	
		FlightBooking booking1 = new FlightBooking(); // FlightBooking(); => execution of default constructor
		FlightBooking booking2 = new FlightBooking("Chandigarh", "Goa", "1st Feb, 2022", 3, "Business");
		
		
		/*System.out.println("Booking Details:");
		System.out.println(booking1.fromLocation+" to "+booking1.toLoaction
				+" on "+booking1.departureDate+" for "+booking1.numOfTravellers+" in "+booking1.travelClass);
		
		System.out.println();
		
		System.out.println("Booking Details:");
		System.out.println(booking2.fromLocation+" to "+booking2.toLoaction
				+" on "+booking2.departureDate+" for "+booking2.numOfTravellers+" in "+booking2.travelClass);
		*/
		
		//booking1.fromLocation = "Chennai";
		//....
		
		booking1.updateFlightBooking("Mumbai", "Chennai", "26th Jan, 2022", 8, "Economy");
		
		booking1.showFlightDetails();
		booking2.showFlightDetails();
		
	}

}
