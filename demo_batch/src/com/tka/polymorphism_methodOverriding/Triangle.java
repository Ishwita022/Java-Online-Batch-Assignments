package com.tka.polymorphism_methodOverriding;

public class Triangle extends Shape {
	double aT , base=6.5,  h=9.7;
	@Override
public void calculateArea() {
		
		aT =0.5*base*h;
		System.out.println(" Area of Triangle: "+aT);
	}
}
