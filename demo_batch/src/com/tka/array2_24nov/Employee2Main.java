package com.tka.array2_24nov;

import java.util.Scanner;

import com.tka.demo2.switch_case;

public class Employee2Main {

	private static Employee2 emp2[] = new Employee2[10];
	static int count = 0;

	public static void addEmployee() {
		if (count >= emp2.length) {
			System.out.println("Size is full. Do not add any information.");
		}

		Employee2 e = new Employee2();
		e.accept();
		emp2[count] = e;
		count++;
		System.out.println("Added employee details successfully.");
	}

	public static void showEmployee() {
		if (count == 0) {
			System.out.println("Employee data not found.");
		}

		for (int i = 0; i < count; i++) {
			emp2[i].show();
		}
	}

	public static void searchEmp() {
		Scanner sc = new Scanner(System.in);
		System.out.println("search id which is available in list: ");
		int id = sc.nextInt();
		for (int j = 0; j < count; j++) {
			if (emp2[j].getId() == id) {
				System.out.println("Employee Id is found");
				emp2[j].show();
			}
		}

	}

	public static void updateEmp() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee which your are update: ");
		int id = sc.nextInt();
		for (int j = 0; j < count; j++) {
			if (emp2[j].getId() == id) {
				emp2[j].accept();
			}
		}
		System.out.println("Employee update successfully");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int ch;

		while (true) {
			System.out.println("------Employee Menu-------");
			System.out.println("1. Add Employee ");
			System.out.println("2. Show All Employee ");
			System.out.println("3. Search Employee By Id ");
			System.out.println("4. Update Employee");
			System.out.println("5. Exit ");
			System.out.println("Enter your choice:-");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				addEmployee();
				break;

			case 2:
				showEmployee();
				break;

			case 3:
				searchEmp();
				break;

			case 4:
				updateEmp();
				break;

			case 5:
				System.out.println("Exit");
				System.exit(0);
				break;

			default:
				System.out.println("Invalid choice!");
				break;
			}
		}

	}

}
