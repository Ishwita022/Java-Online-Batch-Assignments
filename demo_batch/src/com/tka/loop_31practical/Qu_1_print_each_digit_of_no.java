package com.tka.loop_31practical;

import java.util.Scanner;

public class Qu_1_print_each_digit_of_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc= new Scanner(System.in);
 System.out.println("Enter number: ");
 int y = sc.nextInt();
 
 int n=0;
 while(y>0) {
	 System.out.println("Y--> "+y);
	 n=y%10;
	 System.out.println("N--> "+n);
	 y=y/10;
	 System.out.println();
 }
 System.out.println("Y--> "+y);
 }

}
