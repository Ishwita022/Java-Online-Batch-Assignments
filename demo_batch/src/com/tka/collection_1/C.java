package com.tka.collection_1;

import java.util.ArrayList;

public class C {

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
		  
		  System.out.println(list);
		  Object o = list.remove(3);
		  System.out.println(o);
		  System.out.println(list);
		  System.out.println();
		  boolean b1 = list.remove("Mango");
		  System.out.println(b1);
		  System.out.println(list);
	}

}
