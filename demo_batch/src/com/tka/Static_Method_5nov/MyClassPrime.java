package com.tka.Static_Method_5nov;

public class MyClassPrime {
	public void prime(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.print("Prime number");
		} else {
			System.out.print("Not prime number");
		}

	}
}
