package com.tka.polymorphism_4dec;

public class methodOverloading_q1 {

	public void displayq1(int a) {

		System.out.println("Integer value " + a);
	}

	public void displayq1(double b) {

		System.out.println("floating value " + b);
	}
	
	public void showq2(int a) {
		System.out.println("Integer value: "+a);
	}
	
	public void showq2(int a, int b) {
		System.out.print("Integer value of a and b: ");
		System.out.print(a+" ");
		System.out.println(b);
	}
	
	public void q3(int a, String b) {
		System.out.println("Integer value: "+a);
		System.out.println("String value: "+b);
	}
	
	public void q3(double a, String b ) {
		System.out.println("double value: "+a);
		System.out.println("String value: "+b);
	}
	
	
}
