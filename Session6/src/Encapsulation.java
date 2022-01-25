class PrepaidMobileBill{
	
	private String phoneNumber;
	private String operator;
	private int amount;
	
	PrepaidMobileBill(){
		phoneNumber = "";
		operator = "";
		amount = 10;
	}
	
	void showDetails() {
		System.out.println("Details: ");
		System.out.println(phoneNumber+" will be recharged with "
				+operator+ " for amount "+amount);
	}
	
	// Setter method
	void setPhoneNumber(String number) {
		if(!number.isEmpty() && number.length() >=10 && number.startsWith("+91")) {
			phoneNumber = number;
		}else {
			System.out.println("Invalid Phone Number");
		}
	}
	
	// Getter Method
	String getPhoneNumber() {
		return phoneNumber;
	}
	
	void setOperator(String op) {
		String operatorList = "airtel, idea, jio, vodafone";
		if(operatorList.contains(op.toLowerCase())) {
			operator = op;
		}else {
			System.out.println("Please select a valid Operator");
		}
	}
	
	String getOperator() {
		return operator;
	}
	
	void setAmount(int amt) {
		if(amt >=10 && amt <=20000) {
			amount = amt;
		}else {
			System.out.println("Invalid Amount");
		}
	}
	
	int getAmount() {
		return amount;
	}
	
}


public class Encapsulation {

	public static void main(String[] args) {
		
		PrepaidMobileBill bill = new PrepaidMobileBill();
		
		// direct access to the attributes can be an issue
		// marking the attributes private will stop a direct access to it
		/*bill.phoneNumber = "Hahah";
		bill.operator = "Whatever";
		bill.amount = -200;*/
		
		bill.setPhoneNumber("+91 99999 11111");
		bill.setOperator("Airtel");
		bill.setAmount(300);
		bill.showDetails();
		
		System.out.println(bill.getOperator()+" "+bill.getAmount());
		

	}

}
