package com.tka.Calculate_Task;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        String name, city, post;
        int age;
        double bs;
        System.out.println("Enter Name: ");
        name= sc.next();
        System.out.println("Enter Age: ");
        age = sc.nextInt();
        System.out.println("Enter City: ");
        city= sc.next();
        System.out.println("Enter Post: ");
        post= sc.next();
        System.out.println("Enter Basic Salary: ");
        bs = sc.nextDouble();
        Double da, hra, tra, pt, pf;
        da= (bs*10)/100;
        hra = (bs*15)/100;
        tra = (bs*5)/100;
        pt = (bs*10)/100;
        pf = (bs*12)/100;
        
        double gs;
        gs = bs+da+hra+tra; 
        double ns;
        ns = gs -(pt+pf);
         
        System.out.println("-----Employee Details-----");
        System.out.println("Employee Name is : "+name);
        System.out.println("Employee age is : "+age);
        System.out.println("Employee city is : "+city);
        System.out.println("Employee Post is : "+post);
        System.out.println("Employee Basic Salary is : "+bs);
        System.out.println("Employee Gross Salary is: "+gs);
        System.out.println("Employee Net Salary is: "+ns);
        
	}

}
