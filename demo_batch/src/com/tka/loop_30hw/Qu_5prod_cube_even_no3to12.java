package com.tka.loop_30hw;

public class Qu_5prod_cube_even_no3to12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long prod = 1, cube = 0;
		for (int i = 3; i <= 12; i++) {
			if (i % 2 == 0) {
				cube = i * i * i;
				prod = prod * cube;
			}
		}
		System.out.println(prod);
	}

}
