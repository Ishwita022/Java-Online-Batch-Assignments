package com.tka.inheritance_27nov;

import java.util.Iterator;

public class Revrse_position {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. write a program to reverse the position of array elements 
//		int array_1[]={4,1,7,8,0,2};
//		output -: int array_1[]={2,0,8,7,1,4};
int array_1[]= {4, 1, 7, 8, 0, 2};
for (int i = array_1.length-1; i>=0; i--) {
	System.out.print(array_1[i]+" ");
}
System.out.println();

//2. write a program to copy one array into another array 
//int array_1[]={4,1,7,8,0,2};
//output -: int array_2[]={4,1,7,8,0,2};

int arr1[]= {4, 1, 7, 8, 0, 2};
int arr2[] = new int[arr1.length];
for (int i = 0; i < arr2.length; i++) {
	arr2[i]=arr1[i];
}

System.out.print("{");
for (int i = 0; i < arr2.length; i++) {
	System.out.print(arr2[i]+" ");
}
System.out.print("}");

	}

}
