package com.basic;

import java.util.ArrayList;
import java.util.List;

public class CheckListContent {

	public static void main(String[] args) {
		List<String> stringList = new ArrayList<String>();
		stringList.add("A01");
		stringList.add("B01");

		/**
		 * stringList contains 'B01'? true 
		 * stringList contains 'b01'? false
		 */
		System.out.println("stringList contains 'B01'? " + stringList.contains("B01"));
		System.out.println("stringList contains 'b01'? " + stringList.contains("b01"));

		List<Object> objList = new ArrayList<Object>();
		objList.add(new ObjectA());
		objList.add(new ObjectB());
		objList.add(new ObjectC());
		/**
		 * objList index 0 instance of Base? true 
		 * objList index 1 instance of Base? true
		 * objList index 2 instance of Base? true 
		 * objList index 0 instance of ObjectB? false 
		 * objList index 1 instance of ObjectA? false 
		 * objList index 2 instance of ObjectB? true
		 */
		System.out.println("objList index 0 instance of Base? " + (objList.get(0) instanceof Base));
		System.out.println("objList index 1 instance of Base? " + (objList.get(1) instanceof Base));
		System.out.println("objList index 2 instance of Base? " + (objList.get(2) instanceof Base));
		System.out.println("objList index 0 instance of ObjectB? " + (objList.get(0) instanceof ObjectB));
		System.out.println("objList index 1 instance of ObjectA? " + (objList.get(1) instanceof ObjectA));
		System.out.println("objList index 2 instance of ObjectB? " + (objList.get(2) instanceof ObjectB));

	}

}
