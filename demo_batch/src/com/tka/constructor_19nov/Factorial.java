package com.tka.constructor_19nov;

import java.util.Iterator;
import java.util.Scanner;

public class Factorial {
	Scanner sc = new Scanner(System.in);
	public void fact () {
		
		System.out.println("Enter number: ");
		int y = sc.nextInt();

		System.out.println();
		int rev =0;
		while(y>0) {
			int n = y%10;
			rev = (rev*10)+n;
			y/=10;
		}
		System.out.println("Factorial of each digit is: ");
		while(rev>0) {
			int n = rev%10;

			int fact =1;
			for (int i = 1; i <= n; i++) {
				fact = fact*i;
			}
			System.out.println(n+ "!="+fact);
			rev= rev/10;
		}
		System.out.println();
	}

		// sum of factorial
	public void sumFact() {	
		System.out.println("Enter number for print sum of factorial: ");
		long y1 = sc.nextLong();
		
		int sum =0;
		while(y1>0) {
			int fact1 = 1;
			long n1= y1%10;
			for (int i = 1; i <= n1; i++) {
				fact1 = fact1*i;
			}
			sum =sum+fact1;
			y1 = y1/10;
		}
		System.out.println("Sum of factorial is: "+sum);
	
	}
}
