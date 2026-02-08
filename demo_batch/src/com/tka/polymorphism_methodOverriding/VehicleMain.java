package com.tka.polymorphism_methodOverriding;

public class VehicleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v1 = new Car();
		Vehicle v2= new BiCycle();
		v1.speedUp();
		v2.speedUp();
	}

}
