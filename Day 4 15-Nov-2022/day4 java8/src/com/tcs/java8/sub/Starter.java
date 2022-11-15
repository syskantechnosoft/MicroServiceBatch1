package com.tcs.java8.sub;

import com.tcs.java8.MyClass;

public class Starter {

	public static void main(String[] args) {
		MyClass obj= new MyClass();
		obj.display();
		
		Class2 obj1 = new Class2();
		obj1.display();
		//Base/parent class ref can be used for child class
		MyClass obj3 = new Class2();
		
		Test t1= new Test();
		
		

	}

}
