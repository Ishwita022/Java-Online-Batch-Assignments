package com.tka.inheritance_27nov;

import java.util.Scanner;

public class Person1 {
String name, city;
int age;

public Person1() {
	
}
public Person1(String n, String c, int a) {
	setName(n);
	setAge(a);
	setCity(c);
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

public void accept1Person() {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter name:- ");
	setName(sc.next());
	System.out.print("Enter Age:- ");
	setAge(sc.nextInt());
	System.out.print("Enter City:- ");
	setCity(sc.next());
}

public void show1Person() {
	System.out.println();
	System.out.println("----Personal Info-----");
	System.out.println("Name:- "+getName());
	System.out.println("Age:- "+getAge());
	System.out.println("City:- "+getCity());
}
}
