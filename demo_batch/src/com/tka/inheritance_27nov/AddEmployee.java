package com.tka.inheritance_27nov;


	import java.util.Scanner;

	public class AddEmployee {
	private String post, qualification;
	private double salary;

	private static AddEmployee empArray[] = new AddEmployee[10];
	private static int index=0;
	
	
	public AddEmployee() {
		accept1Emp();
		addEmployee(this);
	}
	public AddEmployee(String p, String q, double s) {
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

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter post:- ");
		setPost(sc.next());
		System.out.print("Enter Salary:- ");
		setSalary(sc.nextDouble());
		System.out.print("Enter Qualification:- ");
		setQualification(sc.next());
	}

	public void show1Emp() {
		
		System.out.println("----Employee  Information-----");
		System.out.println("Post:- "+getPost());
		System.out.println("Salary:- "+getSalary());
		System.out.println("Qualification:- "+getQualification());
	}


	private static void addEmployee(AddEmployee e) {
		if(index<empArray.length) {
			empArray[index]=e;
			index++;
		}else {
			System.out.println("Sorry Array is full");
		}
	}
	
	public static void showEmployee() {
		for (int i = 0; i <index; i++) {
			empArray[i].show1Emp();
		}
	  }
	}


