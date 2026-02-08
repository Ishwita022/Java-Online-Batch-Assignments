package com.tka.methods;

import java.util.Iterator;

public class Task_MainClass_1 {
	public void number() {
		for (int n = 1; n <= 10; n++) {
			System.out.print(n + " ");
		}
	}

	public void user_number(int range) {
		for (int n = 1; n <= range; n++) {
			System.out.print(n + " ");
		}
	}

	public void odd_num(int odd) {
		for (int n = 1; n <= odd; n++) {
			if (n % 2 != 0) {
				System.out.print(n + " ");
			}
		}
	}
	
	public void square(int sq) {
		int totalsq = sq*sq;
		System.out.print("Square of number: "+totalsq);
	}
	
	public void cube(int cube) {
		int total_cube = cube*cube*cube;
		System.out.print("Cube of number: "+total_cube);
	}
	
	public void sum(int num) {
		int sum=0;
		for (int i = 1; i <= num; i++) {
			sum=sum+i;
		}
		System.out.print("Sum of number: "+sum);
	}
	
	public void prod(int n1) {
		int prod=1;
		for (int i = 1; i <= n1; i++) {
			prod*=i;
		}
		System.out.print("Product of number: "+prod);
	}
}
