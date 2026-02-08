package com.tka.String1;

public class G {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Java is a Programming Language";
		System.out.println(s1);
		
		String ss[]=s1.split("a");
		for (String s2 : ss) {
			System.out.print(s2+" ");
		}
		System.out.println();
		String s3 = s1.replace('a', 'T');
		System.out.println(s3);
		s3=s1.replace("Java", "SQL");
		System.out.println(s3);
		System.out.println();
		
		String t1="";
		System.out.println(t1.length());
		System.out.println(t1.isBlank());
		System.out.println(t1.isEmpty());
		System.out.println();
		
		String t2 =" ";
		System.out.println(t2.length());
		System.out.println(t2.isBlank());
		System.out.println(t2.isEmpty());
		
		
	}

}
