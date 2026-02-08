package com.tka.collection_5;

public class D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int y=100;
Integer i1= Integer.valueOf(y);

String a1="333";
Integer i2= Integer.valueOf(a1);
System.out.println(i2);

String s2="33.11";
//Integer i3 = Integer.valueOf(s2); //java.ang.NumberFormatException;
Double d1 = Double.valueOf(s2);
System.out.println(d1);

String s3="33_11";
//Float f1 = Float.valueOf(s3); //java.lang.NumberFormatException

boolean b1=true;
Boolean a2=Boolean.valueOf(b1);
System.out.println(a2);

String s4="false";
Boolean a3=Boolean.valueOf(s4);
System.out.println(a3);


	}

}
