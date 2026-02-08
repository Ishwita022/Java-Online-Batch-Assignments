package com.tka.abstraction;

public class Calculate_Main {

	public static void main(String[] args) {
//		2. Write a Java program to create an abstract class Shape with abstract methods calculateArea() and calculatePerimeter(). Create subclasses Circle and Triangle that extend the Shape class and implement the respective methods to calculate the area and perimeter of each shape.
		
		// TODO Auto-generated method stub
Calculate_abstract c1= new Circle();
Calculate_abstract c2= new Rectangle();
c1.calculateArea();
c1.calculatePerimeter();
c2.calculateArea();
c2.calculatePerimeter();
	}

}
