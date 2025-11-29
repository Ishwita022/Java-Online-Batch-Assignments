package com.tka.array_20nov;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int y[] = new int[5];
//		y[0] = 100;
//		y[1] = 200;
//		y[2] = 250;
//		y[3] = 300;
//		y[4] = 400;
//
//		System.out.println(y[0]);
//		System.out.println(y[1]);
//		System.out.println(y[2]);
//		System.out.println(y[3]);
//		System.out.println(y[4]);
		
		A a1 = new A();
		a1.acceptData(y);
		a1.showData(y);
		
	}
//accept value in array
	public void acceptData(int y[]) {
		int len = y.length;
		System.out.println("Size -: "+len);
		System.out.print("Enter Number");
		Scanner sc = new Scanner(System.in);
		for(int k =0; k<y.length ; k++) {
			y[k] = sc.nextInt();
		}
		
	}
	
	//show the value from array
public void showData(int y[]) {
	System.out.println();
	System.out.println("Value from array: ");
	for (int k = 0; k < y.length; k++) {
		System.out.println(y[k]+" ");
	}
}

}
