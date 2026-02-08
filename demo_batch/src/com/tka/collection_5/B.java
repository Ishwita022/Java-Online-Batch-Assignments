package com.tka.collection_5;

import java.util.ArrayList;

public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		unboxing manually
		Integer i2 = new Integer(400);
		System.out.println(i2);
//		primitive value converting  Object to Primitive/integer value 
		int h=i2.intValue();
		System.out.println(h);
		
//		Unboxing Automatically
		ArrayList list = new ArrayList();
		list.add(100);
		int y=500;
		list.add(y);
		System.out.println(list);
		
//		Object o = 
//		Object o = (Integer)(o)
//		
	}

}
