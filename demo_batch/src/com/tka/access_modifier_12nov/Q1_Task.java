package com.tka.access_modifier_12nov;

public class Q1_Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. write a program to generate following series 
//		a) int y=5423
//		55555
//		4444
//		22
//		333
//
//		b) 1 -2 3 -4 5 -6....
//		c) 1 -3 5 -7 9 -11...
//		d) -1 2 -3 4 -5 6...
//		e) 2 -4 6 -8 10 -12...
		int y = 5423;
		int temp = y;
		int rev = 0;
		while (temp > 0) {
			int n = temp % 10;
			rev = (rev * 10) + n;
			temp = temp / 10;
		}

		while (rev > 0) {
			int n = rev % 10;

			int j = 0;
			while (j < n) {
				System.out.print(n);
				j++;
			}
			System.out.println();
//			System.out.println("hello");
			rev /= 10;
		}
	}

}
