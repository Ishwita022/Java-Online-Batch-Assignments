package com.tka.class_and_object;

import java.util.Scanner;

public class Chechnum_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Checknum c=new Checknum();
		System.out.println("Enter number for count digit: ");
		int num =sc.nextInt();
		int d=c.digit(num);
		System.out.println("Count: "+d);
		
		System.out.print("Enter base: ");
		int base= sc.nextInt();
		System.out.print("Enter power: ");
		int pow= sc.nextInt();
		int p = c.power(base, pow);
		System.out.println("Total value is: "+p);
			}
	}

