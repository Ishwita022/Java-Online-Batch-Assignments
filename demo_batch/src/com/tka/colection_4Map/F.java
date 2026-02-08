package com.tka.colection_4Map;

import java.util.TreeMap;

public class F {

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
// heterogeneous value not accepted
// map.put("Cherry", 3333); //java.lang.ClassCastException
// null as key value not accepted
// map.put(null,"Apple"); //java.lang.NullPointerException
 System.out.println(map);

	}

}
