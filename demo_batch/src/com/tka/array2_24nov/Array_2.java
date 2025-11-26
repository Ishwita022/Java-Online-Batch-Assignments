package com.tka.array2_24nov;

import java.util.Scanner;

public class Array_2 {

	public void acceptdata(int arr[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		for (int k = 0; k < arr.length; k++) {
			 arr[k] = sc.nextInt();
		}
	}

	public void showdata(int arr[]) {
		System.out.println();
		System.out.println("The values from array is: ");
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k]+ " ");
		}
	}
	
	public void secondmax(int arr[]) {
		int max =arr[0];
		int secmax= arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max) {
				secmax = max;
				max=arr[i];
			} else if(arr[i]>secmax && arr[i]!=max) {
				secmax= arr[i];
			}
		}
		System.out.println("Second max: "+secmax);
	}
	
	public void secondmin(int arr[]) {
		int min =arr[0];
		int secmin= arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<min) {
				secmin = min;
				min=arr[i];
			} else if(arr[i]<secmin && arr[i]==min) {
				secmin= arr[i];
			}
		}
		System.out.println("Second max: "+secmin);
	}
}
