package com.tka.stram_api_1;

import java.util.ArrayList;
import java.util.Iterator;

public class printList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList< Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(50);
		list.add(70);
		list.add(0);
		list.add(-1);
		list.add(15);
		list.add(45);
		printList p1 = new printList();
		p1.printListItr(list);
	}
	
	public void printListItr(ArrayList<Integer> list) {
		System.out.println("Iterator list");
		Iterator< Integer > itr =list.iterator();
		while (itr.hasNext()) {
			int y=  itr.next();
			System.out.print(y+" ");
			
		}
	}

}
