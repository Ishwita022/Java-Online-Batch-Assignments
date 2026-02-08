package com.tka.String1;

public class H {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = " Java is a Programming Language ";
		System.out.println(s1);
		System.out.println(s1.length());
		
		String s2 = s1.trim();
		System.out.println(s2);
		System.out.println(s2.length());
		
		char ch = s1.charAt(6);
		System.out.println(ch);
//		provide unicode of value
		int code = s1.codePointAt(6);
		System.out.println(code);
	}

}
