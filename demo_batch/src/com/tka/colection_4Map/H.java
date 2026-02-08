package com.tka.colection_4Map;

import java.util.TreeMap;

public class H {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap map = new TreeMap();
		 map.put(100, "Mango");
		 map.put(33, null);
		 map.put(568, false);
		 map.put(10, 1234567);
		 map.put(-10, 33.11);
		 map.put(0, "Mango");
		 map.put(79, 'T');
		 System.out.println(map);
		 
		 Object o = null;
			o=map.replace(100, "banana");
			System.out.println(o);
			System.out.println(map);
			System.out.println("-------------");
			
			boolean b1=false;
			b1=map.replace(100, "Mango", "Orange");
			System.out.println(b1);
			System.out.println(map);
			System.out.println("------------");
			
//			remove key
			o=map.remove(100);
			System.out.println(o);
			System.out.println(map);
			System.out.println("-----------");
//			remove key using boolean
			
			b1=map.remove(100, "Mango");
			System.out.println(b1);
			System.out.println(map);
	}

}
