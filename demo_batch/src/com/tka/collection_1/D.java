package com.tka.collection_1;

import java.util.ArrayList;

public class D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add("Ishwita");
		  list.add(100);
		  list.add('A');
		  list.add(true);
		  list.add("Mango");
		  list.add(null);
		  list.add(7.58);
//		  System.out.println(list);
		  
		  ArrayList list2 = new ArrayList();
		  list2.add("Red");
		  list2.add("Green");
		  list2.add("Blue");
		  System.out.println(list2);
		  
		  list.addAll(list2);
		  System.out.println(list);
		  
		  boolean o= false;
//		  o=list.removeAll(list2);
//		  System.out.println(list);
		  
		  o=list.retainAll(list2);//print common element from list1 and list2
		  System.out.println(list);
	}

}
