package com.tka.loop_30hw;

public class Qu_2prod_cube_odd_no_3to12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		write a program to print product of cube of odd numbers from 3 to 12.
		long prod = 1, k = 0;
		for (int i = 3; i <= 12; i++) {
			if (i % 2 != 0) {
				k = i * i * i;
				prod = prod * k;
			}

		}
		System.out.println(prod);

	}

}
