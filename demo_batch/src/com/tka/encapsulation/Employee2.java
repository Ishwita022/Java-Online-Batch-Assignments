package com.tka.encapsulation;

import java.util.Scanner;

public class Employee2 {
String name;
String position;
String id;
double salary;

double da, tra, hra, pf, pt, gs, ns;
//setter method
public void setname(String n) {
	name=n;
}
public void setposition(String p) {
	position = p;
}

public void setid(String i) {
	id = i;
}

public void setsalary(double s) {
	salary =s;
}

//getter method
public String getname() {
	return name;
}

public String getposition() {
	return position;
}

public String getid() {
	return id;
}

public double getsalary() {
	return salary;
}

public void DA() {
  da = (salary * 0.01);
}

public void TRA() {
	 tra = (salary *0.05);
}

public void HRA() {
 hra = (salary * 0.15);
}
public void PF() {
 pf = (salary *0.12);
}

public void PT() {
 pt = (salary * 0.01);
}

public void GS() {
 gs = salary + da + hra+ tra;
}
public void NS() {
	ns = gs-(pf+pt);
}

public void acceptEmp2() {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Employee name: ");
	setname(sc.next());
	System.out.print("Enter position: ");
	setposition(sc.next());
	System.out.print("Enter ID: ");
	setid(sc.next());
	System.out.print("Enter Salary: ");
	setsalary(sc.nextDouble());
	System.out.println();
	DA();
	TRA();
	HRA();
	PT();
	PF();
	GS();
	NS();
	
}

public void showEmp2() {
	System.out.println("----Employee properties-----");
	System.out.println("Employee name: "+getname());
	System.out.println("Employee position: "+getposition());
	System.out.println("Employee ID: "+getid());
	System.out.println("Employee Salary: "+getsalary());
	System.out.println("DA : "+da);
	System.out.println("TRA : "+tra);
	System.out.println("HRA : "+hra);
	System.out.println("PF : "+pf);
	System.out.println("PT : "+pt);
	System.out.println("Gross Salary: "+gs);
	System.out.println("Net Salary : "+ns);
}
}







