package com.tka.loop_28hw;

public class Qu5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		write a program to print cube of odd number from 300 to 450
		for (int k = 300; k <= 450; k++) {
			if (k % 2 != 0) {
				int i = k*k*k;
				System.out.println(i);
			}
		}
	}

}
