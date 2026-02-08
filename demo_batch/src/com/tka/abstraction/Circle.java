package com.tka.abstraction;

public class Circle extends Calculate_abstract{
	double r=3, pi=3.14;

	@Override
public void calculateArea() {
		System.out.println("===Area of circle===");
	double a;
	a=pi*r*r;
	System.out.println("Area of circle: "+a);
}

	@Override
	public void calculatePerimeter() {
		System.out.println("===Perimeter of circle===");
		// TODO Auto-generated method stub
		double p;
		p=2*pi*r;
		System.out.println("Perimeter of circle: "+p);
	}
}
