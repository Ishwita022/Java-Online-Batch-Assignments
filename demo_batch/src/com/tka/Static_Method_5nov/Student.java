package com.tka.Static_Method_5nov;

import java.util.Scanner;

public class Student {
 public void property() {
	 Scanner sc = new Scanner(System.in);
	 String id, course;
	 int age;
	 int math, phy, chem, bio, eng;
	 System.out.print("Enter Student Id: ");
	 id = sc.next();
	 System.out.print("Enter Student course: ");
	 course = sc.next();
	 System.out.print("Enter Student age: ");
	 age = sc.nextInt();
	   System.out.println();
	 System.out.print("Enter maths marks: ");
	 math= sc.nextInt();
	 System.out.print("Enter physics marks: ");
	 phy= sc.nextInt();
	 System.out.print("Enter Chemistry marks: ");
	 chem= sc.nextInt();
	 System.out.print("Enter Biology marks: ");
	 bio= sc.nextInt();
	 System.out.print("Enter English marks: ");
	 eng= sc.nextInt();
	 
	
System.out.println(); 
System.out.println("Student ID: "+id);
System.out.println("Student course: "+course);
System.out.println("Student age: "+age);
System.out.println();
System.out.println("student marks is: ");
System.out.println("Maths: "+math);
System.out.println("Physics: "+phy);
System.out.println("Chemistry: "+chem);
System.out.println("Biology: "+bio);
System.out.println("English: "+eng);

 }
}
