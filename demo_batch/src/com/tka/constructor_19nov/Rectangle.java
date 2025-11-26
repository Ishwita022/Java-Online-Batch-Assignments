package com.tka.constructor_19nov;

public class Rectangle {
double length;
double width;


public Rectangle(double l, double w) {
	length =l;
	width = w;
}

Rectangle(Rectangle r){
	length = r.length;
	width = r.width;
}

public void rect1() {
	System.out.println("length is :"+length);
	System.out.println("Width is :"+width);
}
}
