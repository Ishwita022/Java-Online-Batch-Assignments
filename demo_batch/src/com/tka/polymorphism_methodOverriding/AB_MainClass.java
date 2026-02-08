package com.tka.polymorphism_methodOverriding;

public class AB_MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
A a1 = new A();
//only override property can be call by using object
a1.m1();
a1.d1();
//a1.k1(); error
System.out.println();

B b1 = new B();
//all prperty can be access and call
b1.m1();
b1.d1();
b1.k1();
System.out.println();

A a2 = new B();
a2.d1();
a2.m1();
//a2.k1(); error because object only call
System.out.println();

//B b1 = new A();
//NOT possible
}

}
