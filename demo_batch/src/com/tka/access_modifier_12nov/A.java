package com.tka.access_modifier_12nov;

public class A {
//	static variable
	static int a1 = 100;
//	instance variable
    int a2 = 200;
  
  public static void A1() {
	  A a= new A();
	  System.out.println(a.a2);
	  System.out.println(a1);
  }

 public void A2() {
	 System.out.println(a2);
	 A a0 = new A();
	 System.out.println(a0.a1);
 }
}