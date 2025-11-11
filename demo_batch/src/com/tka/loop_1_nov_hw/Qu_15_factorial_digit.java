package com.tka.loop_1_nov_hw;

import java.util.Scanner;

public class Qu_15_factorial_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		  System.out.print("Enter number: ");
		  int y= sc.nextInt();
		  int fact=1;
		 for (int i = 1; i <= y; i++) {
			fact=fact*i;
		}
		 System.out.println(fact);
	}

}
