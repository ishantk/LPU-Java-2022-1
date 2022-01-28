package com.auribises.one;

public class App {

	public static void main(String[] args) {
		
		One oRef = new One();
		Two tRef = new Two();
		
		// private is not accessible
		//oRef.pvtShow(); // error
		oRef.defShow();
		oRef.protShow();
		oRef.pubShow();
		
		System.out.println();
		
		// private is not accessible
		// tRef.pvtShow(); // error
		tRef.defShow();
		tRef.protShow();
		tRef.pubShow();
		
	}

}

// private: not accessible outside the class boundary
