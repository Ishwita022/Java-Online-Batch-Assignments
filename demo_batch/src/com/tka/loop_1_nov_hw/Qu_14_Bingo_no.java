package com.tka.loop_1_nov_hw;

import java.util.Scanner;

public class Qu_14_Bingo_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter number: ");
  int y= sc.nextInt();
  int temp=y, n=0, count=0;
  
  if(y%7==0) {
	  while(temp>0) {
		  n=temp%10;
		  if(n==7) {
			  count=1;
			  break;  
		  }
	temp=temp/10;
	  }
  
  if(count==0) {
	  System.out.println(y+ " It is bingo number");
  }else {
	  System.out.println(y+ " It is not bingo number");
  }
  }else {
	  System.out.println(y+ " It is not bingo number");
  }
	}
}
