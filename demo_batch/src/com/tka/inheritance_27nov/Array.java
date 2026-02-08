package com.tka.inheritance_27nov;

import java.util.Iterator;

public class Array {

	public void reverse() {
		int array_1[] = { 4, 1, 7, 8, 0, 2 };
		for (int i = array_1.length - 1; i >= 0; i--) {
			System.out.print(array_1[i] + " ");
		}
		System.out.println();
	}

	public void copy() {
		int array_2[] = { 4, 1, 7, 8, 0, 2 };
		int array_copy[] = new int[array_2.length];
		for (int i = 0; i < array_2.length; i++) {
			array_copy[i] = array_2[i];
		}
		System.out.print("{");
		for (int i = 0; i < array_copy.length; i++) {
			System.out.print(array_copy[i] + " ");
		}
		System.out.println("}");
		System.out.println();

	}
	
	public void sum(int a, int b) {
		int sum=0;
		for (int i = a; i <= b; i++) {
			sum=sum+i;
		}
		System.out.println("Sum from 1 to 7:- "+sum);
	}

	public void sum2(int a, int b) {
		int sum=0;
		for (int i = a; i >= b; i--) {
			sum=sum+i;
		}
		System.out.println("Sum from 8 to 3:- "+sum);
	}
}
