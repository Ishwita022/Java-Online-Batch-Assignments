package com.tka.Calculate_Task;

import java.util.Scanner;

public class country_capital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter name of country: ");
     String s = sc.next();
     
     switch (s) {
	case "India":
		System.out.println("New Delhi");
		break;

	case "China":
		System.out.println("Beijing");
		break;

	case "Japan":
		System.out.println("Tokyo");
		break;

	case "South korea":
		System.out.println("Seoul");
		break;

	case "Nepal":
		System.out.println("Kathmandu");
		break;

	case "Sri lanka":
		System.out.println("Sri jayawardenepura");
		break;

	case "Bangladesh":
		System.out.println("Dhaka");
		break;
		
	case "Pakistan":
		System.out.println("Islamabad");
		break;
		
	case "Thailand":
		System.out.println("Bangkok");
		break;

	case "Indonesia":
		System.out.println("Jakarta");
		break;


	default:
		System.out.println("Invalid country");
		break;
	}
	}

}
