package com.tka.collection_2;

import java.util.ArrayList;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add(100);
		list.add("Green");
		list.add("Mango");
		list.add(null);
		list.add("Blue");
		list.add(100);
		list.add(33.11);
		list.add("Red");
		list.add('t');
		list.add(false);
		System.out.println(list);
		ArrayList list2 = new ArrayList();
		list2.add("Green");
		list2.add("Red");
		list2.add("Blue");
		boolean b;
		b = list.containsAll(list2);
		System.out.println(b);
	}

}
