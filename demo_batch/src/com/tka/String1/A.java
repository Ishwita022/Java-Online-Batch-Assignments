package com.tka.String1;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String s1 ="Mango";
 String s2 ="Mango";
// compare reference
 System.out.println(s1==s2); //output true
// compare content
 System.out.println(s1.equals(s2));//output true
 System.out.println();
 String t1 = new String("Blue");
 String t2 = new String("Blue");
// compare reference
 System.out.println(t1==t2);
 
//compare content
 System.out.println(t1.equals(t2));
 
 System.out.println();
 String m1 = "Blue";
 System.out.println(m1==t1); // false because compare reference
 System.out.println(m1.equals(m1)); //true
	}

}
