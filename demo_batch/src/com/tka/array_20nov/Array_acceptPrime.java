package com.tka.array_20nov;

import java.util.Scanner;

public class Array_acceptPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int y[] = new int[5];
		Array_acceptPrime a1 = new Array_acceptPrime();
		a1.acceptPrime(y);
		a1.show(y);
	}

//	write a method to accept only prime number in array 
	public void acceptPrime(int y[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter prime number: ");
		for (int i = 0; i < y.length; i++) {
			int num = sc.nextInt();
			int count = 0;
			for (int j = 1; j <= num; j++) {

				if (num % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				y[i] = num;
			} else {
				System.out.println("It is not a prime number! Please enter prime number.");
				i--;
			}
		}
	}

	public void show(int y[]) {
		System.out.println("The prime numbers are: ");
		for (int i = 0; i < y.length; i++) {
			System.out.print(y[i] + " ");
		}
	}

}
