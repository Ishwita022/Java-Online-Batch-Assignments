package com.tka.collection_2;

import java.util.Scanner;

public class Employee extends Person {
private String id, department, post;
private double salary;

public Employee() {
	
}
public Employee(String i, String d, String p, double s) {
	setId(i);
	setSalary(s);
	setDepartment(d);
	setPost(p);
	
}
@Override
public void accept() {
	super.accept();
	System.out.println("=========Enter Employee Details.===========");
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter ID:- ");
	setId(sc.nextLine());
	System.out.print("Enter Salary:- ");
	setSalary(sc.nextDouble());
	System.out.print("Enter Department:- ");
	setDepartment(sc.next());
	System.out.print("Enter Post:- ");
	setPost(sc.next());
	System.out.println();
}
@Override
public void show() {
	super.show();
	System.out.println("************Employee Details***************");
	System.out.println("Employee ID:- "+getId());
	System.out.println("Salary:- "+getSalary());
	System.out.println("Department:- "+getDepartment());
	System.out.println("Post:- "+getPost());
}
public String toString() {
	return super.toString() +","+id+","+salary+","+department+","+post;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public String getPost() {
	return post;
}
public void setPost(String post) {
	this.post = post;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}


}
