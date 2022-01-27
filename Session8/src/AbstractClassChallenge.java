// Problem with Abstract Classes :(

abstract class RPcallBacks{	// Razorpay Payment Callbacks
	abstract void onSuccess();
	abstract void onFailure();
}

abstract class PTCallBacks{ // PayTm Payment Callbacks
	abstract void onSuccess();
	abstract void onFailure();
}

abstract class PPcallBacks{	// PayPal Payment Callbacks
	abstract void onSuccess();
	abstract void onFailure();
}

// Multiple Inheritance is not supported in Java
// Hence, we cannot have more than 1 Payment Gateway working 
//class ZOPayment extends RPcallBacks, PTCallBacks, PPcallBacks{ // error
class ZOPayment{
	
	void onSuccess() {
		
	}
	
	void onFailure() {
		
	}
}


public class AbstractClassChallenge {

	public static void main(String[] args) {
		

	}

}
