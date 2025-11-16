package com.tka.access_modifier_12nov;

public class DemoA {
int y = 100;

public void  A1() {
	System.out.println(y); // instance variable access within class and method
}

int z = 200;
public void A2() {
//	if you want to acces A1 method in A2 method then you need to create a object
//	where A1 and A2 method both are instance method 
	DemoA a2 = new DemoA();
	a2.A1();
	System.out.println(a2.z);
}

//Creating instance variable and try to access in static method with same class
//It will get the error for accessing the variable ypu need to create a object with same class
String s = "Mango";
public static void A3() {
	DemoA a3 = new DemoA();
	System.out.println(a3.s);
}
}