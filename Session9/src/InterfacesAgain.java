// static in Interfaces is the property of Interfaces
interface Inf{

	// Variables in interface are by default -> public and static
	int number = 10;			 // -> public static final int number = 10;
	String appName = "WhatsApp";	 // -> public static final String appName = "WhatsApp;
	
	void show();  // -> public abstract void show();
	
	default void hello() {
		System.out.println("This is hello from Inf");
	}
	
	static void thanks() {
		System.out.println("Thank you all :)");
	}
	
}

class CA implements Inf{
	
	public void show() {
		System.out.println("This is show from CA");
	}
	
	void sayHello(String name) {
		System.out.println("Hello, "+name+" from CA");
	}
}


public class InterfacesAgain {

	public static void main(String[] args) {
		
		// Polymorphic Statement -> Ref Var of Interface can refer to the object of CA
		Inf iRef = new CA();
		System.out.println("number is: "+iRef.number+" and appName is: "+iRef.appName);
		System.out.println("number is: "+Inf.number+" and appName is: "+Inf.appName);
		
		iRef.hello();
		//iRef.thanks();         // error
		iRef.show();
		//iRef.sayHello("John"); // error
		
		// Static methods can be accessed by the Interface name
		Inf.thanks();
		// CA.thanks(); // error
		
		System.out.println();
		
		// Down Casting :)
		CA cRef = (CA)iRef;
		cRef.show();
		cRef.hello();
		cRef.sayHello("John");
		System.out.println("number is: "+CA.number);
		System.out.println("appName is: "+CA.appName);
	}

}
