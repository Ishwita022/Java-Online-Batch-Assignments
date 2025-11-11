package com.tka.loop_1_nov_hw;

import java.util.Scanner;

public class Qu_2_print_sq_odd_digit_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int y = sc.nextInt();
		
		int n=0, sq=0;
		while(y>0) {
			n=y%10;
			if(n%2!=0) {
				sq= n*n;
				System.out.print(sq+" ");
			}
			y=y/10;
		}
	}

}
