package com.tka.class_and_object;

import java.util.Scanner;

public class Option {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Option option =new Option();
option.showOption();
	}

public void showOption() {
	MyOperation m= new MyOperation();
	Scanner sc= new Scanner(System.in);
	System.out.println("1. Addition");
	System.out.println("2. Subtraction ");
	System.out.println("3. Multiplication ");
	System.out.println("4. Division");
	System.out.println("5. Mod ");
	int a =0, b=0;
	System.out.println("Enter choice: ");
	int choice = sc.nextInt();
	switch(choice) {
	case 1:
		System.out.print("Enter 1st number: ");
		 a= sc.nextInt();
		System.out.print("Enter 2nd number: ");
		b= sc.nextInt();
		m.sum(a, b);
		break;
		
	case 2: 
		System.out.print("Enter 1st number: ");
		 a= sc.nextInt();
		System.out.print("Enter 2nd number: ");
		 b= sc.nextInt();
		m.sub(a, b);
		
		break;
		
	case 3:
		System.out.print("Enter 1st number: ");
		 a= sc.nextInt();
		System.out.print("Enter 2nd number: ");
		 b= sc.nextInt();
		m.mod(a, b);
		break;
		
	case 4:
		System.out.print("Enter 1st number: ");
		 a= sc.nextInt();
		System.out.print("Enter 2nd number: ");
		 b= sc.nextInt();
		m.div(a, b);
		break;
		
	case 5:
		System.out.print("Enter 1st number: ");
		 a= sc.nextInt();
		System.out.print("Enter 2nd number: ");
		 b= sc.nextInt();
		m.mod(a, b);
		break;
		
	default :
		System.out.println("Your choice is not found");
		break;
	}
}

	}
