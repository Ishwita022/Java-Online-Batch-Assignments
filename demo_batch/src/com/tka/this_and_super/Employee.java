package com.tka.this_and_super;

import java.util.Iterator;
import java.util.Scanner;

public class Employee extends Person {
private String post, qualification;
private double salary;

static Employee[] err = new Employee[5];
static int count=0;
public Employee() {
	
}
public Employee(String p, String q, double s) {
	setPost(p);
	setQualification(q);
	setSalary(s);
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

public void acceptEmp () {
	accept();
	System.out.println("===Enter Employee Info ===");
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter post: ");
	setPost(sc.next());
	System.out.print("Enter Qualification: ");
	setQualification(sc.next());
	System.out.print("Enter Salary: ");
	setSalary(sc.nextDouble());
}

public void showEmp() {
	show();
	System.out.println("====Employee Info====");
	System.out.println("Post: "+getPost());
	System.out.println("Qualification: "+getQualification());
	System.out.println("Salary: "+getSalary());
}

public static void addEmployee(Employee e) {
	if(count<err.length) {
		err[count]=e;
		count++;
	}else {
		System.out.println("Array is full");
	}
}


public static void showEmployee() {
	System.out.println("======= Employee List ========");
	for (int i = 0; i < count; i++) {
		System.out.println("Employee Info "+i+1);
		err[i].showEmp();
	}
}
}
