package com.tka.access_modifier_12nov;

public class DemoB {

//	Create Static variable or method and try to access the area 
	static String name = "nita";
	static String sr = "Apple";
	public static void B1() {
		System.out.println(name);//Direct access within class of static variable and method
//		you can access by object and class name also
		DemoB b = new DemoB();
		System.out.println(b.name);
		System.out.println(DemoB.name);
		
	}
 
	public void B2() {
		System.out.println(name); // easily direct access within class
//		you can access by object and class name in instance method
		DemoB b1 = new DemoB();
		System.out.println(b1.name);
		System.out.println(DemoB.name);
	}
}
