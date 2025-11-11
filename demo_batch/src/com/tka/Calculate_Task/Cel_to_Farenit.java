package com.tka.Calculate_Task;

import java.util.Scanner;

public class Cel_to_Farenit {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter temperature in celcius: ");
	int c = sc.nextInt();
	double f = (c*9/5)+32;
	System.out.println("Temperature in faranheit is: "+f);
}
}
