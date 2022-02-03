package com.auribises.java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

@FunctionalInterface
interface Register{
	void registerUser(String email, String password);
}

class Authentication{
	
	static void register(String username, String password) {
		System.out.println("Registering User at "+new Date());
		System.out.println("User Registered with "+username);
	}
	
	void login(String username, String password) {
		System.out.println("User Logged In with "+username);
	}
	
}

class DB{
	
	static void fetchDataFromDB() {
		System.out.println("Fetching Data from DB...");
	}
}

public class Java8Features {

	public static void main(String[] args) {
		
		// Anonymous Class
		Register ref1 = new Register() {
			public void registerUser(String email, String password) {
				System.out.println("User Regsitered with email: "+email);
			}
		};
		
		// Lambda Expression
		Register ref2 = (email, password) -> System.out.println("User Regsitered with email: "+email);
		
		Authentication auth = new Authentication();
		
		// Method Reference | non static 
		//Register ref3 = auth::register;
		
		// Method Reference | static
		// we are making the definition for the register method to be implemented  as the definition of register in Authentication 
		Register ref3 = Authentication::register;
		ref3.registerUser("john.watson@exampel.com", "john@123");
		
		
		// Let the definition of the run method be the same as fetchDataFromDB
		Runnable runnable = DB::fetchDataFromDB;
		Thread th = new Thread(runnable);
		th.start();
		
		List<Integer> data = new ArrayList<Integer>();
		data.add(10);
		data.add(20);
		data.add(30);
		data.add(40);
		data.add(50);
		
		//List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50, 67, 89);
		List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
		
		System.out.println(data);
		System.out.println(numbers);
		
		Stream<Integer> stream = numbers.stream();
		//boolean result = stream.allMatch((number)-> (number>=10 && number <=50));
		//System.out.println("Result is: "+result);
		
		// filter performs filteration
		//Stream<Integer> filteredNumbers = stream.filter((number)-> number>30);
		//filteredNumbers.forEach((element)->System.out.println(element));
		
		// map will do the mapping
		//Stream<Integer> mappedNumbers = stream.map((number)->number+2);
		//mappedNumbers.forEach((element)->System.out.println(element));
		
		System.out.println(stream.reduce((a, b) -> a+b));
		
		// Assignment: Explore more methods on Stream
		//             Explore Optional class in Java8 :)
		
	}

}
