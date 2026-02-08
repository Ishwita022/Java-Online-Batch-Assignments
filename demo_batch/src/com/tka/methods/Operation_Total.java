package com.tka.methods;

import java.util.Scanner;

public class Operation_Total {
	public void add() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st number: ");
		int n1 = sc.nextInt();
		System.out.print("Enter 2nd number: ");
		int n2 = sc.nextInt();
		int add = n1 + n2;
		System.out.println("Addition: " + add);
	}
	
	public void sub() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st number: ");
		int a = sc.nextInt();
		System.out.print("Enter 2nd number: ");
		int b = sc.nextInt();
		int sub = a - b;
		System.out.println("Substraction: " + sub);
	}
	
	public void mul() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st number: ");
		int x = sc.nextInt();
		System.out.print("Enter 2nd number: ");
		int y = sc.nextInt();
		int mul = x * y;
		System.out.println("Multiplication: " + mul);
	}
	
	public void div() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st number: ");
		int d1 = sc.nextInt();
		System.out.print("Enter 2nd number: ");
		int d2 = sc.nextInt();
		int div = d1 / d2;
		System.out.println("Division: " + div);
	}
	
	public void mod() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st number: ");
		int m1 = sc.nextInt();
		System.out.print("Enter 2nd number: ");
		int m2 = sc.nextInt();
		int mod = m1 % m2;
		System.out.println("Modulo: " + mod);
	}
}
