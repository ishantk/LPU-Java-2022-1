package com.auribises.lpu.collections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		
		ArrayList<String> emails = new ArrayList<String>();
		emails.add("john@example.com");		// 0
		emails.add("sia@example.com");
		emails.add("harry@example.com");
		emails.add("george@example.com");
		emails.add("john@example.com");
		emails.add("dave@example.com");
		emails.add("harry@example.com");	// n-1
		
		System.out.println("Emails List: ");
		System.out.println(emails);
		// ArrayList is a data structure where we can have duplicate data
		// This can be a feature or a drawback as per the use case
		
		System.out.println();
		
		//Set<String> emailSet = new HashSet<String>(); // Polymorphic Statement
		
		// No duplicates and unordered data
		//HashSet<String> emailSet = new HashSet<String>(); // Direct Object Construction
		
		// No duplicates and order of data is maintained
		//LinkedHashSet<String> emailSet = new LinkedHashSet<String>();
		
		// Automatically Sorted Emails
		TreeSet<String> emailSet = new TreeSet<String>();
		emailSet.add("john@example.com");
		emailSet.add("sia@example.com");
		emailSet.add("harry@example.com");
		emailSet.add("george@example.com");
		emailSet.add("john@example.com");
		emailSet.add("dave@example.com");
		emailSet.add("harry@example.com");
		
		// Stores the data using hashing algorithm
		// which means, here we do not have indexes :)
		// Due to hashing, the data will be unordered
		
		System.out.println("Emails Set: ");
		System.out.println(emailSet);
		
		emailSet.remove("harry@example.com");
		
		if(emailSet.contains("dave@example.com")) {
			System.out.println("Dave in the Set");
		}
		
		// we have no method to get a single element, as it stires using hashing
		//emailSet.get(?);
		
		// So, we need to just iterate
		Iterator<String> itr = emailSet.iterator();
		while(itr.hasNext()) {
			String email = itr.next();
			System.out.println("Email is: "+email);
		}
		
		// remove all the elements
		//emailSet.clear();

	}

}
