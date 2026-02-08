package com.tka.inheritance_27nov;

import java.util.Scanner;

public class Student1 extends Person1{
String id, course_name, college_name;
double marks;

public Student1() {
	
}

public Student1(String i, String crn, String cln, double m) {
	setId(i);
	setCourse_name(crn);
	setCollege_name(cln);
	setMarks(m);
}

public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getCourse_name() {
	return course_name;
}
public void setCourse_name(String course_name) {
	this.course_name = course_name;
}
public String getCollege_name() {
	return college_name;
}
public void setCollege_name(String college_name) {
	this.college_name = college_name;
}
public double getMarks() {
	return marks;
}
public void setMarks(double marks) {
	this.marks = marks;
}

public void accept1Stu() {
	System.out.println("-------------Enter Student Information----------");
	accept1Person();
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter ID:- ");
	setId(sc.next());
	System.out.print("Enter Course name:- ");
	setCourse_name(sc.next());
	System.out.print("Enter College name:- ");
	setCollege_name(sc.next());
	System.out.print("Enter Marks:- ");
	setMarks(sc.nextDouble());
}

public void show1Stu(){
	show1Person();
	System.out.println("-----Student Info-----");
	System.out.println("Student ID:- "+getId());
	System.out.println("Course name:- "+getCourse_name());
	System.out.println("College name:- "+getCollege_name());
	System.out.println("Marks:- "+getMarks());
}
}
