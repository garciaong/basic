package com.basic;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTest {

	public static void main(String[] args) {
		entries();
	}

	private static void entries() {
		LinkedHashMap<Integer, String> hm = new LinkedHashMap<Integer, String>();

		hm.put(100, "Amit");
		hm.put(101, "Vijay");
		hm.put(102, "Rahul");

		/**
		 * 100 Amit 
		 * 101 Vijay 
		 * 102 Rahul
		 */
		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		/** Keys: [100, 101, 102] */
		// Fetching key
		System.out.println("Keys: " + hm.keySet());
		/** Values: [Amit, Vijay, Rahul] */
		// Fetching value
		System.out.println("Values: " + hm.values());
		/** Key-Value pairs: [100=Amit, 101=Vijay, 102=Rahul] */
		// Fetching key-value pair
		System.out.println("Key-Value pairs: " + hm.entrySet());
	}

}
