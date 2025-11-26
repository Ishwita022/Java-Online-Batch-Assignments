package com.tka.array2_24nov;

import java.util.Scanner;

public class Student {

	private String name, city;
  	private int age;
  	private static Student student[] = new Student[5];
  	public Student() {
  		
  	}
	
	public Student( String n, String c , int a) {
		setName(n);
		setCity(c);
		setAge(a);
	}
	
	public static void acceptStudent() {
		for (int k = 0; k < student.length; k++) {
			student[k]= new Student();
			student[k].acceptStu();
		}
	}
	
	public static void sortStu() {
		for (int k = 0; k < student.length; k++) {
			for (int j = k+1; j < student.length; j++) {
				if(student[k].age>student[j].age) {
					Student stu = student[k];
					student[k]=student[j];
					student[j]=stu;
				}
			}
			
		}
	}
	
	public static void showStudent() {
		System.out.println();
		System.out.println("----------Student info---------");
		for (int k = 0; k < student.length; k++) {
			student[k].showStu();
		}
	}
	
	public void acceptStu() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name: ");
		setName(sc.next());
		System.out.print("Enter city: ");
		setCity(sc.next());
		System.out.print("Enter age: ");
		setAge(sc.nextInt());
	}
	public void showStu() {
		System.out.println();
		System.out.println("The name of Student is: "+getName());
		System.out.println("The city of Student is: "+getCity());
		System.out.println("The age of Student is: "+getAge());
		System.out.println();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}	
}
