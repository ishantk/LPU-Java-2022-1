import java.util.Arrays;

public class MethodsInMemoryWithReferences {

	static void squareOfNumbers(int[] numbers) {
		
		System.out.println(">> numbers is: "+numbers); // HashCode
		
		System.out.println(">> Numbers Before is: "+Arrays.toString(numbers));
		
		for(int idx=0;idx<numbers.length;idx++) {
			numbers[idx] = numbers[idx] * numbers[idx];
		}
		
		System.out.println(">> Numbers After is: "+Arrays.toString(numbers));
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("++ main - started");
		
		int[] data = {10, 20, 30, 40, 50};
		System.out.println(">> data is: "+data); // HashCode
		
		// Arrays is a java.util class
		// if we wish to print data in array :)
		System.out.println("++ Data Before is: "+Arrays.toString(data)); 
		
		// As squareOfNumber is static and it belongs to the same class as main belongs to
		// Hence, we can execute it directly :)
		squareOfNumbers(data); // copying/passing the reference to the method
		
		System.out.println("++ Data After is: "+Arrays.toString(data));  // data here will be modified
		
		System.out.println("++ main - finished");
		// from here method will be exited automatically

	}

}
