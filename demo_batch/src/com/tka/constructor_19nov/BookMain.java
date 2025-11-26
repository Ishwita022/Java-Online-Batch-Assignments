package com.tka.constructor_19nov;

public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Book b = new Book();
b.Bookshow();

System.out.println();
Book b1 = new Book("XYZ", "man", 100);
b1.Bookshow();

System.out.println();
Book b2 = new Book ("ABC", "girl", 500);
b2.Bookshow();
	}

}
