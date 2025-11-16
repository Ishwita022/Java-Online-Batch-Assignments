package com.tka.encapsulation;

import java.util.Scanner;

public class Chair {
	String material;
    String color;
    double price;
    
    public void setMat(String m) {
		material =m;
	}
    
    public void setColor(String c) {
    	color =c;
    }
    
    public void setPrice(double p) {
    	price =p;
    }
    
    public String getMat() {
    	return material;
    }
    public String getColor() {
    	return color;
    }
    public double getPrice() {
    	return price;
    }
    
    public void acceptChair() {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter Material: ");
    	setMat(sc.next());
    	System.out.print("Enter Color: ");
    	setColor(sc.next());
    	System.out.print("Enter Price: ");
    	setPrice(sc.nextDouble());
    	System.out.println();
    }
    
    public void showChair() {
    	System.out.println("----Properties of Chair----");
    	System.out.println("Material: "+getMat());
    	System.out.println("Color: "+getColor());
    	System.out.println("Price: "+getPrice());
    }
}
