package com.tka.colection_4Map;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class I {

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
		 
//			for getting value then put kry in map.get() function
			Object o = map.get(33);
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


