package com.tka.String_2;

import java.util.Scanner;

public class CountVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
       String str;
       System.out.print("Enter Info: ");
       str=sc.nextLine();
       System.out.println("Display:-"+str);
       String str2=str.toLowerCase();
       int count=0;
       for (int i = 0; i < str.length(); i++) {
    	   char ch = str2.charAt(i);
    	   if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u') {
    		   count++;
    	   }
		
       }
       System.out.println(count);
       
	}

}
