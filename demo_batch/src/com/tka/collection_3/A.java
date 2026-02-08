package com.tka.collection_3;

import java.util.HashSet;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet set1= new HashSet();
set1.add("Mango");
set1.add(1000);
set1.add(false);
set1.add('t');
set1.add(33.11);
set1.add(1000);
set1.add("Apple");
set1.add(null);
System.out.println(set1);
boolean b1=false;
b1=set1.contains("cherry");
System.out.println(b1);
	}

}
