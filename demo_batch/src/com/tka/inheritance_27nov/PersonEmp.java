package com.tka.inheritance_27nov;

import java.util.Scanner;

public class PersonEmp {
	private String name, city;
	private int age;

 public PersonEmp() {
		 
	 }
	 
	 public PersonEmp(String n, String c, int a) {
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

	public void acceptPerson() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name:- ");
		setName(sc.next());
		System.out.print("Enter age:- ");
		setAge(sc.nextInt());
		System.out.print("Enter city:- ");
		setCity(sc.next());
		System.out.println();
	}
	
	public void showPerson() {
		System.out.println("Name :- "+getName());
		System.out.println("Age:-"+getAge());
		System.out.println("City:-"+getCity());
	}
	
	
}


