package com.tka.collection_5;

import java.util.ArrayList;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //Auto boxing
		//converting primitive value into Wrapper class object is called boxing
		// this boxing is called auto boxing
		ArrayList list = new ArrayList();
		list.add(100);
		int y =500;
		list.add(y);
		System.out.println(list);
		Object o=list.get(0);
		System.out.println(o);
		
//		manual boxing or boxing
		
		int z =300;
//		list.add(y);
//		Wrapper class object
		Integer i1 = new Integer(z);
		list.add(i1);
		System.out.println(list);
		
		

	}

}
