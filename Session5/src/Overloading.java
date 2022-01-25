
public class Overloading {

	static void add(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println("Sum of 2 numbers (int) is: "+sum);
	}
	
	// Duplicated method -> even if the names to the inputs/args are changed :)
	// even return type will not be of use to make the method unique
	/*static int add(int n1, int n2) {
		int sum = n1 + n2;
		return sum
	}*/
	
	// Duplicating the method is allowed only if we have UNIQUE INPUTS
	static void add(int num1, int num2, int num3) {
		int sum = num1 + num2 + num3;
		System.out.println("Sum of 3 numbers (int) is: "+sum);
	}
	
	static void add(double num1, double num2) {
		double sum = num1 + num2 ;
		System.out.println("Sum of 2 numbers (double) is: "+sum);
	}
	
	static void add(double num1, int num2) {
		double sum = num1 + num2 ;
		System.out.println("Sum of 2 numbers (double and int) is: "+sum);
	}
	
	static void add(int num1, double num2) {
		double sum = num1 + num2 ;
		System.out.println("Sum of 2 numbers (int and double) is: "+sum);
	}
	
	// Compile Time Polymorphism
	// >> Overloading
	// RULES to Overload:
	// 1. Name must be Same
	// 2. Inputs must be UNIQUE
	// 		2.1 number of inputs
	//      2.2 type of inputs
	//      2.3 sequence of inputs
	// 3. Return type has no role to play
	
	public static void main(String[] args) {
		
		add(10, 20);
		add(10, 20, 30);
		add(10.22, 20.33);
		add(10, 2.2);
		add(2.2, 33);

	}

}
