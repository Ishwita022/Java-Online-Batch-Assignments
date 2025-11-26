package com.tka.encapsulation;

import java.util.Scanner;

public class Person {
private String name;
private int age;
private String country;

public void setterName(String n) {
	name = n;
}
public void setterAge(int a) {
	age = a;
}
public void setterCountry(String c) {
	country = c;
}

public String getterName() {
	return name;
}

public int getterAge() {
	return age;
}
public String getterCountry() {
	return country;
}

public void acceptPerson() {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Name: ");
	setterName(sc.next());
	System.out.print("Enter age: ");
	setterAge(sc.nextInt());
	System.out.print("Enter country: ");
	setterCountry(sc.next());
	System.out.println();
}

public void showPerson() {
	System.out.println("----Properties of person----");
	System.out.println("Name: "+getterName());
	System.out.println("Age: "+getterAge());
	System.out.println("Country: "+getterCountry());
}

}
