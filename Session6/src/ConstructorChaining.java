
class Customer{
	
	String name;
	String phone;
	String email;
	
	boolean isPrime;
	String membershipValidTill;
	boolean isMusicAccessible;
	boolean isVideoAccessible;
		
	Customer() {
	
	}
	
	Customer(boolean isPrime) {
		
		if(isPrime) {
			this.isPrime = isPrime;
			this.membershipValidTill = "26th Jan, 2023";
			this.isMusicAccessible = true;
			this.isVideoAccessible = true;
		}
	}
	
	Customer(String name, String phone, String email, boolean isPrime) {
		
		// breaking down the logic
		this(isPrime); 
		
		// this constructor execution is always the first statement
		/*if(isPrime) {
			this(isPrime); // execute constructor from a constructor
		}*/
		
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.isPrime = isPrime;
	}
	

	Customer(String name, String phone, String email, boolean isPrime, String membershipValidTill,
			boolean isMusicAccessible, boolean isVideoAccessible) {
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.isPrime = isPrime;
		this.membershipValidTill = membershipValidTill;
		this.isMusicAccessible = isMusicAccessible;
		this.isVideoAccessible = isVideoAccessible;
	}
	
	void setCustomerDetails(String name, String phone, String email, boolean isPrime, String membershipValidTill,
			boolean isMusicAccessible, boolean isVideoAccessible) {
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.isPrime = isPrime;
		this.membershipValidTill = membershipValidTill;
		this.isMusicAccessible = isMusicAccessible;
		this.isVideoAccessible = isVideoAccessible;
	}
	
	void showCustomerDetails() {
		System.out.println("Customer Details: ");
		System.out.println(name+" "+phone+" "+email);
		if(isPrime) {
			System.out.println("Prime Renews on: "+membershipValidTill);
		}
		
		System.out.println();
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	String getPhone() {
		return phone;
	}

	void setPhone(String phone) {
		this.phone = phone;
	}

	String getEmail() {
		return email;
	}

	void setEmail(String email) {
		this.email = email;
	}

	boolean isPrime() {
		return isPrime;
	}

	void setPrime(boolean isPrime) {
		this.isPrime = isPrime;
	}

	String getMembershipValidTill() {
		return membershipValidTill;
	}

	void setMembershipValidTill(String membershipValidTill) {
		this.membershipValidTill = membershipValidTill;
	}

	boolean isMusicAccessible() {
		return isMusicAccessible;
	}

	void setMusicAccessible(boolean isMusicAccessible) {
		this.isMusicAccessible = isMusicAccessible;
	}

	boolean isVideoAccessible() {
		return isVideoAccessible;
	}

	void setVideoAccessible(boolean isVideoAccessible) {
		this.isVideoAccessible = isVideoAccessible;
	}
}

public class ConstructorChaining {

	public static void main(String[] args) {
		

		Customer customer1 = new Customer("Fionna", "+91 99999 11111", "fionna@example.com", true);
		Customer customer2 = new Customer("John", "+91 99999 11111", "john@example.com", false);
		
		customer1.showCustomerDetails();
		customer2.showCustomerDetails();
		
	}

}
