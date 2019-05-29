package com.basic;

import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {

	}

	private static void entries() {
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(100, "Amit");
		map.put(102, "Ravi");
		map.put(101, "Vijay");
		map.put(103, "Rahul");

		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

	private static void navigableMap() {
		NavigableMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(100, "Amit");
		map.put(102, "Ravi");
		map.put(101, "Vijay");
		map.put(103, "Rahul");
		// Maintains descending order
		System.out.println("descendingMap: " + map.descendingMap());//descendingMap: {103=Rahul, 102=Ravi, 101=Vijay, 100=Amit}
		// Returns key-value pairs whose keys are less than or equal to the specified
		// key.
		System.out.println("headMap: " + map.headMap(102, true));//headMap: {100=Amit, 101=Vijay, 102=Ravi}
		// Returns key-value pairs whose keys are greater than or equal to the specified
		// key.
		System.out.println("tailMap: " + map.tailMap(102, true));//tailMap: {102=Ravi, 103=Rahul}
		// Returns key-value pairs exists in between the specified key.
		System.out.println("subMap: " + map.subMap(100, false, 102, true));//subMap: {101=Vijay, 102=Ravi}
	}

	private static void sortedMap() {
		SortedMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(100, "Amit");
		map.put(102, "Ravi");
		map.put(101, "Vijay");
		map.put(103, "Rahul");
		// Returns key-value pairs whose keys are less than the specified key.
		System.out.println("headMap: " + map.headMap(102));//headMap: {100=Amit, 101=Vijay}
		// Returns key-value pairs whose keys are greater than or equal to the specified
		// key.
		System.out.println("tailMap: " + map.tailMap(102));//tailMap: {102=Ravi, 103=Rahul}
		// Returns key-value pairs exists in between the specified key.
		System.out.println("subMap: " + map.subMap(100, 102));//subMap: {100=Amit, 101=Vijay}
	}
}
