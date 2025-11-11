package com.tka.pattern_3nov_pract;

public class Square_pattern_with3row_star_dollar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int r = 1; r <= 5; r++) {
			for (int c = 1; c <= 5; c++) {
				if (r == 3) {
					System.out.print("$ ");
					continue;
				}
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
