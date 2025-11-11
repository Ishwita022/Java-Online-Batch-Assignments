package com.tka.loop_1_nov_hw;

import java.util.Scanner;

public class Qu_13_print_series_of_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner(System.in);
System.out.println("Enter range for all series: ");
int y=sc.nextInt();
System.out.print("print series like: a) 1 2 3 4 5....:--> ");
for (int a = 1; a <=y; a++) {
	System.out.print(a+" ");
}
System.out.println();
System.out.print("print series like: b) 2 4 6 8....:--> ");
for (int b = 1; b <= y; b++) {
	if(b%2==0) {
		System.out.print(b+" ");
	}
}

System.out.println();
System.out.print("print series like: c) 1 3 5 7 9....:--> ");
for (int c = 0; c <= y; c++) {
	if(c%2!=0) {
		System.out.print(c+" ");
	}
}

System.out.println();
System.out.print("print series like: d) 1 4 9 16 25....:--> ");
int sq=0;
for (int d = 1; d <= y; d++) {
		sq=d*d;
		System.out.print(sq+" ");

}

System.out.println();
System.out.print("print series like: e) 1 8 27 64 125....:--> ");
int cube=0;
for (int e = 1; e <= y; e++) {
		cube=e*e*e;
		System.out.print(cube+" ");
}

System.out.println();
System.out.print("print series like: f) 1 5 10 17 26....:--> ");
for (int f = 1; f <= y; f++) {
		if(f==1) {
			System.out.print(f);
		}else {
			int n = (f*f)+1;
			System.out.print(" "+n);
		}
	}

System.out.println();
System.out.print("print series like: g) 1 9 28 65 126....:--> ");
for (int g = 1; g <= y; g++) {
		if(g==1) {
			System.out.print(g);
		}else {
			int n1 = (g*g*g)+1;
			System.out.print(" "+n1);
		}
	}
System.out.println();
System.out.print("print Fibonacci series like: h) 0 1 1 2 3 5....:--> ");
int n1=0, n2=1, n3=0;
for (int h = 0; h <=y; h++) {
	System.out.print(n1+" ");
	n3=n1+n2;
	n1=n2;
	n2=n3;
}
System.out.println();
System.out.print("print Fibonacci series like: i) 2 3 5 7 11 13....:--> ");
for (int i = 1; i <= 20; i++) {
	int count=0;
	for (int k = 1; k <= i; k++) {
		if(i%k==0) {
			count++;
		}
	}
	if(count==2) {
		System.out.print(i+" ");
	}
}

System.out.println();
System.out.print("print Fibonacci series like: j) 5 10 15 20 25....:--> ");
for (int j = 5; j <= 50; j++) {
	if(j%5==0) {
		System.out.print(j+" ");
	}
}
	}
	}
	
