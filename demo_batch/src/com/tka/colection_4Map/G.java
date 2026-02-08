package com.tka.colection_4Map;

import java.util.TreeMap;

public class G {

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
		 System.out.println(map.isEmpty());
		 System.out.println(map.size());
		 System.out.println("--------------");
		 map.clear();
		 System.out.println(map.isEmpty());
		 System.out.println(map.size());
	}

}
