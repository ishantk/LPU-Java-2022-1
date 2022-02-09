package com.auribises.bean;

// Bean : A Java Object
//		  We must have setters and getters for the attributes which must be public
public class Product {
	
	// Attributes
	int id;
	String name;
	int price;
	String brand;
	int stock;
	boolean canBuy;
	
	public Product() {
		System.out.println("[Product] Object Created");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public boolean isCanBuy() {
		return canBuy;
	}

	public void setCanBuy(boolean canBuy) {
		this.canBuy = canBuy;
	}
	
	// Business Logic Method
	// Contains 2 inputs 
	/*public void purchaseProduct(String deliveryAddress, String deliveryTime) {
		
		// 1. [PRE-PROCESSING] Check the Stock based on which purchase can be made
		if(stock > 0) {
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("[PurchaseProduct] - Stock Validated");
			System.out.println("[PurchaseProduct] - Please initiate transaction of amount "+price+" for "+name);
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println();
			
			// 2. [CORE BUSINESS LOGIC] Process the Payment
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("Online Bank Transaction Started for amount of "+price);
			System.out.println("Thank You for your Payment of "+price+" for "+name);
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println();
			
			// 3. [POST-PROCESSING] Notify the Customer and may be delivery and dispatch teams for the Order
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("Email Sent with an Invoice");
			System.out.println("You Product "+name+" will be delivered at "+deliveryAddress+" by "+deliveryTime);
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println();
			System.out.println("Notified Logistcis Team for Dispatch");
		}else {
			System.out.println("OOPS! Product "+name+" is out of Stock. Please come back and check again !");
		}
		
	}*/
	
	public void purchaseProduct(String deliveryAddress, String deliveryTime) {
		
		if(canBuy) {
			// 2. [CORE BUSINESS LOGIC] Process the Payment
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("Online Bank Transaction Started for amount of "+price);
			System.out.println("Thank You for your Payment of "+price+" for "+name);
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			canBuy = true;
			System.out.println();
		}else {
			System.out.println("OOPS! Product "+name+" is out of Stock. Please come back and check again !");
		}
		
	}


	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", brand=" + brand + ", stock=" + stock
				+ ", canBuy=" + canBuy + "]";
	}
}
