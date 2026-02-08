package com.tka.this_and_super;

import java.util.Scanner;

public class Person {

	
		// TODO Auto-generated method stub
private String name;
private String city;
private int age;

public Person() {
	
}
public Person(String n, String c, int a) {
	setName(n);
	setCity(c);
	setAge(a);
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

public void accept() {
	Scanner sc = new Scanner(System.in);
	System.out.println("====Enter Personal Info ====");
	System.out.print("Enter Name: ");
	setName(sc.next());
	System.out.print("Enter City: ");
	setCity(sc.next());
	System.out.print("Enter Age: ");
	setAge(sc.nextInt());
}

public void show() {
	System.out.println("==== Persanal Info ====");
	System.out.println("Name:- "+getName());
	System.out.println("City:- "+getCity());
	System.out.println("Age:- "+getAge());
}
	

}
