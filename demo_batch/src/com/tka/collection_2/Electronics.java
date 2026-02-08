package com.tka.collection_2;

import java.util.Scanner;

public class Electronics {
	private String brand;
    private String model;
    private String serialNumber;
    
    public Electronics() {
    	
    }
    public Electronics(String b, String m, String sn) {
    	setBrand(b);
    	setModel(m);
    	setSerialNumber(sn);
    }
    
    public void accept() {
    	System.out.println("======Enter Electronics Details: =====");
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter Brand:-");
    	setBrand(sc.next());
    	System.out.print("Enter Model:-");
    	setModel(sc.next());
    	System.out.print("Enter Serial Number:-");
    	setSerialNumber(sc.next());
    }
    
    public void show() {
    	System.out.println("***********Electronics Details**********");
    	System.out.println("Brand:- "+getBrand());
    	System.out.println("Model:- "+getModel());
    	System.out.println("Serial Number:- "+getSerialNumber());
    }
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
    
    public String  toString(){
    	return toString() + ", brand=" + brand + ", Model=" + model+", Serial Number= "+serialNumber;
    }

}
