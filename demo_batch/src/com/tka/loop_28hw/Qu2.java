package com.tka.loop_28hw;

public class Qu2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		write a program to print square of odd number from 33 to 77
		for (int k = 33; k <= 77; k++) {
			if (k % 2 != 0) {
				int i = k*k;
				System.out.println(i);
			}
		}
	}

}
