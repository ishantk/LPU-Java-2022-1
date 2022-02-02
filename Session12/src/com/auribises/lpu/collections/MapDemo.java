package com.auribises.lpu.collections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		
		
		//Map<Integer, String> map = new HashMap<Integer, String>();		// Polymorphic Statement
		HashMap<Integer, String> map = new HashMap<Integer, String>();		// Direct Object Construction
		map.put(101, "John");
		map.put(231, "Dave");
		map.put(765, "Sia");
		map.put(332, "Kim");
		map.put(121, "Anna");
		map.put(412, "Dave");
		
		map.put(765, "Mike"); // Update operation on map
		
		// In HashMap, we can have 1 null key and values can be null as well
		map.put(null, "Names");
		map.put(250, null);
		
		//update operation
		map.put(null, null); // key null gets updated to the null value
		
		System.out.println("map is: ");
		System.out.println(map);
		
		// Keys are Unique and cannot be duplicated
		// Value can be duplicated
		
		// Will add the data using hashing in unordered manner
		//HashMap<String, Integer> dishMap = new HashMap<String, Integer>();
		
		// LinkedHashMap -> maintain the order in which we added
		//LinkedHashMap<String, Integer> dishMap = new LinkedHashMap<String, Integer>();
		
		// TreeMap sorts the data on the keys
		//TreeMap<String, Integer> dishMap = new TreeMap<String, Integer>();
		
		// Thread Safe Version of HashMap
		// It is Synchronized
		// Hashtable -> In order to maintain Synchronization no null key and no null value allowed
		Hashtable<String, Integer> dishMap = new Hashtable<String, Integer>();
		
		dishMap.put("Noodles", 300);
		dishMap.put("Burger", 120);
		dishMap.put("Dal", 350);
		dishMap.put("Paneer", 400);
		dishMap.put("Roti", 20);
		//dishMap.put(null, null); -> throws error for Hashtable :)
		
		System.out.println("Dishes: "+dishMap);
		
		int price = dishMap.get("Dal");
				
		System.out.println("Dal is priced at: "+price);
		
		if(dishMap.containsKey("Dal")) {
			System.out.println("Dal is their in the Map");
		}
		
		if(dishMap.containsValue(350)) {
			System.out.println("350 is in the map as value");
		}
		
		dishMap.remove("Dal");
		System.out.println("dishMap now is: ");
		System.out.println(dishMap);
		
		System.out.println("Size of DishMap is: "+dishMap.size());
		
		// Get all the keys from the Map with keySet method
		Set<String> keys = dishMap.keySet();
		
		System.out.println();
		System.out.println("Iterating with keySet");
		// Iterating in HashMap :)
		Iterator<String> itr = keys.iterator();
		
		while(itr.hasNext()) {
			String key = itr.next();
			Integer value = dishMap.get(key);
			
			System.out.println(key+"\t"+value);
		}
		
		System.out.println();
		System.out.println("Iterating with entrySet");
		Set<Entry<String, Integer>> entrySet = dishMap.entrySet();
		Iterator<Entry<String, Integer>> itr1 = entrySet.iterator();
		
		while(itr1.hasNext()) {
			Entry<String, Integer> entry = itr1.next();
			System.out.println(entry.getKey()+"\t"+entry.getValue());
		}
		
		// Collection of Collections
		//ArrayList<HashMap<String, Integer>> list = new ArrayList<HashMap<String,Integer>>();
		//HashMap<HashSet<Integer>, ArrayList<String>> myMap = new HashMap<HashSet<Integer>, ArrayList<String>>();
		
		// Assignment: Represent the COVID Data using Collections FW for India as country with states data
		// 			   Must Use Collection of Collections :)
		//			   Possibly it can be a HashMap or HashMap/ArrayList
		//			   Or ArrayList of HashMaps -> Decide yourself and implement the same
		
	}

}
