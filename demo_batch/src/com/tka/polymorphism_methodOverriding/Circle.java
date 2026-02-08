package com.tka.polymorphism_methodOverriding;

public class Circle extends Shape{
	double area, pi=3.14, r=6.8;
	@Override
public void calculateArea() {
		
	area = pi*r*r;
	System.out.println("Area of Circle is: "+area);
}
}
