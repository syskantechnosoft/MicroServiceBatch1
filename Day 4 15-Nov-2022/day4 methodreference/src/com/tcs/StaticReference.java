package com.tcs;

public class StaticReference {
	
	public static void test() {
		System.out.println("Test method implmentation in Static Reference Class!!");
	}

	public static void main(String[] args) {
		//Static Method reference
		Testable t1 = StaticReference::test;
		t1.test();
		
		Thread t = new Thread(StaticReference::test);
		t.start();
	}

}
