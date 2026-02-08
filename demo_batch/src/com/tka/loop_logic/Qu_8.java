package com.tka.loop_logic;

public class Qu_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long prod = 1;
		for (int i = 15; i <= 30; i++) {
			if (i % 2 != 0) {
				prod = prod * i;
			}

		}
		System.out.println(prod);
	}

	}


