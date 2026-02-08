package com.tka.stram_api_1;

import java.util.ArrayList;

public class printListStream {

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
		printListStream p2 = new printListStream();
		p2.print(list);
		
	}
	
	public void print(ArrayList<Integer> list) {
		System.out.println("Stream API List");
		list.stream().forEach(t->System.out.print(t+" "));
	}

}
