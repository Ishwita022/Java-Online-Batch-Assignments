package com.tka.class_and_object;

import java.util.Scanner;

public class Q3_shirt {
String brand;
String color;
String size;
double price;
String fabric;

public void accept(String b, String c, String s, double p, String f) {
	brand=b;
	color=c;
	size=s;
	price=p;
	fabric=f;
	}
public void show() {
	System.out.print("brand of shirt is: "+brand);
	System.out.println();
	System.out.print("color of shirt is: "+color);
	System.out.println();
	System.out.print("size of shirt is: "+size);
	System.out.println();
	System.out.print("price of shirt is: "+price);
	System.out.println();
	System.out.print("Type of fabric is: "+fabric);
	System.out.println();
}
}