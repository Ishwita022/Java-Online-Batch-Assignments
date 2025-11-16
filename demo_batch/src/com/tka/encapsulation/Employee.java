package com.tka.encapsulation;

import java.util.Scanner;

public class Employee {
String name ;
String id;
double salary;
String position;

//Setter method
public void setName(String n) {
	name = n;
}
public void setId(String i) {
	id =i;
}
public void setPosition(String p) {
	position = p;
}

public void setSalary(double s) {
	salary =s;
}

public String getName() {
	return name;
}
public String getId() {
	return id;
}
public String getPosition() {
	return position;
}
public double getSalary() {
	return salary;
}




public void acceptEmployee() {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter name of Employee: ");
	 setName(sc.next()); 
	 System.out.print("Enter ID of Employee: ");
	 setId(sc.next());
	 System.out.print("Enter Salary of Employee: ");
      setSalary(sc.nextDouble());
	 System.out.print("Enter position of Employee: ");
	setPosition(sc.next());
	 System.out.println();
}

public void showEmployee() {
	System.out.println("---- Properties of Employee ----");
	System.out.println("Name of Employee: "+getName());
	System.out.println("ID of Employee: "+getId());
	System.out.println("Salary of Employee: "+getSalary());
	System.out.println("Position of Employee: "+getPosition());
}
}
