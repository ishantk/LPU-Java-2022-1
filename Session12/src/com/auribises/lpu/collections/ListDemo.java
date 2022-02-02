package com.auribises.lpu.collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListDemo {

	public static void main(String[] args) {
		
		
		//List<String> list = new ArrayList<String>();		// Polymorphic Statement
		
		// ArrayList uses dynamic arrays to store data in the background
		//ArrayList<String> list = new ArrayList<String>();	// Direct Object Construction
		
		// LinkedList is a circular double linked list in the background
		//LinkedList<String> list = new LinkedList<String>();
		
		// Vector is a Thread-Safe List
		// which means if multiple threads tries to access Vector, a lock acquisition happens automatically
		// Vector is Synchronized
		Vector<String> list = new Vector<String>();
		list.add("John");
		list.add("Jennie");
		list.add("Jim");
		list.add("Jack");
		list.add("Joe");
		
		System.out.println("list is: "+list);
		
		if(list.contains("Jim")) {
			int idx = list.indexOf("Jim");
			System.out.println("idx of Jim is: "+idx);
		}

		String name = list.get(3);
		System.out.println("name is: "+name);
		
		System.out.println("Iterating in list");
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		// Stack is LIFO Data Structure
		Stack<String> stack = new Stack<String>();
		stack.push("John");
		stack.push("Harry");
		stack.push("Mike");
		stack.push("Sia");
		stack.push("Kim");
		
		stack.pop(); // removes the last element
		stack.pop();
		
		System.out.println("stack is: "+stack);
		System.out.println("element at 1 index: "+stack.get(1));
		
	}

}
