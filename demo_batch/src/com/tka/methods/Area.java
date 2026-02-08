package com.tka.methods;

import java.util.Iterator;

public class Area {
public void circle(double r) {
	double area = 3.14*r*r;
	System.out.println("area of circle is: "+area);
}

public void rect(double l, double b) {
	double rect = l*b;
	System.out.println("area of rectangle is: "+rect);
}

public void square(double num) {
	double sq= num*num;
	System.out.println("Square of number: "+sq);
}

public void cube(double num) {
	double cube= num*num*num;
	System.out.println("Square of number: "+cube);
}
 

}
