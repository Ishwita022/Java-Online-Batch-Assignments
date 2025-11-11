package com.tka.loop_31practical;

import java.util.Scanner;

public class Qu_5_print_cube_each_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number: ");
		int y = sc.nextInt();

		int n=0, cube=0;
		while(y>0) {
			n=y%10;
			cube=n*n*n;
			System.out.println(cube);
			y=y/10;
		}
	}

}
