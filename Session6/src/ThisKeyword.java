
class Student{
	
	int roll;
	String name;
	
	Student(){
		// this is a keyword available in class
		// which refers to the current object i.e. it will always hold the hashcode for the object in execution phase
		System.out.println("this is: "+this);
	}
	
	Student(int roll, String name){
		// LHS this.roll is the attribute of object
		// RHS roll is to the Constructor input
		this.roll = roll;
		this.name = name;
	}
	
	
	
}

// Plain Old Java Object
// Spring FW -> Bean
// General -> Model
class Dish{
	
	private String name;
	private int price;
	private String description;
	private double ratings;
	
	
	
	Dish() {
		
	}



	Dish(String name, int price, String description, double ratings) {
		this.name = name;
		this.price = price;
		this.description = description;
		this.ratings = ratings;
	}



	String getName() {
		return name;
	}



	void setName(String name) {
		this.name = name;
	}



	int getPrice() {
		return price;
	}



	void setPrice(int price) {
		this.price = price;
	}



	String getDescription() {
		return description;
	}



	void setDescription(String description) {
		this.description = description;
	}



	double getRatings() {
		return ratings;
	}



	void setRatings(double ratings) {
		this.ratings = ratings;
	}
	
	
	
}


public class ThisKeyword {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		System.out.println("s1 is: "+s1);
		
		System.out.println();
		
		Student s2 = new Student();
		System.out.println("s2 is: "+s2);

	}

}
