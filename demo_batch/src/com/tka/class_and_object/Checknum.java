package com.tka.class_and_object;


public class Checknum {

	public int digit(int num) {
		int count = 0;
		while (num > 0) {
			num = num / 10;
			count++;
		}
		if (count == 0) {
			count = 1;
		}
		return count;
	}

	
	public int power(int base, int pow) {
		int total=0;
		for (int i = 1; i <=pow; i++) {
			 total = base*i;
		}
		return total;
	}
}
