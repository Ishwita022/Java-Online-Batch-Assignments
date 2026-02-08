package com.tka.collection_3;

import java.util.Iterator;
import java.util.TreeSet;

public class F {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet set = new TreeSet();
set.add(1000);
set.add(44);
set.add(1);
set.add(19);
set.add(-110);
//set.add("Mango");//java.lang.ClassCast
set.add(670);
//set.add(null); java.lang.NullPointer
set.add(44);
set.add(970);
//System.out.println(set);
F.print1(set);
F.print2(set);

	}
public static void print1(TreeSet set) {
	System.out.println("--------for each loop---------");
	for (Object o : set) {
		System.out.println(o+" ");
	}
}

public static void print2(TreeSet set) {
	System.out.println("----------Iterator-----");
	Iterator itr=set.iterator();
	while (itr.hasNext()) {
		Object o =itr.next();
		System.out.println(o+" ");
	}
}
}
