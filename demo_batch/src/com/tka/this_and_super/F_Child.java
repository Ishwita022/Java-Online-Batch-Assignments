package com.tka.this_and_super;

public class F_Child extends E_Parent {

	public F_Child() {
		this(8.9);
 System.out.println("F-Class");
	}

	public F_Child(boolean b) {
		System.out.println("F-Class boolean");
	}

	public F_Child(double d) {
		super(100);
		System.out.println("F-Class double");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
F_Child f = new F_Child();
	}

}
