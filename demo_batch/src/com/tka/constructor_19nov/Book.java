package com.tka.constructor_19nov;

public class Book {
private String title ;
private String author;
private double price;

public Book () {
	title = "The Secret Book";
	author = "Rhonda Byrne";
}

public Book (String t1, String a1) {
	title = t1;
	author = a1;
}
public Book (String t, String a, double p) {
	title = t;
	author = a;
	price = p;
}

public void Bookshow() {
	System.out.println("The title of book is: "+title);
	System.out.println("The title of author is: "+author);
	System.out.println("The title of price is: "+price);
}
}
