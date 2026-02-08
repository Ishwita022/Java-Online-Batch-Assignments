package com.tka.Static_Method_5nov;

import java.util.Scanner;

public class MainClassPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  MyClassPrime p = new MyClassPrime();
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter number: ");
  int n = sc.nextInt();
  p.prime(n);
	}

}
