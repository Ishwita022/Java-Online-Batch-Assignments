package com.tka.collection_1;

import java.util.ArrayList;

public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add("Ishwita");
		  list.add(100);
		  list.add('A');
		  list.add(true);
		  list.add(null);
		  list.add(7.58);
		  System.out.println(list);
		  list.add(4, "Apple");
		  System.out.println(list);
		  ArrayList list2 = new ArrayList();
		  list2.add("Red");
		  list2.add("Green");
		  list2.add("Blue");
		  System.out.println(list2);
		 list.addAll(2, list2);
		 System.out.println(list);
		  
	}

}
