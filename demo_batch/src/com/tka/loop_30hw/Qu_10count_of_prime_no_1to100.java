package com.tka.loop_30hw;

import java.util.Iterator;
import java.util.Scanner;

public class Qu_10count_of_prime_no_1to100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter start range: ");
		int start = sc.nextInt();
		System.out.print("Enter end range: ");
		int end = sc.nextInt();

		int prime = 0;

		for (int i = start; i <= end; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				prime++;
			}
		}
		System.out.println(prime);

	}
}
