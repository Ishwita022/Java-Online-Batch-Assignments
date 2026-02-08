package com.tka.String_2;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	       String str;
	       System.out.print("Enter Info: ");
	       str=sc.nextLine();
	       System.out.println("Display:-"+str);
	       
	     for (int i = str.length()-1; i >= 0; i--) {
	    	 char ch = str.charAt(i);
			System.out.print(ch);
		}
	     System.out.println();
	}

}
