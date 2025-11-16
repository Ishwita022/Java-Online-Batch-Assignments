package com.tka.encapsulation;

import java.util.Scanner;

public class CellPhone {
	String brand;
	String model;
	int battery;
	double price;

	// setter
	public void setbrand(String br) {
		brand = br;
	}

	public void setmodel(String m) {
		model = m;
	}

	public void setbattery(int ba) {
		battery = ba;
	}

	public void setprice(double p) {
		price = p;
	}

	// getter
	public String getbrand() {
		return brand;
	}

	public String getmodel() {
		return model;
	}

	public int getbattery() {
		return battery;
	}

	public Double getprice() {
		return price;
	}
	
	public void acceptPhone() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Brand: ");
		setbrand(sc.next());
		System.out.print("Enter Model:  ");
		setmodel(sc.next());
		System.out.print("Enter Battery: ");
		setbattery(sc.nextInt());
		System.out.print("Enter Price: ");
		setprice(sc.nextDouble());
		System.out.println();
	}
	
	public void showPhone() {
		System.out.println("----Properties of CellPhone----");
		System.out.println("Brand: "+getbrand());
		System.out.println("Model: "+getmodel());
		System.out.println("Battery: "+getbattery());
		System.out.println("Price: "+getprice());
	}
}
