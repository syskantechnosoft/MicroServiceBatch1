package com.tcs;

public class InstanceReference {

	public void test() {
		System.out.println("This is instance method reference definition!!!");
	}
	
	public static void main(String[] args) {
		InstanceReference obj = new InstanceReference();
		Testable t = obj::test;
	}
}
