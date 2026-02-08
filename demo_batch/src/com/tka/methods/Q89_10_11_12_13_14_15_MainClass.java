package com.tka.methods;

import java.util.Scanner;

public class Q89_10_11_12_13_14_15_MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Q89_10_11_12_13_14_15 q1= new Q89_10_11_12_13_14_15();
  Scanner sc  = new Scanner(System.in);
  
  
  System.out.print("Enter number for check prime number or not: ");
  int n1 = sc.nextInt();
 q1.prime(n1);
 System.out.println();
 
 System.out.print("Enter number for find sum of digit: ");
 int n2 = sc.nextInt();
int s =q1.sumofdigit(n2);
System.out.println(s);
System.out.println();

System.out.print("Enter number for find prod of digit: ");
int n3 = sc.nextInt();
int p =q1.prodofdigit(n3);
System.out.println(p);
System.out.println();

System.out.println("Enter number for find factorial: ");
int n4=sc.nextInt();
q1.factorial(n4);
System.out.println();

System.out.print("Enter base: ");
int b = sc.nextInt();
System.out.print("Enter power: ");
int u = sc.nextInt();
q1.power(b, u);
System.out.println();

System.out.print("Enter number for factorial of each digit: ");
int n5= sc.nextInt();
q1.fact_each_digit(n5);
System.out.println();

System.out.print("Enter number for palindrom number: ");
int n6= sc.nextInt();
q1.palindrome(n6);
System.out.println();
	
	System.out.print("Enter number for no. of digit: ");
	int n7= sc.nextInt();
int d =	q1.no_of_digit(n7);
System.out.println("the total no. of digit is: "+d);
	System.out.println();
}
}