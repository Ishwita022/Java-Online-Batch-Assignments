package com.tka.pattern_3nov_pract;

public class Square_pattern_with_star_dollar_sign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int r = 1; r <= 5; r++) {
			for (int c = 1; c <= 4; c++) {
				if (c == 3) {
					System.out.print("$ ");
				}
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
