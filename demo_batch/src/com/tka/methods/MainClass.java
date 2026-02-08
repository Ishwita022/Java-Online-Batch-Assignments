package com.tka.methods;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.print("Enter radius: ");
double r = sc.nextDouble();

Area a1 = new Area();
a1.circle(r);
System.out.println();

System.out.print("Enter length: ");
double l = sc.nextDouble();
System.out.print("Enter breadth: ");
double b = sc.nextDouble();
a1.rect(l, b);
System.out.println();

a1.square(8);

a1.cube(9.77);
	}

}
