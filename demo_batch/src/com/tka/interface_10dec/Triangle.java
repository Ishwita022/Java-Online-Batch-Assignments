package com.tka.interface_10dec;

import java.util.Scanner;

public class Triangle implements Shape{
	private double h, b, area=0;
	
	public Triangle() {
		
	}
	
	public Triangle(double height, double base) {
		setB(base);
		setH(height);
	}
	@Override
	public double getArea() {
		area = 0.5*(b*h);
		return area;
	}
  public void acceptTriangle() {
	  Scanner sc = new Scanner(System.in);
		System.out.print("Enter Base : ");
		setB(sc.nextDouble());
		System.out.print("Enter Height: ");
		setH(sc.nextDouble());
  }
	public double getH() {
		return h;
	}

	public void setH(double h) {
		this.h = h;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	
	
	
}
