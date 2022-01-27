// Assume: This code is from Razorpay team
// Razorpay payment gateway class
final class RazorPay{
	
	
	RazorPayCallbacks callbacks; // reference variable to RazorPayCallbacks
	// it will refer to the object of ZomatoPayment as per Polymorphic Statement
	
	boolean isBankInterfaceUp = false;
	
	void pay(int amount) {
		if(isBankInterfaceUp) {
			System.out.println("[RazorPay] Payment is done for amount: "+amount);
			callbacks.onSuccess("Payment success", 101);
		}else {
			System.out.println("[RazorPay] Payment is not done for amount: "+amount);
			System.out.println("[RazorPay] Bank Interfcae is down. Please try again");
			callbacks.onFailure("Payment Failed", 201);
		}
	}
	
	void on(RazorPayCallbacks callbacks) {
		this.callbacks = callbacks;
	}
}


// Callbacks class
// abstract class is a class for which we cannot create objects
// hence, their is a feature of no method execution for this class directly
abstract class RazorPayCallbacks{
	
	// abstract methods -> can only be created inside the abstract class
	// they do not have definition
	// abstract methods are the RULES, which child must define
	abstract void onSuccess(String message, int code);
	abstract void onFailure(String message, int code);
	
}


// Assume: This code is in Zomato
//         Zomato is internally using Razorpay
class ZomatoPayment extends RazorPayCallbacks{
	
	void payForOrder(int amount) {
		
		System.out.println("Processing Your Payment. Please Wait...");
		
		// here we will internally open the RazorPay payment gateway
		RazorPay razorPay = new RazorPay();
		// this is a reference variable which is referring to the current object of ZomatoPayment
		// RazorPayCallbacks callbacks = new ZomatoPayment(); // Polymorphic Statement
		razorPay.on(this); 
		
		razorPay.pay(amount);
	}
	
	void onSuccess(String message, int code) {
		if(message.contains("success") && code == 101) {
			System.out.println("[ZOMATO] Your Order is Placed");
			System.out.println("[ZOMATO] Delivery Agent it assigned");
		}
	}
	
	void onFailure(String message, int code) {
		System.out.println("[ZOMATO] Please try other payment method");
	}
}



public class AbstractClass {

	public static void main(String[] args) {
	
		ZomatoPayment payment = new ZomatoPayment();
		payment.payForOrder(300);

	}

}
