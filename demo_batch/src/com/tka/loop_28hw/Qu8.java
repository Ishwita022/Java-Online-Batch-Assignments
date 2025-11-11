package com.tka.loop_28hw;

public class Qu8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		write a program to print of number divisible by 3 and 5 from 555 to 999
		for (int k = 555; k <= 999; k++) {
			if (k % 3 == 0 && k % 5 == 0) {
				System.out.println(k);
			}
		}
	}

}
