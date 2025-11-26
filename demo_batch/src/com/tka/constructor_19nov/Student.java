package com.tka.constructor_19nov;


public class Student {
String stuID ;
String stuName ;
char grade;


 Student(String id, String n, char g) {
	stuID = id;
	stuName = n;
	grade = g;
}

public void stu1() {
	System.out.println("Student ID is: "+stuID);
	System.out.println("Student name is: "+stuName);
	System.out.println("Student grade is: "+grade);
}
}
