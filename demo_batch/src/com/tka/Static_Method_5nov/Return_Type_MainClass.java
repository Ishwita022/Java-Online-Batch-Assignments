package com.tka.Static_Method_5nov;

import java.util.Scanner;

public class Return_Type_MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Return_Type_Method r = new Return_Type_Method();
 int s=0;
 s=r.sumofnum();
 System.out.println(s);
 System.out.println();
 
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter number: ");
 int n=sc.nextInt();
 r.div4_7(n);
 
		long p=r.prod_odd();
		System.out.print("product of number: "+p);
	}

}
