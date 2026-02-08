package com.tka.colection_4Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class E {

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
			E.printMap1(map);
			System.out.println("---------------");
			E.printMap2(map);
	}
	
	public static void printMap2(HashMap map) {
		Set entry_set=map.entrySet();
		Iterator entry_itr=entry_set.iterator();
		while(entry_itr.hasNext()) {
			Object o = entry_itr.next();
			Map.Entry entry = (Map.Entry)(o);
			System.out.println("Key -> "+entry.getKey()+" , Value -> "+entry.getValue());
		}
	}
	
	public static void printMap1(HashMap map) {
		Set key_set=map.keySet();
		Iterator key_itr =key_set.iterator();
		while (key_itr.hasNext()) {
			Object key = key_itr.next();
			Object value=map.get(key);
			System.out.println("Key-: "+key+" , Value-: "+value);
		}
	}

}
