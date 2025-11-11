package com.tka.pattern_3nov_pract;

public class Square_patternABCDE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int r = 1; r <= 5; r++) {
			char ch = 'A';
			for (int c = 1; c <= 5; c++) {
				System.out.print(ch + " ");
				ch++;
			}
			System.out.println();
		}
	}
}
