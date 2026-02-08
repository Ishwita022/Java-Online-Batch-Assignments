package com.tka.inheritance_27nov;

import java.util.Scanner;

public class Car extends Vehicle {
	
		 String model_name;

		 public String getModel_name() {
			return model_name;
		 }

		 public void setModel_name(String model_name) {
			this.model_name = model_name;
		 }
		 
		 public void acceptCar() {
			 acceptVehicle();
			 Scanner sc = new Scanner(System.in);
			 System.out.print("Enter model name:- ");
			 setModel_name(sc.next());
			 
		 }
		 
		 public void showCar() {
			 System.out.println("-----Properties of Car vehicle----");
			 showVehicle();
			 System.out.println("Model name:-"+getModel_name());
		 }
		}


