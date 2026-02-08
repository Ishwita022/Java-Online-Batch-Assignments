package com.tka.String_2;

import java.util.Scanner;

public class WhiteSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	       String str;
	       System.out.print("Enter Info: ");
	       str=sc.nextLine();
	       System.out.println("Display:-"+str);
	       int count=0;
	       
	       for (int i = 0; i < str.length(); i++) {
	    	   char ch = str.charAt(i);
	    	   if(ch==' ') {
	    		   count++;
	    	   }
	    	   
			
		}
	       
	       System.out.println(count);
	}

}
