package com.tka.abstraction;

public class Cube extends Shape3D{
	double v, sa, pi=3.14;
@Override
	public void calculateVolume() {
		double a=5;
		v=a*a*a;
		System.out.println("Volume of cube: "+v);
		
	}
@Override
	public void calculateSurfaceArea() {
		double a = 7.8;
		double sa = 6*a*a;
		System.out.println("Surface area of Cube: "+sa);
	}
}
