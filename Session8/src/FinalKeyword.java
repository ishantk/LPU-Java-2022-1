// Payment Gateway itself is can be extended which means we can further do lot of things
// Marking the class as final, we cannot inherit it
final class PayTMPaymentGateway{
	
	//final void pay(int amount) {
	void pay(int amount) {
		System.out.println("[PayTM] - Amount Processed");
		System.out.println("[PayTM] - Thank you for paying: "+amount);
	}
	
}

class MyAppPaymentsPage{// extends PayTMPaymentGateway{
	
	// Re-Define the method of parent
	// if the method in parent is marked as final, you cannot override it :)
	/*void pay(int amount) {
		amount+=10;
		System.out.println("[MyApp] - Amount Processed");
		System.out.println("[MyApp] - Thank you for paying: "+amount);
	}*/
	
	void payForYourOrder(int amount) {
		// Now we are limited to have only the object of PaymentGateway
		PayTMPaymentGateway payment = new PayTMPaymentGateway();
		payment.pay(amount);
	}
	
	
	
}


public class FinalKeyword {

	public static void main(String[] args) {
		
		// final variable is a variable which cannot be modified :)
		final String apiEndPoint = "https://newsapi.org/somenews";
		
		// error
		//apiEndPoint = "https://hello/somenews";
		
		MyAppPaymentsPage payment = new MyAppPaymentsPage();
		//payment.pay(2000);
		payment.payForYourOrder(3000);

	}

}
