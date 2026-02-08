package com.tka.Static_Method_5nov;

import java.util.Scanner;

public class MyMath_MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  MyMath m = new MyMath();

  Scanner sc = new Scanner(System.in);
  System.out.print("Enter number: ");
  int a = sc.nextInt();
  int b= sc.nextInt();
//  m.addition(a, b);
//  Acccess the static class name
  MyMath.addition(a, b);
  
	}

}
