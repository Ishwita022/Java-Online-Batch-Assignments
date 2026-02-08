package com.tka.colection_4Map;

import java.util.HashMap;

public class D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap map= new HashMap();
		map.put(100, "Mango");
		map.put("Apple", false);
		map.put(null, 3000);
		map.put('T', 33.11);
		map.put(44.11, "Mango");
		map.put(210, null);
		System.out.println(map);
		System.out.println("---------------");
		boolean b1 =false;
		b1=map.containsKey(100);
		System.out.println(b1);
		b1=map.containsKey("Cherry");
		System.out.println(b1);
		System.out.println("--------------");
		System.out.println(map.size());
		
//		for clear map
		map.clear();
		System.out.println(map.isEmpty());
		System.out.println(map.size());
		
	}

}
