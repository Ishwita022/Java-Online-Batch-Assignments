package com.tka.array2_24nov;

import java.util.Scanner;

public class Employee {
private String name, post;
private int age;
private  double salary;
private static Employee employee[] = new Employee[5];

public Employee() {
	
}

public Employee(String n, String p, int a, double s) {
	setName(n);
	setPost(p);
	setAge(a);
	setSalary(s);
	
}

public static void acceptEmployee() {
	for (int i = 0; i < employee.length; i++) {
		employee[i]= new Employee();
		employee[i].acceptEmp();
	}
}

public static void sortEmp() {
	for (int k = 0; k < employee.length; k++) {
		for (int j = k+1; j < employee.length; j++) {
			if(employee[k].age>employee[j].age) {
				Employee emp = employee[k];
				employee[k]=employee[j];
				employee[j]=emp;
			}
		}
	}
}

public static void sortEmpDesc() {
	for (int k = 0; k < employee.length; k++) {
		for (int j = k+1; j < employee.length; j++) {
			if(employee[k].age<employee[j].age) {
				Employee emp = employee[k];
				employee[k]=employee[j];
				employee[j]=emp;
			}
		}
	}
}

public static void showEmployee() {
	System.out.println("--------Employee Info-----------");
	for (int i = 0; i < employee.length; i++) {
		employee[i].showEmp();
	}
}

public void acceptEmp() {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter name: ");
	setName(sc.next());
	System.out.print("Enter post: ");
	setPost(sc.next());
	System.out.print("Enter age: ");
	setAge(sc.nextInt());
	System.out.print("Enter salary: ");
	setSalary(sc.nextDouble());
}

public void showEmp() {
	System.out.println();
	
	System.out.println("Name:- " +getName());
	System.out.println("Post:- " +getPost());
	System.out.println("Age:- " +getAge());
	System.out.println("Salary:- " +getSalary());
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getPost() {
	return post;
}

public void setPost(String post) {
	this.post = post;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}


}
