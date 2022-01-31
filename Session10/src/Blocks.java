
public class Blocks {
	
	String currentLocation;
	String source;
	String destination;
	
	Blocks(){
		System.out.println("3. Blocks Constructor");
		if(currentLocation.equals("delhi")) {
			source = "Delhi";
			destination = "Bangalore";
		}else if(currentLocation.equals("bangalore")) {
			source = "Bangalore";
			destination = "Delhi";
		}else {
			source = "Delhi";
			destination = "Goa";
		}
	}
	
	// Initialization block is executed even before constructor
	// PreProcessing for Initializing the attributes
	{
		System.out.println("2. Initialization Block");
		currentLocation = "bangalore";
	}
	
	// for some class attributes, even before the main
	static {
		System.out.println("0. This is static block");
	}
	
	@Override
	public String toString() {
		return "Blocks [source=" + source + ", destination=" + destination + "]";
	}
	
	


	public static void main(String[] args) {

		System.out.println("1. main Started");
		
		Blocks ref = new Blocks();
		
		System.out.println(ref);

	}

}
