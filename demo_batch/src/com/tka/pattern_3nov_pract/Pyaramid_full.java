package com.tka.pattern_3nov_pract;

public class Pyaramid_full {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sp = 5;
		for (int r = 1; r <= 5; r++) {
			for (int k = 1; k <= (sp - r); k++) {
				System.out.print(" ");
			}
			for (int c = 1; c <= r; c++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
