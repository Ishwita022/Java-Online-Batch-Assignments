package com.tka.pattern_3nov_pract;

public class Pyramid_pattern_ABCDE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int r = 1; r <=5; r++) {
			char ch='A';
			for (int c = 1; c <=r; c++) {
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
	}

}
