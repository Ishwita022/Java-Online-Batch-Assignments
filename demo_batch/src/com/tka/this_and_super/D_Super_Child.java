package com.tka.this_and_super;

public class D_Super_Child extends C_Super_Parent {
String y = "Apple";
public void k1() {
	boolean y = false;
	System.out.println(y);
	System.out.println(this.y);
	System.out.println(super.h1);
	System.out.println(super.s1);
	super.m1();
	super.a1();
}

public static void d1() {
//	System.out.println(super.h1); error because static method
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
D_Super_Child d1 = new D_Super_Child();
d1.k1();
	}

}
