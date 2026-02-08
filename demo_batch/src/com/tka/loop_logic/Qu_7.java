package com.tka.loop_logic;

public class Qu_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long prod = 1;
		for (int i = 12; i <= 33; i++) {
			if (i % 2 == 0) {
				prod = prod * i;
			}

		}
		System.out.println(prod);
	}

}
