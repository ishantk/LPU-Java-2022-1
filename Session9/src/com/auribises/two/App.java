package com.auribises.two;
import com.auribises.one.One; // import the class from other package to be used here
//import com.auribises.one.Two; // import on default classes cannot be done

// default -> accessible inside the same package
// protected -> accessible inside the same package, and is accessible outidse the package in the child class
// public -> accessible anywhere and everywhere

// Package Level Inheritance
class CA extends One{
	
	void show() {
		//pvtShow(); // error
		//defShow(); // error
		
		// inside the child, protected is accessible
		protShow(); // OK
		pubShow(); // Ok
	}
	
}

public class App {

	public static void main(String[] args) {
		
		//One oRef = new One();
		//oRef.pvtShow(); // error
		//oRef.defShow(); // error
		//oRef.protShow(); // error
		
		//oRef.pubShow(); // OK
		
		CA cRef = new CA();
		cRef.show();
		//cRef.protShow(); // Child cannot access protected outside its class boundary
		cRef.pubShow();

	}

}
