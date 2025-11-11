package com.tka.loop_1_nov_hw;

import java.util.Scanner;

public class Qu_9print_sum_sq_each_digit_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int y = sc.nextInt();
  int n=0, sum=0, sq=0;
  while(y>0) {
	  n=y%10;
	  sq=n*n;
	  sum=sum+sq;
	  y=y/10;
  }
  System.out.println(sum);
	}

}
