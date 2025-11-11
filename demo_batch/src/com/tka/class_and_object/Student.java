package com.tka.class_and_object;

import java.util.Scanner;

public class Student {
	Scanner sc = new Scanner(System.in);
	int eng, math, phy, chem, bio, roll;
	double percentage, total;
	String name, id;

public void properties() {
	System.out.print("Enter name: ");
	 name = sc.next();
	System.out.print("Enter Id: ");
	 id =sc.next();
	System.out.print("Enter Roll no. :");
	 roll = sc.nextInt();
}

	public void marks() {

		System.out.print("Enter English marks: ");
		eng = sc.nextInt();
		System.out.print("Enter Mathematics marks: ");
		math = sc.nextInt();
		System.out.print("Enter Physics marks: ");
		phy = sc.nextInt();
		System.out.print("Enter Chemistry marks: ");
		chem = sc.nextInt();
		System.out.print("Enter Biology marks: ");
		bio = sc.nextInt();
		total = eng + math + phy + chem + bio;
	}

	public void percentage() {
		percentage = (total / 500) * 100;
	}

	public void grade() {
		if (percentage >= 85) {
			System.out.print("Grade A");
		} else if (percentage >= 75 && percentage < 85) {
			System.out.print("Grade B");
		} else if (percentage >= 65 && percentage < 75) {
			System.out.print("Grade C");
		} else if (percentage >= 55 && percentage < 65) {
			System.out.print("Grade D");
		} else {
			System.out.print("Fail");
		}
		System.out.println();
	}

	public void show() {
		System.out.println("----------Properties of student-------");
		System.out.println("Name is: " + name);
		System.out.println("Id is : "+id);
		System.out.println("Roll no. is: "+roll);
		System.out.println("Total marks is: "+total);
		System.out.println("Percentage is: "+percentage);
		
	}
}