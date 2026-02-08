package com.tka.collection_3;

import java.util.HashSet;
import java.util.Iterator;

public class E {

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
//		System.out.println(set1);
		E.print1(set1);
		E.print2(set1);
		E.checkElement(set1, 1001);
	}
	public static void checkElement(HashSet set, Object o) {
		boolean b1 = set.contains(o);
		System.out.println(b1);
	}
	
	public static void print2(HashSet set) {
		System.out.println("-----Iterator------");
		Iterator itr=set.iterator();
		while(itr.hasNext()) {
			Object o =itr.next();
			System.out.print(o+" ");
		}
		System.out.println();
	}
	public static void print1(HashSet set) {
		System.out.println("------for each loop-------");
		for (Object o : set) {
			System.out.print(o+" ");
		}
		System.out.println();
	}

}
