package com.tka.array_20nov;

import java.util.Scanner;

public class ArrayProgram {
//	1. write a method to print even elements from array 
	public void even(int y[]) {
		System.out.println();
		System.out.print("The even number is: ");
		for (int i = 0; i < y.length; i++) {
			if (y[i] % 2 == 0) {
				System.out.print(y[i] + " ");
			}
		}
	}

//	2. write a method to print square of elements of array 
	public void square(int y[]) {
		System.out.println();
		System.out.print("The square of number is: ");
		for (int i = 0; i < y.length; i++) {
			int sq = y[i] * y[i];
			System.out.print(sq + " ");
		}
	}

//	3. write a method to print cube of odd elements of array 
	public void cubeSq(int y[]) {
		System.out.println();
		System.out.print("The cube of odd number is: ");
		for (int i = 0; i < y.length; i++) {
			if (y[i] % 2 != 0) {
				int cube = y[i] * y[i] * y[i];
				System.out.print(cube + " ");
			}
		}
	}

//	4. write a method to print array in reverse 
	public void reverse(int y[]) {
		System.out.println();
		System.out.print("The reverse number is: ");
		for (int i = y.length - 1; i >= 0; i--) {
			System.out.print(y[i] + " ");
		}

	}

//	5. write a method to print odd index elements of array 
	public void oddIndex(int y[]) {
		System.out.println();
		System.out.print("The odd index number is: ");
		for (int i = 0; i < y.length; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
	}

//	6. write a method to print sum of elements of array 
	public void sumOfElement(int y[]) {
		System.out.println();
		int sum = 0;
		System.out.print("The sum of number is: ");
		for (int i = 0; i < y.length; i++) {
			sum = sum + y[i];
		}
		System.out.print(sum + " ");
	}

//	7. write a method to print product of even elements of array 
	public void prodOfeven(int y[]) {
		System.out.println();
		int prod = 1;
		System.out.print("The Product of even number is: ");
		for (int i = 0; i < y.length; i++) {
			if (y[i] % 2 == 0) {
				prod = prod * y[i];
			}
		}
		System.out.print(prod + " ");
	}

//	10. write a method to print factorial of elements of array	
	public void factorial(int y[]) {
		System.out.println();
		System.out.println("The factorial of number is:");
		for (int k = 0; k < y.length; k++) {
			int fact = 1;
			int num = y[k];
    
			for (int i = 1; i <= num; i++) {
				fact = fact * i;
			}
			System.out.print(fact + " ");
		}

	}

}
