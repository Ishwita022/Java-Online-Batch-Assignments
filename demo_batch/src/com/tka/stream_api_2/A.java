package com.tka.stream_api_2;

import java.util.ArrayList;

public class A {

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
A.printList(list);
System.out.println();
printOdd(list);
System.out.println();
countEven(list);
System.out.println();
printSum(list);
System.out.println();
printAvg(list);

	}
	
	public static void printAvg(ArrayList<Integer> list) {
		double avg=0;
		avg=list.stream().mapToInt(t->t).average().getAsDouble();
		System.out.println("Average:-"+avg);
//		print even number Average
		double evenAvg=0;
		evenAvg = list.stream().mapToInt(t->t).filter(t->t%2==0).average().getAsDouble();
		System.out.println("Even Number Average:-> "+evenAvg);
//		print odd number Average
		double oddAvg=0;
		oddAvg = list.stream().mapToInt(t->t).filter(t->t%2!=0).average().getAsDouble();
		System.out.println("Odd Number Average:-> "+oddAvg);
		
	}
	public static void printSum(ArrayList<Integer> list) {
		int sum=0;
		sum=list.stream().mapToInt(t->t).sum();
		System.out.println("sum->"+sum);
//		print even number sum
		int evensum=0;
		evensum=list.stream().mapToInt(t->t).filter(s->s%2==0).sum();
		System.out.println("Even Number sum->"+evensum);
//		print odd number sum
		int oddsum=0;
		oddsum=list.stream().mapToInt(t->t).filter(s->s%2!=0).sum();
		System.out.println("Even Number sum->"+oddsum);
	}
	public static void countEven(ArrayList<Integer> list) {
		long count =0;
//		 count = list.stream().count();
		count=list.stream().filter(t->t%2==0).count();
		System.out.println("Count:-"+count);
	}
	public static void printOdd(ArrayList<Integer> list) {
		list.stream().filter(t->t%2!=0).forEach(s-> System.out.print(s+" "));
	}
	
	public static void printList(ArrayList<Integer> list) {
		list.stream().forEach(s-> System.out.print(s+" "));
	}

}
