package com.tka.loop_logic;

public class Qu3_sum_of_odd321_to_555 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 321; i <= 555; i++) {
			if (i % 2 != 0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}

	}


