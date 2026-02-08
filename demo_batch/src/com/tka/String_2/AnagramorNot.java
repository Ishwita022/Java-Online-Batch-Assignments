package com.tka.String_2;

import java.util.Iterator;

public class AnagramorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "eleven plus two";
		String s2 = "twelve plus one";
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		int count1[]= new int[26];
		int count2[]= new int[26];
		
		for (int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);
			if(ch>='a' && ch<='z') {
				count1[ch-'a']++;
			}
		}
		
		for (int i = 0; i < s2.length(); i++) {
			char ch = s2.charAt(i);
			if(ch>='a' && ch<='z') {
				count2[ch-'a']++;
			}
		}
		boolean isAnagram = true;
		for (int i = 0; i < 26; i++) {
			if(count1[i]!=count2[i]) {
				isAnagram = false;
			}	
		}
		
		if(isAnagram) {
			System.out.println("Strings are Anagram");
		}else {
System.out.println("Strings are not Anagram");
		}
		
	}

}
