package com.tka.collection_1;

import java.util.ArrayList;

public class E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add("Ishwita");
		  list.add(100);
		  list.add('A');
		  list.add(true);
		  list.add("Mango");
		  list.add(null);
		  list.add(100);
		  list.add(7.58);
		  System.out.println(list);
		  boolean b = false;
		  b=list.contains("Mango");
		  System.out.println(b);
		  System.out.println("----------");
		  int index=0;
		  index=list.indexOf(100);
		  System.out.println(index);
		  index=list.lastIndexOf(100);
		  System.out.println(index);
		  index=list.indexOf(33333);
		  System.out.println(index);
	}

}
