package com.tka.polymorphism_4dec;

public class MethodOverloading2 {
public void k1() {
	System.out.println("Good evening");
}

public void k1(int y) {
	System.out.println(y);
}

public void k1(String s) {
	System.out.println(s);
}

public void k1(int y, String s) {
	System.out.println("The age of "+s+" is "+y);
}

//different access modifier
public void a1() {
	System.out.println("hello");
}

protected void a1(int y) {
	System.out.println("gn");
	System.out.println(y);
}

// different return types
public int t1(int s) {
	return s;
}

public double t1(double s) {
	return s;
}

//mixture of data types

public void show(int a, int b) {
	System.out.println("the value of a and b "+a+" "+b);
}

public void show(int age, String name) {
	System.out.println(name+" of age is "+age);
}

public void show(double a, double b) {
	System.out.println("the double value is "+a+" "+b);
}
}