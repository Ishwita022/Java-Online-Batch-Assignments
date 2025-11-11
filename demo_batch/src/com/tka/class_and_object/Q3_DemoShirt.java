package com.tka.class_and_object;

public class Q3_DemoShirt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Q3_shirt s1=new Q3_shirt();
Q3_shirt s2=new Q3_shirt();
Q3_shirt s3=new Q3_shirt();
Q3_shirt s4=new Q3_shirt();
Q3_shirt s5=new Q3_shirt();

s1.accept("Allen solly", "gray", "M", 670.00, "cotton");
s2.accept("Raymond","red","S",900.00,"silk");
s3.accept("Blackberry","blue","L",1250.00,"polyster");
s4.accept("Roadster","lavender","XL",1700.00,"cotton");
s5.accept("Arrow","yellow","S",890.00,"polyster");

s1.show();
s2.show();
s3.show();
s4.show();
s5.show();
	}

}