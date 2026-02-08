package com.tka.collection_2;

import java.util.Scanner;

public class GamingLaptop extends Laptop{
	private String graphicsCard;     
    private int graphicsMemory;  
    private int batteryCapacity;
    
    
    public GamingLaptop() {
    	
    }
    
    public GamingLaptop(String gc, int gm, int bc) {
    	setGraphicsCard(gc);
    	setGraphicsMemory(gm);
    	setBatteryCapacity(bc);
    }
    @Override
    public void accept() {
    	super.accept();
    	System.out.println("======Enter Gaming Laptop Details: =====");
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter Details of gaming Laptop: ");
    	System.out.print("Graphics Card: ");
    	setGraphicsCard(sc.next());
    	System.out.print("Graphics Memory: ");
    	setGraphicsMemory(sc.nextInt());
    	System.out.print("Battery Capacity: ");
    	setBatteryCapacity(sc.nextInt());
    }
    @Override
    public void show() {
    	super.show();
    	System.out.println("***********Gaming Laptop Details**********");
    	System.out.println("Graphics Card is:"+getGraphicsCard());
    	System.out.println("Graphics Memory is: "+getGraphicsMemory());
    	System.out.println("Battery Capacity is: "+getBatteryCapacity());
    }
	public String getGraphicsCard() {
		return graphicsCard;
	}
	public void setGraphicsCard(String graphicsCard) {
		this.graphicsCard = graphicsCard;
	}
	public int getGraphicsMemory() {
		return graphicsMemory;
	}
	public void setGraphicsMemory(int graphicsMemory) {
		this.graphicsMemory = graphicsMemory;
	}
	public int getBatteryCapacity() {
		return batteryCapacity;
	}
	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
    
    public String toString() {
    	return toString()+",Graphics Card="+graphicsCard+" , Graphics Memory= "+graphicsMemory+" ,Baterry Capacity= "+batteryCapacity;
    }
    
}
