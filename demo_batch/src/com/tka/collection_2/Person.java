package com.tka.collection_2;

import java.util.Scanner;

public class Person {
private String name, city;
private int age;

public Person() {
	
}
public Person(String n, String c, int a) {
	setName(n);
	setCity(c);
	setAge(a);
}

public void accept() {
	System.out.println("=======Enter Personal Details=====");
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter name:-");
	setName(sc.nextLine());
	System.out.print("Enter City:-");
	setCity(sc.nextLine());
	System.out.print("Enter Age:-");
	setAge(sc.nextInt());
}

public void show() {
	System.out.println("*************Personl Details:***************");
	System.out.println("Name of Employee:- "+getName());
	System.out.println("City :- "+getCity());
	System.out.println("Age :- "+getAge());
}
@Override
public String toString() {
	return name+","+city+","+age;
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



}
