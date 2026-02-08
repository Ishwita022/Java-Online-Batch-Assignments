package com.tka.loop_logic;

public class Qu_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long sum = 0;
		for (int i = 233; i <= 344; i++) {
			if (i % 4 == 0 && i % 7 == 0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}

	}


