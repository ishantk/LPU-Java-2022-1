
public class MethodsInMemory {
	
	
	static int incrementNumber(int number) {
		return ++number;
	}
	
	static void squareOfNumber(int number) {
		
		// update the value from above method
		number = incrementNumber(number);
		
		System.out.println(">> squareOfNumber - started");
		
		System.out.println(">> Number Before is: "+number); // 12
		number = number * number;
		System.out.println(">> Number After is: "+number);  // 144
		
		System.out.println(">> squareOfNumber - finished");
		// from here method will be exited automatically
	}

	
	// main is a static method
	// it is executed by JVM for us, when we run our program
	public static void main(String[] args) {
		
		System.out.println("++ main - started");
		
		
		int data = 11;
		
		System.out.println("++ Data Before is: "+data); // 11
		
		// As squareOfNumber is static and it belongs to the same class as main belongs to
		// Hence, we can execute it directly :)
		squareOfNumber(data); // copying/passing the value to the method
		
		System.out.println("++ Data After is: "+data);
		
		System.out.println("++ main - finished");
		// from here method will be exited automatically
	}

}
