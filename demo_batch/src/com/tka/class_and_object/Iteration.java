package com.tka.class_and_object;

import java.util.Scanner;

public class Iteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		while (true) {
			if (n == 7) {
				break;
			}
			n = sc.nextInt();
		}

	}

}
