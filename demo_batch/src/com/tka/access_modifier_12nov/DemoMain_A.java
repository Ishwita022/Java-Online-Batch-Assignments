package com.tka.access_modifier_12nov;

public class DemoMain_A {
	public static void main(String[] args) {
		DemoA d = new DemoA();
		d.A1();//Static method access by instance method by using creating a object.
		d.A2();
		d.A3();
		DemoB d1 = new DemoB();
		d1.B1();
		d1.B2();
		DemoB_Class d2 = new DemoB_Class();
		d2.DemoB1();
		d2.DemoB2();
	}
}


