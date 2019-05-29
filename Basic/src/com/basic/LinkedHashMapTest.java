package com.basic;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTest {

	public static void main(String[] args) {

	}

	private static void entries() {
		LinkedHashMap<Integer, String> hm = new LinkedHashMap<Integer, String>();

		hm.put(100, "Amit");
		hm.put(101, "Vijay");
		hm.put(102, "Rahul");

		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		// Fetching key
		System.out.println("Keys: " + hm.keySet());
		// Fetching value
		System.out.println("Values: " + hm.values());
		// Fetching key-value pair
		System.out.println("Key-Value pairs: " + hm.entrySet());
	}

}
