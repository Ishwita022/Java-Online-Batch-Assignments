package com.tka.stream_api_2;

import java.util.ArrayList;
import java.util.Iterator;

public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list =new ArrayList<Integer>();
		list.add(100);
		list.add(67);
		list.add(14);
		list.add(-5);
		list.add(0);
		list.add(89);
		list.add(23);
		printEven(list);
		
	}
	
	public static void printEven(ArrayList< Integer> list) {
		Iterator<Integer> itr=list.iterator();
		while(itr.hasNext()) {
			int y = itr.next();
			if(y%2==0) {
				System.out.print(y+" ");
			}
		}
	}

}
