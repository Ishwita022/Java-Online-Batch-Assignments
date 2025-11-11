package com.tka.loop_28hw;

public class Qu7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 write a program to print cube of number divisible by 4 and 7 from 555 to 999
		for (int k = 555; k <= 999; k++) {
			if (k % 4 == 0 && k % 7 == 0) {
				int i = k * k * k;
				System.out.println(i);
			}
		}
	}

}
