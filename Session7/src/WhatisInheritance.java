
// Inheritance - Parent Child Relationship
// John Watson is Parent
// Fionna Watson is Child -> Hence we can say Fionna IS-A John Watson

// Ramesh Tendulkar
// Sachin -> Sachin Ramesh Tendulkar -> IS-A Relationship :)

class Parent{
	
	String fname;
	String lname;
	int wealth;
	
	Parent(){
		System.out.println("[Parent] Object Constructed");
		fname = "John";
		lname = "Watson";
		wealth = 100000;
	}
	
	void show() {
		System.out.println("[Parent] Details: "+fname+" "+lname+" "+wealth);
	}
}

// Inheritance 
// we use extends keyword to create a relationship between 2 classes
// here we can see Child extends Parent -> IS-A Relationship developed
class Child extends Parent{
	
	String fname;
	int wealth;
	String companyName;
	
	Child(){
		System.out.println("[Child] Object Constructed");
		fname = "Fionna";
		wealth = 200000;
		companyName = "ABC Ltd";
	}
	
	// Overriding i.e. redefining the same method which is their in Parent
	// Method must be of same signature also
	void show() {
		super.show();
		// super is a reference variable which is available in the Child
		// it can be used to access property of Parent from the child :)
		//System.out.println("[Child] Details are: "+super.fname+" "+lname+" "+wealth+" "+companyName);
		
		System.out.println("[Child] Details are: "+fname+" "+lname+" "+wealth+" "+companyName);
	}
}


// RULES of Inheritance
// RULE#1 : Before the Object of Child, Object of Parent is constructed in memory
// RULE#2 : Child can access any property in parent, if it does not have its own
// RULE#3 : For anything marked as private in Parent, it is not accessible by Child

public class WhatisInheritance {

	public static void main(String[] args) {
		
		//Parent pRef = new Parent();
		//pRef.show();
		
		Child cRef = new Child();
		System.out.println("cRef is: "+cRef);
		System.out.println();
		
		cRef.wealth -= 5000; // access Parent's wealth and update it by Child. BUT afterwards when child has its own attribute wealth, it will be updated and not parents
		cRef.show();		 // access Parent's show by Child

	}

}
