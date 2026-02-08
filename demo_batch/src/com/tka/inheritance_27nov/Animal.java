package com.tka.inheritance_27nov;

import java.util.Scanner;

public class Animal {
 String name, color, sound, food_type;

 
 public Animal() {
	 
 }
 public Animal(String n, String c, String s, String f) {
	 setName(n);
	 setColor(c);
	 setSound(s);
	 setFood_type(f);
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

 public String getSound() {
	return sound;
 }

 public void setSound(String sound) {
	this.sound = sound;
 }

 public String getFood_type() {
	return food_type;
 }

 public void setFood_type(String food_type) {
	this.food_type = food_type;
 }
 
 
 public void acceptAnimal() {
	 Scanner sc = new Scanner(System.in);
	 System.out.print("Enter name:- ");
	 setName(sc.next());
	 System.out.print("Enter color:- ");
	 setColor(sc.next());
	 System.out.print("Enter sound:- ");
	 setSound(sc.next());
	 System.out.print("Enter food type:- ");
	 setFood_type(sc.next());
 }
 
 public void showAnimal() {
	 System.out.println("------Animal Properties-----");
	 System.out.println("Name :- "+getName());
	 System.out.println("Color :- "+getColor());
	 System.out.println("Sound :- "+getSound());
	 System.out.println("Food Type :- "+getFood_type());
 }
 
 
 
 
 
 
 
 
}
