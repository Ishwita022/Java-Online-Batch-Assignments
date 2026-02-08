package com.tka.interface_10dec;

public class RectangleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
RectangleClass r1 = new RectangleClass(9, 6);
r1.display();

System.out.println("After Resize");
r1.resizeWidth(13);
r1.resizeHeight(88);
r1.display();
	}

}
