package com.tka.class_and_object;

import java.util.Scanner;

public class Employee {
	Scanner sc = new Scanner(System.in);
	String name, position, id;
	int age;
	double salary;
	double da, tra, hra, pf, pt, gs, ns;

	public void properties() {
		System.out.print("Enter name of employee: ");
		name = sc.next();
		System.out.print("Enter id of employee: ");
		id = sc.next();
		System.out.print("Enter position of employee: ");
		position = sc.next();
		System.out.print("Enter age: ");
		age = sc.nextInt();
		System.out.print("Enter Salary: ");
		salary = sc.nextDouble();
	}

	public void da() {
		da = (salary * 10) / 100;
	}

	public void tra() {
		tra = (salary * 5) / 100;
	}

	public void hra() {
		hra = (salary * 15) / 100;
	}

	public void pf() {
		pf = (salary * 12) / 100;
	}

	public void pt() {
		pt = (salary * 10) / 100;
	}

	public void gs() {
		gs = salary + hra + tra + da;
	}

	public void ns() {
		ns = gs - (pf - pt);
	}

	public void show() {
		System.out.println("Employee name is: " + name);
		System.out.println("Employee id is : " + id);
		System.out.println("Employee position: " + position);
		System.out.println("Employee age: " + age);
		System.out.println("Salary: " + salary);
		System.out.println("DA: " + da);
		System.out.println("TRA: " + tra);
		System.out.println("HRA: " + hra);
		System.out.println("PF: " + pf);
		System.out.println("PT: " + pt);
		System.out.println("Gross salary : " + gs);
		System.out.println("Net Salary: " + ns);
	}
}