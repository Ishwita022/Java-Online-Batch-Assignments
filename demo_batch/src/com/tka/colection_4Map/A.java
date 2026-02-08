package com.tka.colection_4Map;

import java.util.HashMap;

public class A {
public static void main(String[] args) {
	HashMap map= new HashMap();
	System.out.println(map.isEmpty());
	System.out.println(map.size());
	System.out.println();
	map.put(100, "Mango");
	map.put("Apple", false);
	map.put(null, 3000);
	map.put('T', 33.11);
	map.put(44.11, "Mango");
	map.put(210, null);
	System.out.println(map);
	System.out.println("--------------");
	map.put(100, "Cherry");
	System.out.println();
	System.out.println(map);
	System.out.println();
	System.out.println(map.isEmpty());
	System.out.println(map.size());
}
}
