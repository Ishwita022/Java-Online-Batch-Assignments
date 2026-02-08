package com.tka.String_2;

public class PangramOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="The quick brown fox jumps over the lazy dog.";
		s1=s1.toLowerCase();
		boolean b1[]= new boolean[26];
		
		for (int i = 0; i < s1.length(); i++) {
			char s = s1.charAt(i);
			
			if(s>='a' && s<='z') {
				b1[s-'a']=true;
			}
			
		}
		
		boolean isPngram=true;
		
		for (int i = 0; i < 26; i++) {
			if(b1[i]==false) {
				isPngram=false;
				break;
			}
		}
		
		if(isPngram) {
			System.out.println("String is pangram");
		}else {
			System.out.println("String is not pangram");
		}
	}

}
