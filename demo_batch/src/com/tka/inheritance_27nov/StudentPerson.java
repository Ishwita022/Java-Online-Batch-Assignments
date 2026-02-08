package com.tka.inheritance_27nov;

import java.util.Scanner;

public class StudentPerson extends Person_stu_parent {
private String id, course_name, college_name;
private double marks;
public String getId() {
	return id;
}

public StudentPerson() {
	
}

public StudentPerson(String i, String cr, String cn, double m ) {
	setId(i);
	setCourse_name(cr);
	setCollege_name(cn);
	setMarks(m);
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

public void acceptStuPerson() {
	acceptPerson1();
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter id:- ");
	setId(sc.next());
	System.out.print("Enter course name:- ");
	setCourse_name(sc.next());
	System.out.print("Enter college name:- ");
	setCollege_name(sc.next());
	System.out.print("Enter marks:- ");
	setMarks(sc.nextDouble());
}

public void showStuPerson() {
	showPerson1();
	System.out.println("ID:- "+getId());
	System.out.println("Course Name:- "+getCourse_name());
	System.out.println("College name:- "+getCollege_name());
	System.out.println("Marks:- "+getMarks());
}

}
