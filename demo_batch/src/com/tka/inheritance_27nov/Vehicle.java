package com.tka.inheritance_27nov;

import java.util.Scanner;

public class Vehicle {
String name, color, company_name, fuel_type;
double price;

public Vehicle() {
	
}
public Vehicle(String n, String c, String com, String f,double p) {
	setName(n);
	setColor(c);
	setCompany_name(com);
	setFuel_type(f);
	setPrice(p);
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public String getCompany_name() {
	return company_name;
}
public void setCompany_name(String company_name) {
	this.company_name = company_name;
}
public String getFuel_type() {
	return fuel_type;
}
public void setFuel_type(String fuel_type) {
	this.fuel_type = fuel_type;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}

public void acceptVehicle() {
	Scanner sc = new Scanner(System.in);
	System.out.println("----------Enter Properties of Vehicle - car--------");
	System.out.print("Enter name:-");
	setName(sc.next());
	System.out.print("Enter color:-");
	setColor(sc.next());
	System.out.print("Enter price:-");
	setPrice(sc.nextDouble());
	System.out.print("Enter company name:-");
	setCompany_name(sc.next());
	System.out.print("Enter fuel type:-");
	setFuel_type(sc.next());
}
public void showVehicle() {
	System.out.println("Name:- "+getName());
	System.out.println("Color:- "+getColor());
	System.out.println("Price:- "+getPrice());
	System.out.println("Company name:- "+getCompany_name());
	System.out.println("Fuel type:- "+getFuel_type());
}



}
