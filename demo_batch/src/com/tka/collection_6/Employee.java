package com.tka.collection_6;

import java.util.ArrayList;
import java.util.Iterator;

public class Employee extends Person{
private String  post, department;
private double salary;

private static ArrayList<Employee> emp_list = new ArrayList<Employee>();

public Employee() {
	super();
}


public Employee(String id, String name, String city, int age, long phone, String post, String department, double salary) {
	super(id, name, city, age, phone);
	this.post = post;
	this.department = department;
	this.salary = salary;
	addEmployee();
}



public void accept( String post, String department, double salary) {

	this.post=post;
	this.department=department;
	this.salary=salary;
	addEmployee();
}

public static void show() {
	
	System.out.println("************Employee Information*************");
	Iterator<Employee> itr=emp_list.iterator();
   while (itr.hasNext()) {
	Employee e =  itr.next();
	System.out.println(e);
   }
}
   
   private void addEmployee() {
	   emp_list.add(this);
   
}
   
   
   
@Override
public String toString() {
	return "Employee [ post=" + post + ", department=" + department + ", salary=" + salary + "]";
}



public String getPost() {
	return post;
}
public void setPost(String post) {
	this.post = post;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}


}
