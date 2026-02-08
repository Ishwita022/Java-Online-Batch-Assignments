package com.tka.polymorphism_methodOverriding;

public class BiCycle extends Vehicle {
	@Override
public void speedUp() {
	System.out.println("BiCycle Class");
	s=s*2;
	System.out.println("Bicycle speed: "+s+"km/h");
}
}
