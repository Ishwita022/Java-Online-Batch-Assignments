package com.tka.abstraction;

public class ProgrammerEmployee extends EmployeeAbstract {
	
	double Salary=60000, overtime=12000;
	@Override
	public double calculateSalary() {
		return Salary+overtime;
	}
	@Override
	public void displayInfo() {
		System.out.println("The Programmer Salary is: "+calculateSalary());
	}
}
