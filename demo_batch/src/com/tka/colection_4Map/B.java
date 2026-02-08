package com.tka.colection_4Map;

import java.util.HashMap;

public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap map= new HashMap();
		System.out.println();
		map.put(100, "Mango");
		map.put("Apple", false);
		map.put(null, 3000);
		map.put('T', 33.11);
		map.put(44.11, "Mango");
		map.put(210, null);
		System.out.println(map);
		
		Object o = null;
		o=map.replace(100, "banana");
		System.out.println(o);
		System.out.println(map);
		System.out.println("-------------");
		
		boolean b1=false;
		b1=map.replace(101, "Mango", "Orange");
		System.out.println(b1);
		System.out.println(map);
		System.out.println("------------");
		
//		remove key
		o=map.remove(100);
		System.out.println(o);
		System.out.println(map);
		System.out.println("-----------");
//		remove key using boolean
		
		b1=map.remove(100, "Mango");
		System.out.println(b1);
		System.out.println(map);
		
	}

}
