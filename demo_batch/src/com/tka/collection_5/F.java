package com.tka.collection_5;

public class F {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1 ="100";
//convert String into primitive value
int y = Integer.parseInt(s1);
System.out.println(y);

byte y1= Byte.parseByte(s1);
System.out.println(y1);

Boolean b1 = new Boolean("True");
String s2=b1.toString();

Integer i1= new Integer(1000);
String s3=i1.toString();

long h=3000;
String s4=Long.toString(h);
System.out.println(s4);

s3=Long.toBinaryString(h);
System.out.println(s3);

s3=Long.toHexString(h);
System.out.println(s3);

s3=Long.toOctalString(h);
System.out.println(s3);




	}
}
