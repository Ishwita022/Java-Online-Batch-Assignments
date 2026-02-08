package com.tka.interface_10dec;

public class ShapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle(7.7, 8.9);
		double area = r.getArea();
		System.out.println("Area of rectangle is: "+area);
		Circle c = new Circle(9.0);
		double area1 = c.getArea();
		System.out.println("Area Of circle: "+area1);
		Triangle t = new Triangle(4.5, 3.6); 
		double area2 =t.getArea();
		System.out.println("Area of Triangle: "+area2);
		
	}

}
