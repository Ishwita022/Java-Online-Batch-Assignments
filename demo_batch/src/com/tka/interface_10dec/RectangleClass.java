package com.tka.interface_10dec;

public class RectangleClass implements Resizable{
	private int width;
	private int height;

public RectangleClass(int width, int height) {
	this.width=width;
	this.height=height;
}

@Override
public void resizeWidth(int width) {
	// TODO Auto-generated method stub
this.width=width;
}

@Override
public void resizeHeight(int height) {
	// TODO Auto-generated method stub
	 this.height=height;
}

public void display() {
	System.out.println("Resize width: "+width);
	System.out.println("Resize Height: "+height);
}
}
