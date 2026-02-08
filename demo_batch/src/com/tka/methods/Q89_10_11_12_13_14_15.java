package com.tka.methods;

import java.util.Iterator;

public class Q89_10_11_12_13_14_15 {

	public void prime(int n1) {
		int count =0;
		for (int i = 1; i <=n1; i++) {
			if(n1%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("Prime number");
		}else {
			System.out.println("Not Prime number");
		}
	}
	
	public int sumofdigit(int n2) {
		int sum=0;
		while(n2>0) {
			int y = n2%10;
			sum=sum+y;
			n2=n2/10;
		}
		return sum;
	}
	
	public int prodofdigit(int n3) {
		int prod=1;
		while(n3>0) {
			int y = n3%10;
			prod=prod*y;
			n3=n3/10;
		}
		return prod;
	}
	
	public void factorial(int n4) {
		int fact =1;
		for (int i = 1; i <=n4; i++) {
			fact=fact*i;
		}
		System.out.println("The factorial of given number is: "+fact);
	}
	
	
	public void  power(int b, int p) {
		int r=1;
		for (int i = 1; i <=p; i++) {
			r = r*b;
		}
		System.out.print("The power of number: "+r);
	}
	
	public void fact_each_digit(int n5) {
		
		while(n5>0) {
			int fact=1;
			int y=n5%10;
		for (int j = 1; j <=y; j++) {
			fact=fact*j;
		}
		System.out.println("Factorial of each digit of "+y+": "+fact+" ");
		n5=n5/10;
		}
	}
	
	public void palindrome(int n6) {
		int rev=0;
		int t=n6;
		while(n6>0) {
			int y=n6%10;
			
			rev=(rev*10)+y;
			n6=n6/10;
		}
		if(rev == t) {
			System.out.print("Palindrom number");
		}else {
			System.out.print("not Palindrom number");
		}
	}
	
	public int no_of_digit(int n7) {
		int count=0, y=0;
		while(n7>0) {
			y=n7/10;	
				count++;
		}
	if(count==0) {
		count=1;
	}
		return count;
	}
	
}
