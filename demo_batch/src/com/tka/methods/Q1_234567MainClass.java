package com.tka.methods;

import java.util.Scanner;

public class Q1_234567MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q1_234567 q = new Q1_234567();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number for even check: ");
		int n1 = sc.nextInt();
		q.even(n1);
		System.out.println();
		
		System.out.print("Enter number for odd check: ");
		int n2 = sc.nextInt();
		q.odd(n2);
		System.out.println();
		
		System.out.print("Enter number for check divisble by 3 or not: ");
		int n3 = sc.nextInt();
		q.div3(n3);
		System.out.println();
		
		System.out.print("Enter number for check divisble by 5 or not: ");
		int n4 = sc.nextInt();
		q.div5(n4);
		System.out.println();
		
		System.out.print("Enter number for check divisble by 3 or 5 or not: ");
		int n5 = sc.nextInt();
		q.div3or5(n5);
		System.out.println();
		
		System.out.print("Enter number for print condition: ");
		int n6 = sc.nextInt();
		q.Mango(n6);
		System.out.println();
		
		System.out.print("Enter number for check divisble by 4 and 7 or not: ");
		int n = sc.nextInt();
		q.div4and7(n);
		System.out.println();

	}

}
