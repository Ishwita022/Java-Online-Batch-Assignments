package com.tka.Calculate_Task;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter 1st Number : ");
      double n1 = sc.nextInt();
      System.out.println("Enter 2nd Number : ");
      double n2 = sc.nextInt();
      System.out.println("Enter operator(+, -, *, /, %): ");
     char operator;
     operator = sc.next().charAt(0);
      
      switch (operator) {
	case '+':
		double r1= n1+n2;
		System.out.println("Addition : "+r1);
		break;
	
	case '-':
		double r2= n1-n2;
		System.out.println("Substratction : "+r2);
		break;
		
	case '*':
		double r3= n1*n2;
		System.out.println("Multilication : "+r3);
		break;
		
	case '/':
		double r4= n1/n2;
		System.out.println("Division : "+r4);
		break;
		
	case '%':
		double r5= n1%n2;
		System.out.println("Modulo : "+r5);
		break;
	default:
		System.out.println("Invalid Operator");
		break;
	}
      
	}

}
