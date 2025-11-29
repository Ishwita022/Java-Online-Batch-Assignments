package com.tka.array_20nov;

import java.util.Scanner;

public class ArrayProgramMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int y[] = new int[10];
		ArrayProgramMain arr = new ArrayProgramMain();
		arr.aceept(y);
		arr.show(y);
		ArrayProgram arr1 = new ArrayProgram();
		arr1.even(y);
		arr1.square(y);
		arr1.cubeSq(y);
		arr1.reverse(y);
		arr1.oddIndex(y);
		arr1.sumOfElement(y);
		arr1.factorial(y);
	}

	public void aceept(int y[]) {
		System.out.println("Enter number: ");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < y.length; i++) {
			y[i] = sc.nextInt();

		}
	}

	public void show(int y[]) {
		System.out.print(" ");
		for (int i = 0; i < y.length; i++) {
			System.out.print(y[i] + " ");
		}
		System.out.print(" ");
	}

}
