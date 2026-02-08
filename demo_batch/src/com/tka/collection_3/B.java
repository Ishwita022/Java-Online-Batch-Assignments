package com.tka.collection_3;

import java.util.HashSet;
import java.util.Set;

public class B {

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
		
		b1=set1.remove(set1);
		
		b1=set1.contains("cherry");
		System.out.println(b1);
		Set set2=new HashSet();
		set2.add("Red");
		set2.add("Green");
		set2.add("Blue");
		System.out.println(set2);
		set1.add(set2);
		System.out.println(set2);
		
	}

}
