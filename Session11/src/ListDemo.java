import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*
 		
 		Collections FW of Java
 			Its a set of built in classes which forms the data structures :)
 			
 		List
 			ArrayList
 			LinkedList
 			Vector
 			Stack
 
 		Set
 			HashSet
 			LinkedHashSet
 			TreeSet
 			
 		Queue
 			PriorityQueue
 			
 		Map
 			HashMap
 			LinkedHashMap
 			TreeMap
 			Hashtable
 			
 		List, Set, Queue and Map are Interfaces
 		Classes below them implements them
 		
 		eg:
 		class ArrayList implements List{
 		
 		}
 		
 */

class Product{
	
	int pid;
	String name;
	int price;
	
	Product(){
		
	}
	
	Product(int pid, String name, int price) {
		this.pid = pid;
		this.name = name;
		this.price = price;
	}
	
	void show() {
		System.out.println("Product: "+pid+" "+name+" "+price);
	}
}


public class ListDemo {

	public static void main(String[] args) {
		
		// array comes with size
		int[] array = new int[10];
		String[] names = new String[10];
		
		// Has no limit on size
		// Hetrogeneous in nature: any object can be stored inside it
		ArrayList list1 = new ArrayList();
		
		// Homogeneous in nature: only String type can be stored
		ArrayList<String> list2 = new ArrayList<String>();
		//List<String> list = new ArrayList<String>(); OK: Polymorphic Statement
		
		ArrayList<Product> list3 = new ArrayList<Product>();
		
		// ArrayList<int> list4 = new ArrayList<int>(); // error
		//ArrayList<Integer> list4 = new ArrayList<Integer>(); // ok
		
		Product p1 = new Product(1, "iPhone", 70000);
		Product p2 = new Product(2, "Watch", 30000);
		
		// 1. Adding Data to ArrayList
		list1.add("John");		// 0
		list1.add(10);  // 10 here will be auto boxed to Integer Object
		list1.add('A');
		list1.add(2.2);
		list1.add("Fionna");
		list1.add(p1);
		list1.add(p2);			// n-1
		
		list2.add("John");		// 0
		list2.add("Jennie");
		list2.add("Fionna");
		list2.add("George");
		list2.add("Harry");
		list2.add("Dave");
		list2.add("Jennie");	// n-1
		//list2.add(10); err
		//list2.add(p1); err
		
		list3.add(p1);			// 0
		list3.add(p2);			// 1
		//list3.add("Kia");     // err 
		
		// 2. Print the List
		System.out.println("list1 is: ");
		System.out.println(list1);
		System.out.println();
		
		System.out.println("list2 is: ");
		System.out.println(list2);
		System.out.println();
		
		System.out.println("list3 is: ");
		System.out.println(list3);
		System.out.println();
		
		// 3. Getting a Single Element from List
		Object oRef = list1.get(3); // as list1 we dont know the type, Object as parent can refer to any type
		String name = list2.get(4);
		Product product = list3.get(1);
		
		System.out.println("oRef is: "+oRef);
		System.out.println("name is: "+name);
		product.show();
		
		System.out.println();
		
		// 4. Update Data in List
		System.out.println("list2 before: "+list2);
		list2.set(1, "Mike");
		System.out.println("list2 after: "+list2);
		
		// 5. Delete data from List
		System.out.println("list2 before: "+list2+" Size: "+list2.size());
		list2.remove(1);
		System.out.println("list2 after: "+list2+" Size: "+list2.size());
		
		//list2.add(6, "Tim");
		//System.out.println("list2 now is: "+list2);
		
		int idx = list2.indexOf("Harry");
		System.out.println("idx of harry is: "+idx);
		
		if(list2.contains("Harry")) {
			System.out.println("Harry is in the list");
		}
		
		// remove all
		//list2.clear();
		//System.out.println("list2 now is: "+list2);
		
		ArrayList<String> namesList = new ArrayList<String>();
		namesList.add("Kia");
		namesList.add("Sia");
		namesList.add("Anna");
		
		namesList.addAll(list2);
		System.out.println("namesList is: ");
		System.out.println(namesList);
		
		//ArrayList<String> list4 = list2; // Reference Copy Operation
		
		List<String> result = namesList.subList(2, 5);
		System.out.println("list is: "+result);
		
		
		// Ways to Iterate in List :)
		// 1. For Loop
		System.out.println("Iterate using For Loop");
		
		for(int i=0;i<list1.size();i++) {
			Object o = list1.get(i);
			System.out.println(o);
		}
		
		System.out.println();
		
		for(int i=0;i<list2.size();i++) {
			String str = list2.get(i);
			System.out.println(str);
		}
		
		System.out.println();
		
		// 2. Enhanced For Loop
		System.out.println("Iterate using Enhanced For Loop");
		
		for(Object o : list1) {
			System.out.println(o);
		}
		
		System.out.println();
		
		for(String str : list2) {
			System.out.println(str);
		}
		
		System.out.println();
		
		// 3. Iterator API
		// Read data from list 1 by 1 rather than looping it
		System.out.println("Iterate using Iterator");
		Iterator<String> itr = list2.iterator();
		/*System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println(itr.next());*/
		
		while(itr.hasNext()) {
			String str = itr.next();
			System.out.println(str);
			if(str.equals("John")) {
				itr.remove(); // remove the data from the list
			}
		}
		
		System.out.println();
		
		// 4. ListIterator API
		System.out.println("Iterate using ListIterator");
		ListIterator<String> listItr = list2.listIterator();
		
		while(listItr.hasNext()) {
			String str = listItr.next();
			System.out.println(str);
		}
		
		System.out.println("~~~~~~");
		
		while(listItr.hasPrevious()) {
			String str = listItr.previous();
			System.out.println(str);
		}
		
		System.out.println();
		
		// 5. Enumeration API : read only i.e. we cannot remove
		System.out.println("Iterate using Enumeration");
		Enumeration<String> enm = Collections.enumeration(list2);
		while(enm.hasMoreElements()) {
			String str = enm.nextElement();
			System.out.println(str);
		}
		
		// We will see this later :)
		//list2.forEach((str)-> System.out.println(str));
		
	}

}





