package com.tka.access_modifier_12nov;

import java.util.Iterator;
import java.util.Scanner;

public class Q1_Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter range of number: ");
		int n = sc.nextInt();
		System.out.println();

		System.out.println("Print series like(1, -2, 3, -4, 5.....)");
		for (int i = 1; i <= n; i++) {

			if (i % 2 == 0) {
				System.out.print(-i + " ");
			} else {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println();
		int num = 1;
		System.out.println("Print series like(1, -3, 5, -7 , 9, -11.....)");
		for (int j = 1; j <= n; j++) {
			if (j % 2 == 1) {
				System.out.print(num + " ");
			} else {
				System.out.print(-num + " ");
			}
			num += 2;
		}
		System.out.println();
		System.out.println();
		System.out.println("Print series like(-1 2 -3 4 -5 6........)");
		for (int i = 1; i <= n; i++) {

			if (i % 2 != 0) {
				System.out.print(-i + " ");
			} else {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println();
		System.out.println("Print series like(2 -4 6 -8 10 -12...)");
		int num1 = 2;
		for (int j = 1; j <= n; j++) {
			if (j % 2 == 1) {
				System.out.print(num1 + " ");
			} else {
				System.out.print(-num1 + " ");
			}
			num1 += 2;
		}
	}
}