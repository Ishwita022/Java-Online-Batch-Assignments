package com.tka.constructor_19nov;

public class RectangleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("----original rectangle----");
Rectangle rs = new Rectangle(24, 66);
rs.rect1();

System.out.println();
System.out.println("----Copy rectangle----");
Rectangle rsm = new Rectangle(rs);
rsm.rect1();
	}

}
