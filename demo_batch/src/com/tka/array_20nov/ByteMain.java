package com.tka.array_20nov;

import java.util.Scanner;

public class ByteMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
byte y[] = new byte[5];
ByteMain b = new ByteMain();
b.acceptData(y);
b.showData(y);

	}
	
	
public void acceptData(byte y[]) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number: ");
	for (int i = 0; i < y.length; i++) {
		y[i] = sc.nextByte();
	}
}
public void showData(byte y[]) {
	System.out.print("Value from array: ");
	for (int i = 0; i < y.length; i++) {
		System.out.print(y[i]+ " ");
	}
}
}
