package com.tka.loop_30hw;

public class Qu_1sum_sq_odd_no_33to55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 write a program to print sum of square of odd numbers from 33 to 55.
		long sum = 0, k = 0;
		for (int i = 33; i <= 55; i++) {
			if (i % 2 != 0) {
				k = i * i;
				sum = sum + k;
			}
			
		}
		System.out.println(sum);
		
	}

}
