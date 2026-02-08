package com.tka.polymorphism_methodOverriding;

public class Rectangle extends Shape{
	double area , l=9.7, b=6.5;
	@Override
public void calculateArea() {
		area = l*b;
		System.out.println(" Area of rectangle: "+area);
	}
}
