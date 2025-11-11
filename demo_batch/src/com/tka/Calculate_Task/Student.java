package com.tka.Calculate_Task;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
      String name, city, course_name;
      double total, hindi, eng, maths, science, social_science;
      System.out.println("Enter name: ");
       name = sc.next();
       System.out.println("Enter city: ");
       city = sc.next();
       System.out.println("Enter course name: ");
       course_name = sc.next();
       System.out.println("Enter hindi marks : ");
       hindi = sc.nextDouble();
       System.out.println("Enter eng marks : ");
       eng  = sc.nextDouble();
       System.out.println("Enter maths marks : ");
       maths = sc.nextDouble();
       System.out.println("Enter Sceince marks : ");
       science = sc.nextDouble();
       System.out.println("Enter social science marks : ");
       social_science = sc.nextDouble();
       
       total = hindi+eng+maths+science+social_science;
       System.out.println("Student total marks out of 500 is: "+total);
       double p = (total/500)*100;
       System.out.println("Student percentage is: "+p);
       
       if (p>=75.00) {
   		System.out.println("Grade A1");
   	} else if(p>=65.00 && p<75.00) {
          System.out.println("Grade A2");
   	} else if(p>=55.00 && p<65.00){
   		System.out.println(" Grade B1");	
   	} else if(p>=45.00 && p<55.00) {
   		System.out.println("Grade B2");
   	}else {
   		System.out.println("Grade C");
   	}
      
	}

}
