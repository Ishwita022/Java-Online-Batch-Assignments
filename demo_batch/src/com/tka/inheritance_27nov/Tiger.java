package com.tka.inheritance_27nov;

import java.util.Scanner;

public class Tiger extends Animal{
String tiger_type;

public Tiger() {
	
}
public Tiger(String t) {
	setTiger_type(t);
}

public String getTiger_type() {
	return tiger_type;
}

public void setTiger_type(String tiger_type) {
	this.tiger_type = tiger_type;
}

public void acceptTiger() {
	acceptAnimal();
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Tiger type:- ");
	setTiger_type(sc.next());
}
public void showTiger() {
	System.out.println();
	showAnimal();
	System.out.println("Tiger Type is:- "+getTiger_type());
}
}
