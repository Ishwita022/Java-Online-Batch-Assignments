package com.tka.interface_10dec;

import java.util.Scanner;

public class Circle implements Shape{
	private double area=0, r;
	
	
public Circle() {
	
}

public Circle(double radius) {
	setR(radius);
}

	@Override
	public double getArea() {
		area=3.14*r*r;
		return area;	
		}
	
	public void acceptCircle() {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter radius: ");
		setR(sc.nextDouble());
	}
	
	public double getR() {
		return r;
	}


	public void setR(double r) {
		this.r = r;
	}
}
