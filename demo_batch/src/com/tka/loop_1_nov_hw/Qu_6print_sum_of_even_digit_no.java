package com.tka.loop_1_nov_hw;

import java.util.Scanner;

public class Qu_6print_sum_of_even_digit_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int y = sc.nextInt();
		
		int n=0, sum=0;
		while(y>0) {
			n=y%10;
			if(n%2==0) {
				sum=sum+n;
			}
			y=y/10;
		}
		System.out.println(sum);	
	}

}
