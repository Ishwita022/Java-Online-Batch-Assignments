package com.tka.Calculate_Task;

import java.util.Scanner;

public class Highest_No {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);	
	   System.out.println("Enter 1st number: ");
       int n1 = sc.nextInt();
	   System.out.println("Enter 2nd number: ");
	   int n2 = sc.nextInt();
	   System.out.println("Enter 3rd number: ");
	   int n3 = sc.nextInt();
	   
	   if(n1>n2) {
		   if(n1>n3) {
			   System.out.println("The Greatest number is : "+n1);
		   }else {
			   System.out.println("The Greatest number is : "+n3);
		   }
	   } else {
		   if(n2>n3) {
			   System.out.println("The Greatest number is : "+n2);
		   }else {
			   System.out.println("The Greatest number is : "+n3);
		   }
	   }
	}

}
