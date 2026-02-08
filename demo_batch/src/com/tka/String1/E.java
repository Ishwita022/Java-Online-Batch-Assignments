package com.tka.String1;

public class E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String t1="Orange";
		System.out.println(t1);
		String t2 = t1.concat(" Color");
		System.out.println(t2);
		
		String t3="Mango";
		String t4 ="MANGO";
		System.out.println(t3==t4);
		System.out.println(t3.equals(t4));
		System.out.println(t3.equalsIgnoreCase(t4));
		
		String s1 = "Java is a Programming Language.";
		System.out.println(s1.contains("gram"));
		System.out.println(s1.contains("Game"));
		System.out.println(s1.startsWith("Ja"));
		System.out.println(s1.startsWith("java"));
		System.out.println(s1.endsWith("age."));

	}

}
