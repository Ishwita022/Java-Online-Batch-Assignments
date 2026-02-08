package com.tka.stram_api_1;

import java.util.ArrayList;
import java.util.Iterator;

public class PrintSumList {

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
PrintSumList p1= new PrintSumList();
p1.ptintSum(list);

	}
	public void ptintSum(ArrayList< Integer> list) {
		int sum=0;
		Iterator< Integer> itr= list.iterator();
		while(itr.hasNext()) {
			int y = itr.next();
			sum= sum+y;
		}
		System.out.println("Total->"+sum);
	}

}
