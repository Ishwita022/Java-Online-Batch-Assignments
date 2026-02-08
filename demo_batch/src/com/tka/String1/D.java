package com.tka.String1;

public class D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Java is a Programming Language.";
		System.out.println(s1);
		System.out.println();
		String s2 = s1.toLowerCase();
		System.out.println(s2);
		System.out.println();
		s2 = s1.toUpperCase();
		System.out.println(s2);
		System.out.println("-------------");
		int index = s1.indexOf('a');
		System.out.println(index);
		
		index = s1.indexOf('a', 5);
		System.out.println(index);
		
		index = s1.indexOf('Z');
		System.out.println(index);
		
		index = s1.indexOf("gram");
		System.out.println(index);
		
		index = s1.lastIndexOf('a');
		System.out.println(index);
		
		index = s1.lastIndexOf('R');
		System.out.println(index);
		
		index = s1.lastIndexOf("ang");
		System.out.println(index);
	}

}
