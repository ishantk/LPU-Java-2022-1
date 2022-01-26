class OneWayFlightBooking{
	
	String fromLocation;
	String toLocation;
	String departureDate;
	int numOfTravellers;
	String travelClass;
	
	OneWayFlightBooking(){
		fromLocation = "Delhi";
		toLocation = "Bangalore";
		departureDate = "27th Jan, 2022";
		numOfTravellers = 1;
		travelClass = "economy";
	}

	OneWayFlightBooking(String fromLocation, String toLocation, String departureDate, int numOfTravellers,
			String travelClass) {
		this.fromLocation = fromLocation;
		this.toLocation = toLocation;
		this.departureDate = departureDate;
		this.numOfTravellers = numOfTravellers;
		this.travelClass = travelClass;
	}
	
	void show() {
		System.out.println("Booking Details");
		System.out.println("~~~~~~~~~~~~~~~");
		System.out.println("From "+fromLocation+" to "+toLocation);
		System.out.println("On "+departureDate);
		System.out.println("For "+numOfTravellers+" in "+travelClass);
	}
	
}

// Just for 1 attribute -> we have to re write the code
// Hence, this can be a big loss in development time :)
// We need Inheritance to Solve this issue

/*class RoundTripFlightBooking{
	
	String fromLocation;
	String toLocation;
	String departureDate;
	String returnDate;
	int numOfTravellers;
	String travelClass;
	
	RoundTripFlightBooking(){
		fromLocation = "Delhi";
		toLocation = "Bangalore";
		departureDate = "27th Jan, 2022";
		returnDate = "30th Jan, 2022";
		numOfTravellers = 1;
		travelClass = "economy";
	}

	
	
	RoundTripFlightBooking(String fromLocation, String toLocation, String departureDate, String returnDate,
			int numOfTravellers, String travelClass) {
		this.fromLocation = fromLocation;
		this.toLocation = toLocation;
		this.departureDate = departureDate;
		this.returnDate = returnDate;
		this.numOfTravellers = numOfTravellers;
		this.travelClass = travelClass;
	}



	void show() {
		System.out.println("Booking Details");
		System.out.println("~~~~~~~~~~~~~~~");
		System.out.println("From "+fromLocation+" to "+toLocation);
		System.out.println("On "+departureDate);
		System.out.println("Back On "+returnDate);
		System.out.println("For "+numOfTravellers+" in "+travelClass);
	}
	
}*/

// Simply relate the classes
class RoundTripFlightBooking extends OneWayFlightBooking{
	
	// Only create additional attributes
	// Because as per Inheritance Rule, parent object will be created before child and child can access data of parent
	String returnDate;
	
	RoundTripFlightBooking(){
		//super(); -> even if you dont write super, it will be automatically added by compiler 
	}
	
	RoundTripFlightBooking(String returnDate){
		super(); // execute Parent's default constructor
		this.returnDate = returnDate;
	}

	RoundTripFlightBooking(String fromLocation, String toLocation, String departureDate, String returnDate,
			int numOfTravellers, String travelClass) {
		// Parent initialization
		super(fromLocation, toLocation, departureDate, numOfTravellers, travelClass); // super parent executed here
		
		// Child initialization
		this.returnDate = returnDate;
	}
	
	void show() {
		System.out.println("Round Trip Booking Details");
		super.show(); // execute Parent's show
		System.out.println("Back On "+returnDate);
	}
	
}

public class WhyInheritance {

	public static void main(String[] args) {
		
		OneWayFlightBooking booking = new OneWayFlightBooking();
		booking.show();
		
		System.out.println();
		
		//RoundTripFlightBooking returnBooking = new RoundTripFlightBooking("30th Jan, 2022");
		RoundTripFlightBooking returnBooking = new RoundTripFlightBooking
				("Goa", "Mumbai", "27th Jan, 2022", "2nd Feb, 2022", 2, "business");
		returnBooking.show();
		
		// Polymorphic Statement
		// Reference Variable of Parent can refer to the Object of Child
		OneWayFlightBooking refVar = new RoundTripFlightBooking();
		// But vice versa isn't possible i.e. child cannot refer to parent

	}

}
