class User{
	
	String name;
	String phone;
	String email;
	
	// 1 user has 1 address
	Address address; // Has-A Relationship (1 to 1)
	Order[] orders;  // Has-A Relationship (1 to many)

	User(){
		
	}
	
	
	
	User(String name, String phone, String email, Address address, Order[] orders) {
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.orders = orders;
	}



	void showUser() {
		System.out.println("User Details:");
		System.out.println(name+" "+phone+" "+email);
		System.out.println("~~~~~~~~~~~~~~~~~~");
		address.showAddress();
		
		System.out.println("Orders for User "+name);
		for(Order order : orders) {
			order.showOrder();
		}
	}
	
}

class Address{
	
	String addressLine;
	String city;
	String state;
	int zipCode;
	String label;
	
	Address(){
		
	}
	
	Address(String addressLine, String city, String state, int zipCode, String label) {
		this.addressLine = addressLine;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.label = label;
	}
	
	void showAddress() {
		System.out.println("Address Details: ");
		System.out.println(addressLine + " "+city + " "+state+" "+zipCode+" "+label);
		System.out.println();
	}
}

class Order{
	
	int oid;
	String date;
	int amount;
	
	//Dish[] dishes; // implement this :)
	
	Order(){
		
	}

	Order(int oid, String date, int amount) {
		this.oid = oid;
		this.date = date;
		this.amount = amount;
	}
	
	void showOrder() {
		System.out.println("Order Details: ");
		System.out.println(oid + " "+date + " "+amount);
		System.out.println();
	}
}


public class HasARelationship {

	public static void main(String[] args) {
		
		Order o1 = new Order(1, "22nd Jan, 2022", 200);
		Order o2 = new Order(2, "24th Jan, 2022", 500);
		Order o3 = new Order(3, "26th Jan, 2022", 350);
		
		Order[] orders = {o1, o2, o3}; // Array of Order Objects :)
		
		Address aRef = new Address("Redwood Shores", "Ludhiana", "Punjab", 141001, "WORK");
		User uRef = new User("John", "+91 99999 11111", "john@example.com", aRef, orders);
		
		uRef.showUser();
		
		// Assignment: For 1 Order we can have many Dishes
		//				Complete the above program where you will link multiple Dish Objects with 1 Order :)

	}

}
