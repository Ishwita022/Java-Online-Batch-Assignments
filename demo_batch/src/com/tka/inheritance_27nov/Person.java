package com.tka.inheritance_27nov;

import java.util.Scanner;

public class Person {
 private String name;
 private int age;
 public String getName() {
	return name;
 }
 public void setName(String name) {
	this.name = name;
 }
 public int getAge() {
	return age;
 }
 public void setAge(int age) {
	this.age = age;
 }
  
 public void acceptPerson() {
	 Scanner sc = new Scanner(System.in);
	 System.out.print("Enter Name:- ");
	 setName(sc.next());
	 System.out.print("Enter Age:- ");
	 setAge(sc.nextInt());
 }
 
 public void showPerson() {
	 System.out.println("Name:- "+getName() );
	 System.out.println("Age:- "+getAge());
 }
}
