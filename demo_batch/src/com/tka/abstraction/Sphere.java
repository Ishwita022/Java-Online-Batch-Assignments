package com.tka.abstraction;

public class Sphere extends Shape3D{
	
	double v, sa, pi=3.14;
	@Override
public void calculateVolume() {
	double r=9;
	v=4/3*pi*r*r*r;
	System.out.println("Volume of sphere : "+v);
}
@Override
public void calculateSurfaceArea() {
	double r =9.9;
	sa=pi*r*r;
	System.out.println("Surface area of Sphere: "+sa);
}
}
