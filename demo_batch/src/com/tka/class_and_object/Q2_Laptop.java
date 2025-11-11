package com.tka.class_and_object;

import java.util.Scanner;

public class Q2_Laptop {
  String processor;
  String install_ram;
  String graphic_card;
  String storage;


public void accept() {
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter processor name: ");
	processor=sc.next();
	System.out.print("Enter Install ram: ");
	install_ram=sc.next();
	System.out.print("Enter Graphic card: ");
	graphic_card=sc.next();
	System.out.print("Enter storage: ");
	storage=sc.next();
	System.out.println();
}

public void show() {
	System.out.print("processor name is: "+processor);
	System.out.println();
	System.out.print("Install ram is: "+install_ram);
	System.out.println();
	System.out.print("Graphic card is: "+graphic_card);
	System.out.println();
	System.out.print("Storage is: "+storage);
}
}