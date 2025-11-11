package com.tka.loop_31practical;

import java.util.Scanner;

public class Qu_7_print_prod_of_each_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number: ");
		int y = sc.nextInt();
		
		int n=1, prod=1;
		while(y>0) {
			n=y%10;
			prod=prod*n;
			y=y/10;
		}
		System.out.println(prod);
	}

}
