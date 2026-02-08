package com.tka.this_and_super;

public class B {
public B() {
	this(false);
	System.out.println("B-Class");
}
	
public B(Boolean b) {
	this("ABCD");
	System.out.println("Boolan");
	
}

public B(String s) {
	System.out.println("BBBB");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
B b1 = new B();
	}

}
