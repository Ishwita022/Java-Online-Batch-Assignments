package com.tka.polymorphism_4dec;

public class MethodOverloading2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MethodOverloading2 m1 = new MethodOverloading2();
m1.k1();
m1.k1(7);
m1.k1("Shruti");
m1.k1(9, "lina");
m1.a1();
m1.a1(99);
System.out.println(m1.t1(66));
System.out.println(m1.t1(8.9));
m1.show(1, 2);
m1.show(20, "Ishu");
m1.show(8.5, 4.9);
	}

}
