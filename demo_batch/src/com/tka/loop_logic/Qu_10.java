package com.tka.loop_logic;

public class Qu_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long prod = 1;
		for (int i = 100; i <= 150; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				prod = prod * i;
			}

		}
		System.out.println(prod);
	}

}
