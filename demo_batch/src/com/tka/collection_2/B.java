package com.tka.collection_2;

import java.util.ArrayList;
import java.util.List;

public class B {

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
		list.set(7, "cherry");
		System.out.println(list);
		Object o[]=list.toArray();
		List list2= list.subList(3, 6);
		System.out.println(list2);
		
	}

}
