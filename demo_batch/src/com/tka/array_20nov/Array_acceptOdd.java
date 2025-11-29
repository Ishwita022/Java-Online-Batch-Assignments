package com.tka.array_20nov;

import java.util.Scanner;

public class Array_acceptOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[] = new int[10];
		Array_acceptOdd a = new Array_acceptOdd();
		a.acceptOdd(x);
		a.showOdd(x);
	}

//	write a method to accept only odd numbers in array
	public void acceptOdd(int x[]) {
		System.out.println("Enter odd number: ");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < x.length; i++) {
			int num = sc.nextInt();
			if (num % 2 != 0) {
				x[i] = num;
			} else {
				System.out.println("Even number! Please enter odd number.");
				i--;
			}
		}
	}

	public void showOdd(int x[]) {
		System.out.println();
		System.out.print("The odd number is: ");
		for (int i = 0; i < x.length; i++) {

			System.out.print(x[i] + " ");
		}
	}
}
