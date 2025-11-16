package com.tka.encapsulation;

import java.util.Scanner;

public class Laptop {
	String brand;
    String model;
    int ram;
    int storage;
    //setter method
    public void setBrand(String b ) {
    	brand = b;
    }
    
    
    public void setModel(String m ) {
    	model =m;
    }
    
    
    public void setRam(int r ) {
    	ram =r;
    }
    
    
    public void setStorage(int s ) {
    	storage = s;
    }
    //getter method
    public String getBrand() {
    	return brand;
    }
    
    public String getModel() {
    	return model;
    }
    
    public int getRam() {
    	return ram;
    }
    
    public int getStorage() {
    	return storage;
    }
    
    public void acceptLaptop() {
    	System.out.println();
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter Brand: ");
    	setBrand(sc.next());
    	System.out.print("Enter Model: ");
    	setModel(sc.next());
    	System.out.print("Enter RAM: ");
    	setRam(sc.nextInt());
    	System.out.print("Enter Storage: ");
    	setStorage(sc.nextInt());
    	System.out.println();
    }
    
    public void showLaptop() {
    	System.out.println("----Properties of Mobile----");
    	System.out.println("Brand: "+getBrand());
    	System.out.println("Model: "+getModel());
    	System.out.println("RAM: "+getRam());
    	System.out.println("Storage: "+getStorage());
    }
}

