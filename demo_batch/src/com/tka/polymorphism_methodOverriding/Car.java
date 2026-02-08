package com.tka.polymorphism_methodOverriding;

public class Car extends Vehicle {
	@Override
public void speedUp() {
	
	System.out.println("Car class");
	s=s+5;
	System.out.println("Car speed is: "+s+"km/h");
}
}
