package com.tka.loop_1_nov_hw;

import java.util.Scanner;

public class Qu_8print_prod_of_odd_digit_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int y = sc.nextInt();

		int n = 0, prod = 1;
		while (y > 0) {
			n = y % 10;
			if (n % 2 != 0) {
				prod *= n;
			}
			y = y / 10;
		}
		System.out.println(prod);
	}

}
