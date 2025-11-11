package com.tka.Calculate_Task;

import java.util.Scanner;

public class Calculate_shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       double circle, rect, sq, circum, sqnum, cubenum;
       double pi=3.14;
       double r, l, b, s;
       System.out.println("------Area of Circle------");
       System.out.println("Enter radius of circle: ");
       r = sc.nextDouble();
       circle = pi*r*r;
       System.out.println("Area of circle is: "+circle);
       
       System.out.println("------Area of Rectangle------");
       System.out.println("Enter length of rectangle: ");
       l = sc.nextDouble();
       System.out.println("Enter breadth of rectangle: ");
       b = sc.nextDouble();
       rect = l*b;
       System.out.println("Area of rectangle is: "+rect);
       
       System.out.println("------Area of Square------");
       System.out.println("Enter side of square: ");
       s = sc.nextDouble();
       sq = s*s;
       System.out.println("Area of square is: "+sq);
       
       System.out.println("------Circumference of Circle------");
       System.out.println("Enter radius of circle: ");
       r = sc.nextDouble();
       circum = 2*pi*r;
       System.out.println("Circumference of circle is: "+circum);
       
       System.out.println("------Square of number------");
       System.out.println("Enter Number for find the square: ");
       sqnum = sc.nextDouble();
       double n1 = sqnum*sqnum; 
       System.out.println("Square of number is: "+n1);
       
       System.out.println("------Cube of number------");
       System.out.println("Enter Number for find the Cube: ");
       cubenum = sc.nextDouble();
       double n2 = cubenum*cubenum*cubenum; 
       System.out.println("Cube of number is: "+n2);
	}

}
