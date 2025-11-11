package com.tka.loop_31practical;

import java.util.Scanner;

public class Qu_8_print_reverse_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number: ");
		int y = sc.nextInt();
		
		int n=0, rev=0;
		while(y>0) {
			n=y%10;
			rev=(rev*10)+n;
			y=y/10;
		}
		System.out.print(rev+" ");
	}

}
