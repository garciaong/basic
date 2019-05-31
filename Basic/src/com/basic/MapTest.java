package com.basic;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		oldMap();
		newMap();
		sortMap();
		sortMapDesc();
		sortMapValue();
		sortMapValueDec();
		putMap();
		removeMap();
		replaceMap();
	}

	private static void oldMap() {
		Map map = new HashMap();
		// Adding elements to map
		map.put(1, "Amit");
		map.put(5, "Rahul");
		map.put(2, "Jai");
		map.put(6, "Amit");
		// Traversing Map
		Set set = map.entrySet();// Converting to Set so that we can traverse
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			// Converting to Map.Entry so that we can get key and value separately
			Map.Entry entry = (Map.Entry) itr.next();
			/**
			 * 1 Amit 
			 * 2 Jai 
			 * 5 Rahul 
			 * 6 Amit
			 */
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

	private static void newMap() {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(100, "Amit");
		map.put(101, "Vijay");
		map.put(102, "Rahul");
		// Elements can traverse in any order
		for (Map.Entry m : map.entrySet()) {
			/**
			 * 100 Amit 
			 * 101 Vijay 
			 * 102 Rahul
			 */
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

	private static void sortMap() {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(100, "Amit");
		map.put(101, "Vijay");
		map.put(102, "Rahul");
		/**
		 * 100=Amit 
		 * 101=Vijay 
		 * 102=Rahul
		 */
		// Returns a Set view of the mappings contained in this map
		map.entrySet()
				// Returns a sequential Stream with this collection as its source
				.stream()
				// Sorted according to the provided Comparator
				.sorted(Map.Entry.comparingByKey())
				// Performs an action for each element of this stream
				.forEach(System.out::println);
	}

	private static void sortMapDesc() {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(100, "Amit");
		map.put(101, "Vijay");
		map.put(102, "Rahul");
		/**
		 * 102=Rahul 
		 * 101=Vijay 
		 * 100=Amit
		 */
		// Returns a Set view of the mappings contained in this map
		map.entrySet()
				// Returns a sequential Stream with this collection as its source
				.stream()
				// Sorted according to the provided Comparator
				.sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
				// Performs an action for each element of this stream
				.forEach(System.out::println);
	}

	private static void sortMapValue() {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(100, "Amit");
		map.put(101, "Vijay");
		map.put(102, "Rahul");
		/**
		 * 100=Amit 
		 * 102=Rahul 
		 * 101=Vijay
		 */
		// Returns a Set view of the mappings contained in this map
		map.entrySet()
				// Returns a sequential Stream with this collection as its source
				.stream()
				// Sorted according to the provided Comparator
				.sorted(Map.Entry.comparingByValue())
				// Performs an action for each element of this stream
				.forEach(System.out::println);
	}

	private static void sortMapValueDec() {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(100, "Amit");
		map.put(101, "Vijay");
		map.put(102, "Rahul");
		/**
		 * 101=Vijay 
		 * 102=Rahul 
		 * 100=Amit
		 */
		// Returns a Set view of the mappings contained in this map
		map.entrySet()
				// Returns a sequential Stream with this collection as its source
				.stream()
				// Sorted according to the provided Comparator
				.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				// Performs an action for each element of this stream
				.forEach(System.out::println);
	}

	private static void putMap() {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		// Initial list of elements: {}
		System.out.println("Initial list of elements: " + hm);
		hm.put(100, "Amit");
		hm.put(101, "Vijay");
		hm.put(102, "Rahul");

		System.out.println("After invoking put() method ");
		for (Map.Entry m : hm.entrySet()) {
			/**
			 * 100 Amit 
			 * 101 Vijay 
			 * 102 Rahul
			 */
			System.out.println(m.getKey() + " " + m.getValue());
		}

		hm.putIfAbsent(103, "Gaurav");
		System.out.println("After invoking putIfAbsent() method ");
		for (Map.Entry m : hm.entrySet()) {
			/**
			 * 100 Amit 
			 * 101 Vijay 
			 * 102 Rahul 
			 * 103 Gaurav
			 */
			System.out.println(m.getKey() + " " + m.getValue());
		}
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(104, "Ravi");
		map.putAll(hm);
		System.out.println("After invoking putAll() method ");
		for (Map.Entry m : map.entrySet()) {
			/**
			 * 100 Amit 
			 * 101 Vijay 
			 * 102 Rahul 
			 * 103 Gaurav 
			 * 104 Ravi
			 */
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

	private static void removeMap() {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(100, "Amit");
		map.put(101, "Vijay");
		map.put(102, "Rahul");
		map.put(103, "Gaurav");
		// Initial list of elements: {100=Amit, 101=Vijay, 102=Rahul, 103=Gaurav}
		System.out.println("Initial list of elements: " + map);
		// key-based removal
		map.remove(100);
		// Updated list of elements: {101=Vijay, 102=Rahul, 103=Gaurav}
		System.out.println("Updated list of elements: " + map);
		// value-based removal
		map.remove(101);
		// Updated list of elements: {102=Rahul, 103=Gaurav}
		System.out.println("Updated list of elements: " + map);
		// key-value pair based removal
		map.remove(102, "Rahul");
		// Updated list of elements: {103=Gaurav}
		System.out.println("Updated list of elements: " + map);
	}

	private static void replaceMap() {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(100, "Amit");
		hm.put(101, "Vijay");
		hm.put(102, "Rahul");
		System.out.println("Initial list of elements:");
		for (Map.Entry m : hm.entrySet()) {
			/**
			 * 100 Amit 
			 * 101 Vijay 
			 * 102 Rahul
			 */
			System.out.println(m.getKey() + " " + m.getValue());
		}
		System.out.println("Updated list of elements:");
		hm.replace(102, "Gaurav");
		for (Map.Entry m : hm.entrySet()) {
			/**
			 * 100 Amit 
			 * 101 Vijay 
			 * 102 Gaurav
			 */
			System.out.println(m.getKey() + " " + m.getValue());
		}
		System.out.println("Updated list of elements:");
		hm.replace(101, "Vijay", "Ravi");
		for (Map.Entry m : hm.entrySet()) {
			/**
			 * 100 Amit 
			 * 101 Ravi 
			 * 102 Gaurav
			 */
			System.out.println(m.getKey() + " " + m.getValue());
		}
		System.out.println("Updated list of elements:");
		hm.replaceAll((k, v) -> "Ajay");
		for (Map.Entry m : hm.entrySet()) {
			/**
			 * 100 Ajay 
			 * 101 Ajay 
			 * 102 Ajay
			 */
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}
