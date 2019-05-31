package com.basic;

public class StaticNonStaticTest {

	public static void main(String[] args) {
		/**
		 * NonStaticCounter1 : 0 
		 * NonStaticCounter2 : 0 
		 * NonStaticCounter1 : 1
		 * StaticCounter1 : 0 
		 * StaticCounter2 : 1 
		 * StaticCounter1 : 2
		 */
		NonStaticCounter nsc1 = new NonStaticCounter();
		NonStaticCounter nsc2 = new NonStaticCounter();
		System.out.println("NonStaticCounter1 : " + nsc1.getCount());
		System.out.println("NonStaticCounter2 : " + nsc2.getCount());
		System.out.println("NonStaticCounter1 : " + nsc1.getCount());
		StaticCounter sc1 = new StaticCounter();
		StaticCounter sc2 = new StaticCounter();
		System.out.println("StaticCounter1 : " + sc1.getCount());
		System.out.println("StaticCounter2 : " + sc2.getCount());
		System.out.println("StaticCounter1 : " + sc1.getCount());
	}

}

class NonStaticCounter {
	private int counter = 0;

	public int getCount() {
		return this.counter++;
	}
}

class StaticCounter {
	private static int counter = 0;

	public int getCount() {
		return counter++;
	}
}