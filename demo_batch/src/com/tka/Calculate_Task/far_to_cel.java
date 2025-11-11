package com.tka.Calculate_Task;

import java.util.Scanner;

public class far_to_cel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temperature in faranheit : ");
		int f = sc.nextInt();
		double c = (f-32)*5/9;
		System.out.println("Temperature in celcius is: "+c);
	}

}
