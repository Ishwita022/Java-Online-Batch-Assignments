package com.tka.interface_10dec;

import java.util.Scanner;

public class Rectangle implements Shape{
private	double  l, b;
private double area =0;

public Rectangle() {
	
}

public Rectangle(double length, double breadth) {
	setB(breadth);
	setL(length);
}
	@Override
public double getArea() {
		area = getB()*getL();
		return area;
}
	
	public void acceptRect() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Length: ");
		setL(sc.nextDouble());
		System.out.print("Enter breadth: ");
		setB(sc.nextDouble());
	}

	public double getL() {
		return l;
	}

	public void setL(double l) {
		this.l = l;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}
	
	
}
