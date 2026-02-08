package com.tka.colection_4Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class C {

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
		

		
//		for getting value then put kry in map.get() function
		Object o = map.get(null);
		System.out.println(o);
		System.out.println(map);
		
		System.out.println("--------------");
		Set key_set=map.keySet();
		Iterator key_itr=key_set.iterator();
		while (key_itr.hasNext()) {
			Object o1= key_itr.next();
			System.out.print(o1+" ");
		}
		System.out.println();
		System.out.println("-------------");
		Collection collect_values=map.values();
		Iterator val_itr=collect_values.iterator();
		while(val_itr.hasNext()) {
			Object o2= val_itr.next();
			System.out.print(o2+" ");
		}
		System.out.println();
	}
}
