package com.tka.array2_24nov;

import java.util.Scanner;

public class Employee2 {
private String name;
private int id;
private double salary;
private static Employee2 emp2[] = new Employee2[10];

public Employee2() {
	
}

public Employee2(int i, String n, double s) {
	setId(i);
	setName(n);
	setSalary(s);
}




public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}

public void accept() {
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter ID: ");
	setId(sc.nextInt());
	System.out.print("Enter name: ");
	setName(sc.next());
	System.out.print("Enter Salary: ");
	setSalary(sc.nextDouble());
	System.out.println();
}

public void show() {
	System.out.println("ID :- "+getId());
	System.out.println("Name:- "+getName());
	System.out.println("salary:- "+getSalary());
	System.out.println();
}


}
