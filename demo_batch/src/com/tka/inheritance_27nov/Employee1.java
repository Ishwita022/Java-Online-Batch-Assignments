package com.tka.inheritance_27nov;

import java.util.Scanner;

public class Employee1 extends Person1{
String post, qualification;
double salary;

public Employee1() {
	
}
public Employee1(String p, String q, double s) {
	setPost(p);
	setSalary(s);
	setQualification(q);
}
public String getPost() {
	return post;
}
public void setPost(String post) {
	this.post = post;
}
public String getQualification() {
	return qualification;
}
public void setQualification(String qualification) {
	this.qualification = qualification;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}

public void accept1Emp() {
	accept1Person();
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter post:- ");
	setPost(sc.next());
	System.out.print("Enter Salary:- ");
	setSalary(sc.nextDouble());
	System.out.print("Enter Qualification:- ");
	setQualification(sc.next());
}

public void show1Emp() {
	show1Person();
	System.out.println("----Employee  Information-----");
	System.out.println("Post:- "+getPost());
	System.out.println("Salary:- "+getSalary());
	System.out.println("Qualification:- "+getQualification());
}


}
