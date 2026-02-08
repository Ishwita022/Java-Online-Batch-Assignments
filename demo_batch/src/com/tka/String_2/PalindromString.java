package com.tka.String_2;

import java.util.Scanner;

public class PalindromString {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    String str;
    System.out.print("Enter Info: ");
    str=sc.nextLine();
    System.out.println("Display:-"+str);
    String rev="";
    
    for (int i = str.length()-1; i >=0 ; i--) {
    
    	char ch = str.charAt(i);
    	rev+=ch;
		
	}
    
    if(str.equalsIgnoreCase(rev)) {
    	System.out.println("Palindrom ");
    }else {
    	System.out.println("Not Palindrom ");
    }
}
}
