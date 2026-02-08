package com.tka.collection_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class C {

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
//		System.out.println(list);
		C.print2(list);
		C.print1(list);
		C.print3(list);
		C.print4(list);
	}
	
	public static void print4(ArrayList list) {
		System.out.println("List Iterator");
		ListIterator list_itr=list.listIterator();
		while (list_itr.hasNext()) {
			Object o = list_itr.next();
			System.out.print(o+" ");
		}
		System.out.println();
		while (list_itr.hasPrevious()) {
			Object o = list_itr.previous();
			System.out.print(o+" ");
		}
	}
	
	public static void print3(ArrayList list) {
		System.out.println("---Iterator---");
		Iterator itr=list.iterator();
		while (itr.hasNext()) {
			Object o = itr.next();
			System.out.print(o+" ");
		}
	}
	
	public static void print2(ArrayList list) {
		System.out.println("For each loop");
		for (Object o : list) {
			System.out.print(o+" ");
		}
		System.out.println();
	}
	
	public static void print1(ArrayList list) {
		System.out.println("For loop");
		for (int i = 0; i < list.size(); i++) {
			Object o=list.get(i);
			System.out.print(o+" ");
			
		}
		System.out.println();
	}

}
