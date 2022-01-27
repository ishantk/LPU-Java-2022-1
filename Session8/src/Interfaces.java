abstract class CA{
	
	// Constructor is allowed
	// As per rule of inheritance, parent object is created and then child object is created
	// JVM will create the parent object for abstract classes, but developer cannot create a direct object
	CA(){
		
	}
	
	void hello() {
		System.out.println("This is hello from CA");
	}
	
	abstract void show();
}

interface Inf{
	
	// error: cannot create constructors. Hence, interfaces cannot be extended
	/*Inf(){
		
	}*/
	
	// error: methods cannot be defined directly
	/*
	void hello() {
		System.out.println("This is hello from Inf");
	}*/
	
	void show(); // by default => public abstract void show();
}


interface GPay{
	
	// we can define the methods in interfaces, by making them default :)
	default void payFromGPay(int amount) {
		System.out.println("[GPay]: Payment Done for amount: "+amount);
		onSuccess("Payment Success");
	}
	
	void onSuccess(String message); // -> public abstract
	void onFailure(String message); // -> public abstract
	
}

interface Paytm{
	
	default void payFromPayTM(int amount) {
		System.out.println("[Paytm]: Payment Done for amount: "+amount);
		onPaymentSuccess("Payment Success");
	}
	
	void onPaymentSuccess(String message); // -> public abstract
	void onFailure(String message); // -> public abstract
}

// If a class is implementing rather than extending, this is not Inheritance :) 
// Multiple Implementation :) and NOT Multiple Inheritance :)
/*class SwiggyPayment implements GPay, Paytm{
	
	public void onSuccess(String message) {
		System.out.println("[SWIGGY] Payment is Success: "+message);
		System.out.println("[SWIGGY] We will deliver your order soon");
	}
	
	public void onPaymentSuccess(String message) {
		System.out.println("[SWIGGY] Payment is Success: "+message);
		System.out.println("[SWIGGY] We will deliver your order soon");
	}
	
	public void onFailure(String message) {
		System.out.println("[SWIGGY] Payment Failed. Please try Other Method");
	}
	
}*/

// Interface inheriting interface
// Interface can extends other interface and that too on multiple level
interface SwiggyPaymentMethods extends GPay, Paytm{
	
}

class SwiggyPayment implements SwiggyPaymentMethods{//GPay, Paytm{
	
	public void onSuccess(String message) {
		System.out.println("[SWIGGY] Payment is Success: "+message);
		System.out.println("[SWIGGY] We will deliver your order soon");
	}
	
	public void onPaymentSuccess(String message) {
		System.out.println("[SWIGGY] Payment is Success: "+message);
		System.out.println("[SWIGGY] We will deliver your order soon");
	}
	
	public void onFailure(String message) {
		System.out.println("[SWIGGY] Payment Failed. Please try Other Method");
	}
	
}

public class Interfaces {

	public static void main(String[] args) {
		
		// We cannot create objects for both
		//CA cRef = new CA();		// error
		//Inf iRef = new Inf();   // error
		
		//SwiggyPayment payment = new SwiggyPayment();
		//payment.payFromGPay(2000);
		//payment.payFromPayTM(3000);
		
		// Polymorphic Statement
		// Reference Variable of Interface can refer to the object of class which implements it
		//Paytm ref = new SwiggyPayment();
		//ref.payFromPayTM(2000);
		
		//GPay pay = new SwiggyPayment(); // OK
		
		SwiggyPaymentMethods methods = new SwiggyPayment();
		//methods.payFromGPay(3000);
		methods.payFromPayTM(2000);

	}

}
