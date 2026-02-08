package com.tka.polymorphism_methodOverriding;

public class MainAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Animal1 a1 = new Bird();
Animal1 a2 = new Cat();
a1.sound();
a2.sound();
	}
}
