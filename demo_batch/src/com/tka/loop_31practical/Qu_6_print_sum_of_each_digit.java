package com.tka.loop_31practical;

import java.util.Scanner;

public class Qu_6_print_sum_of_each_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number: ");
		int y = sc.nextInt();
		
		int n=0, sum=0;
		while(y>0) {
			n=y%10;
			sum=sum+n;
//			System.out.println(sum);
			y=y/10;
		}
		System.out.println(sum);
	}

}
