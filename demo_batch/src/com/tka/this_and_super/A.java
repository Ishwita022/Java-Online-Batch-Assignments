package com.tka.this_and_super;

public class A {
public A() {
//	this(100);
	System.out.println("Class-A");
}

public A(int y) {
	this();
	System.out.println("INT");
}

public A(boolean b) {

	System.out.println("boolean");
}
public A(String s) {
	this();
	System.out.println("String");
}


public static void main(String[] args) {
	A a1 = new A(99);
}
}

