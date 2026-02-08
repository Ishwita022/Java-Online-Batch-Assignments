package com.tka.collection_2;

import java.util.Scanner;

public class Laptop extends Electronics{
	private int ram, storage;
private String  processor;


public Laptop() {
	
}

public Laptop( int r, int s, String p) {
	setRam(r);
	setStorage(s);
	setProcessor(p);
}
@Override
public void accept() {
	super.accept();
	System.out.println("======Enter Laptop Details: =====");
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Ram:- ");
	setRam(sc.nextInt());
	System.out.print("Enter Storage:- ");
	setStorage(sc.nextInt());
	System.out.print("Enter Processor:- ");
	setProcessor(sc.next());
}
@Override
public void show() {
	super.show();
	System.out.println("***********Laptop Details**********");
	System.out.println("Brand:- "+getRam());
	System.out.println("Model:- "+getStorage());
	System.out.println("Processor:- "+getProcessor());
}

public int getRam() {
	return ram;
}

public void setRam(int ram) {
	this.ram = ram;
}

public int getStorage() {
	return storage;
}

public void setStorage(int storage) {
	this.storage = storage;
}

public String getProcessor() {
	return processor;
}

public void setProcessor(String processor) {
	this.processor = processor;
}

public String toString() {
	return toString()+", Ram= "+ram+" ,Storage= "+storage+" ,Processor= "+processor;
}
}