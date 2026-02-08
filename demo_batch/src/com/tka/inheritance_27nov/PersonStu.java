package com.tka.inheritance_27nov;

import java.util.Scanner;

public class PersonStu extends Person {
 private String course;

 public String getCourse() {
	return course;
 }

 public void setCourse(String course) {
	this.course = course;
 }
 
 public void acceptStu() {
	 acceptPerson();
	 Scanner sc = new Scanner(System.in);
	 System.out.print("Enter Course:- ");
	 setCourse(sc.next());
 }
 
 public void showStu() {
	 showPerson();
	 System.out.println("Course:- "+getCourse());
 }
}
