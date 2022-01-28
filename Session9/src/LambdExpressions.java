// Functional Interface -> an interface with only 1 abstract method

@FunctionalInterface // annotation to put up a rule for compilation errors
interface Save{
	void saveData(String name, int amount);
	//void show(); // error
	
	int i = 10;
	int k = 20;
	
	default void hello() {
		System.out.println("this is hello");
	}
	
	static void show() {
		System.out.println("this is show");
	}
}


// This guy is by default a functional interface
interface Taxes{
	double computeTaxes(double amount);
}

// Java 8 Feature :)
public class LambdExpressions {

	public static void main(String[] args) {
		
		// We can use Lambda Expression only on Functional Interfaces
		Save save = (String name, int amount) -> {
			
			System.out.println("We have saved the record "+name+" "+amount);
		};
		
		save.saveData("John", 100);
		save.hello();
		//save.show(); error
		Save.show();
		
		//Lambda Expression
		/*Taxes taxes = (double amount) -> {
			return amount * 0.18;
		};*/
		
		// no need to pass data type for inputs
		/*Taxes taxes = (amount) -> {
			return amount * 0.18;
		};*/
		
		// 1 single line of code :) When function directly returns a computation
		Taxes taxes = (amount) -> (amount > 1000) ? amount * 0.18 : amount * 0.20;
		
		
		System.out.println(taxes.computeTaxes(1200));
		System.out.println(taxes.computeTaxes(1600));

	}

}
