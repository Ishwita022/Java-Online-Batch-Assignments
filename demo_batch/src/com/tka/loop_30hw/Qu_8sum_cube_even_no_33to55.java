package com.tka.loop_30hw;

public class Qu_8sum_cube_even_no_33to55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long sum = 0, cube = 0;
		for (int i = 33; i <= 55; i++) {
			if (i % 2 == 0) {
				cube = i * i * i;
				sum = sum + cube;
			}
		}
		System.out.println(sum);
	}

}
