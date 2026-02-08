package com.tka.inheritance_27nov;

import java.util.Scanner;

public class PersonEmp_Child extends PersonEmp{
	private String post, qualification;
	private double salary;

	
	 public PersonEmp_Child() {
		 
	 }
	 
	 public PersonEmp_Child(String p, double s, String q) {
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	
	public void acceptPersonEmp() {
		acceptPerson();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter post:- ");
		setPost(sc.next());
		System.out.print("Enter salary:- ");
		setSalary(sc.nextDouble());
		System.out.print("Enter qualification:- ");
		setQualification(sc.next());
		System.out.println();
	}
	
	public void showPersonEmp() {
		showPerson();
		System.out.println("Post:- "+getPost());
		System.out.println("salary:- "+getSalary());
		System.out.println("Qualification:- "+getQualification());
	}
}
