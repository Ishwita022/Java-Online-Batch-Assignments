package com.tka.colection_4Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class K {

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
//		 K.printMap1(null);

	}
	public static void printMap2(TreeMap map) {
		Set entry_set=map.entrySet();
		Iterator entry_itr=entry_set.iterator();
		while(entry_itr.hasNext()) {
			Object o = entry_itr.next();
			Map.Entry entry = (Map.Entry)(o);
			System.out.println("Key -> "+entry.getKey()+" , Value -> "+entry.getValue());
		}
	}
	
	public static void printMap1(TreeMap map) {
		Set key_set=map.keySet();
		Iterator key_itr =key_set.iterator();
		while (key_itr.hasNext()) {
			Object key = key_itr.next();
			Object value=map.get(key);
			System.out.println("Key-: "+key+" , Value-: "+value);
		}
}
}
