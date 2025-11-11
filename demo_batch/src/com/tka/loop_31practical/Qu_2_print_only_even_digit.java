package com.tka.loop_31practical;

import java.util.Scanner;

public class Qu_2_print_only_even_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		 System.out.println("Enter number: ");
		 int y = sc.nextInt();
		 
		 int n=0;
		 while(y>0) {
//			 System.out.println("Y--> "+y);
			 n=y%10;
			 if(n%2==0) {
				 System.out.println(n);
			 }
			 y=y/10;
		 }
		 
		 
	}

}
