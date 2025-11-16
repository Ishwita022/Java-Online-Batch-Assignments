package com.tka.access_modifier_12nov;

public class DemoB_Class {
//	instance method
	public void DemoB1() {
//The static variable access in another java file  class using class name of static variable
System.out.println(DemoB.name);
// if you want to access by using object then create object inside method
DemoB b4 = new DemoB();
System.out.println(b4.name);

}
	
//	Static method
	public static void DemoB2() {
		System.out.println(DemoB.name);
		DemoB b5 = new DemoB();
		System.out.println(b5.sr);
	}
}
