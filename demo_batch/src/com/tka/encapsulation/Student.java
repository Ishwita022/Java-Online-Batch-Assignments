package com.tka.encapsulation;

import java.util.Scanner;

public class Student {
String name;
int roll;

public void setName(String n) {
	name=n;
}
public void setRoll(int r) {
	roll = r;
}

public String getName() {
	return name;
}

public int getRoll() {
	return roll;
}




public void acceptStudent() {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter name  of student:  ");
	setName(sc.next());
	
	System.out.print("Enter roll no:  ");
	setRoll(sc.nextInt());
	System.out.println();
}
public void showStudent() {
	System.out.println("-----Properties of Stients is-----");
	System.out.println("Name of Student is: "+getName());
	System.out.println("Roll no: "+getRoll());
}
}
