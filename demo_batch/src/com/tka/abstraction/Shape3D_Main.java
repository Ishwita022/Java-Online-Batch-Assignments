package com.tka.abstraction;

public class Shape3D_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Shape3D s1 = new Sphere();
Shape3D s2= new Cube();
s1.calculateSurfaceArea();
s1.calculateVolume();
s2.calculateSurfaceArea();
s2.calculateVolume();
	}
}
