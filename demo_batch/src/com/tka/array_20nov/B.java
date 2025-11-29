package com.tka.array_20nov;

import java.util.Scanner;

public class B {
public static void main(String[] args) {
	//2D array
	int[][] y = new int[3][3];
	B  b = new B();
	b.accept(y);
	b.show1(y);
	
}

public void accept(int y[][]) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter number: ");
	for (int i = 0; i < y.length; i++) {
		for (int j = 0; j < y[i].length; j++) {
			y[i][j] = sc.nextInt();
		}
	}	
}

public void show1(int y[][]) {
	System.out.println();
	for (int i = 0; i < y.length; i++) {
		for (int j = 0; j < y[i].length; j++) {
			System.out.print(y[i][j]+ " ");
		}
		System.out.println();
	}
}
}
