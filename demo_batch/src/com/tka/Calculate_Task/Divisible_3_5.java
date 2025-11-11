package com.tka.Calculate_Task;

import java.util.Scanner;

public class Divisible_3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter any number : ");
     int n = sc.nextInt();
      if(n%3==0 && n%5==0) {
    		  System.out.println("Mango and Apple");
    	  } else if(n%5==0) {
    	    System.out.println("Apple");
    	  }else if(n%3==0) {
    		  System.out.println("Mango");
    	  }else {
    		  System.out.println("Number: "+n);
      }
	}

}
