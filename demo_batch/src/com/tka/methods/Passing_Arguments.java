package com.tka.methods;

import java.util.Scanner;

public class Passing_Arguments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Passing_Argument_class p1= new Passing_Argument_class();
p1.add(12, 44);
Scanner sc = new Scanner(System.in);
System.out.print("Enter 1st number: ");
int a = sc.nextInt();
System.out.print("Enter 2nd number: ");
int b = sc.nextInt();
p1.add(a, b);

p1.sub(55, 33);
System.out.print("Enter 1st number: ");
int a1 = sc.nextInt();
System.out.print("Enter 2nd number: ");
int b1 = sc.nextInt();
p1.sub(a1, b1);;

p1.mul(55, 3);
System.out.print("Enter 1st number: ");
int a2 = sc.nextInt();
System.out.print("Enter 2nd number: ");
int b2 = sc.nextInt();
p1.mul(a2, b2);;

p1.div(16, 2);
System.out.print("Enter 1st number: ");
int a3 = sc.nextInt();
System.out.print("Enter 2nd number: ");
int b3 = sc.nextInt();
p1.div(a3, b3);;

p1.sub(55, 33);
System.out.print("Enter 1st number: ");
int a4 = sc.nextInt();
System.out.print("Enter 2nd number: ");
int b4 = sc.nextInt();
p1.mod(a4, b4);;
	}

}
