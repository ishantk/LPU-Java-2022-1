
/*abstract class SayHello{
	abstract void greet(String name);
	abstract void thanks();
}*/

interface SayHello{
	abstract void greet(String name);
	abstract void thanks();
}


/*class User implements SayHello{
	
	public void greet(String name) {
		System.out.println("Hello, "+name);
	}
	
}*/

public class AnonymousClass {

	public static void main(String[] args) {
		
		//User user = new User(); 		// Direct Object Construction
		
		//SayHello hello = new User();	// Polymorphic Statement | Up Casting :)
		//hello.greet("John");
		
		
		// Anonymous Class 
		// Below instruction is a single instruction
		// which creates an anonymous class first and then creates an object, 
		// whose hashcode is copied inside hello ref var
		
		// Where to use them ? -> when we want a single object of a class :)
		
		SayHello hello = new SayHello() {
			
			public void greet(String name) {
				System.out.println("Hello, "+name);
			}
			
			public void thanks() {
				System.out.println("Thank You");
			}
			
		};
		
		// hello is a ref var which refers to the object of anoanymous class
		
		
		hello.greet("John Watson");
		
	}

}
