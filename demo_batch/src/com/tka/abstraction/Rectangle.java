package com.tka.abstraction;

public class Rectangle extends Calculate_abstract {
double l=12, b=20;
public void calculateArea() {
	System.out.println("===Area of Rectangle===");
	double a;
	a=l*b;
	System.out.println("Area of circle: "+a);
}

	@Override
	public void calculatePerimeter() {
		System.out.println("===Permieter of Rectangle===");
		// TODO Auto-generated method stub
		double p;
		p=2*(l+b);
		System.out.println("Perimeter of circle: "+p);
	}
}
