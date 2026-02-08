package com.tka.String_2;

public class Palindrome_Not_2 {

	public static void main(String[] args) {
		String s="A man, a plan, a canal -- Panama";
		
		s=s.toLowerCase();
		String s1=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s1);
		
		String rev="";
		
		for (int i = s1.length()-1; i >=0; i--) {
			char ch = s1.charAt(i);
			rev+=ch;
			
		}
		
		if(s1.equals(rev)) {
			System.out.println("Palindrom");
		}else {
			System.out.println("Not Palindrom");
		}
	}

}
