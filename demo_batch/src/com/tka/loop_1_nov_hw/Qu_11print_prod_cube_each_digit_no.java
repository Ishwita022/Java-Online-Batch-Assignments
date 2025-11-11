package com.tka.loop_1_nov_hw;

import java.util.Scanner;

public class Qu_11print_prod_cube_each_digit_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int y = sc.nextInt();
		int n = 0, prod = 1, cube = 0;
		while (y > 0) {
			n = y % 10;
			cube = n * n * n;
			prod *= cube;
			y = y / 10;
		}
		System.out.println(prod);
	}

}
