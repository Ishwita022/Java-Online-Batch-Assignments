package com.tka.polymorphism_methodOverriding;

public class ShapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Shape s = new Circle();
Shape s1 = new Rectangle();
Shape s2 = new Triangle();

s.calculateArea();
s1.calculateArea();
s2.calculateArea();
	}

}
