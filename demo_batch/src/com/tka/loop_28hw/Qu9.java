package com.tka.loop_28hw;

import java.util.Scanner;

public class Qu9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 write a program to print the message for following condition
//			- take range by user 
//			- if number divisible by 3 print "Mango";
//			- if number divisible by 5 print "Apple";
//			- if number divisible by 3 and 5 print "Mango and Apple";
//			- otherwise print number 

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n=sc.nextInt();
		if(n%3==0 && n%5==0) {
			System.out.println("Mango and Apple");
		}else if(n%5==0) {
			System.out.println("Apple");
		} else if(n%3==0 ) {
			System.out.println("Mango");
		}else {
			System.out.println("Number is: "+n);
		}
	}

}
