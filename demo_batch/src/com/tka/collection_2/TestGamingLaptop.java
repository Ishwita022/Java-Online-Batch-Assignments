package com.tka.collection_2;

import java.util.ArrayList;

public class TestGamingLaptop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList e = new ArrayList(); 
for (int i = 1; i <=5; i++) {
	System.out.println("Enter Details of items: "+i);
	GamingLaptop g = new GamingLaptop();
	g.accept();
	e.add(g);
}

System.out.println("------------All Electronics Items Details-----------");
for (Object obj : e) {
	GamingLaptop gl = (GamingLaptop)obj;
	gl.show();
	System.out.println("#################################################");
}
	}

}
