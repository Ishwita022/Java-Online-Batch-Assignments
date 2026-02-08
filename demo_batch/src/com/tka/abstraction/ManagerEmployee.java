package com.tka.abstraction;

public class ManagerEmployee extends EmployeeAbstract{
	double baseSalary=50000, bonus=1000;

	@Override
public double calculateSalary( ) {
		double cal =baseSalary+bonus;
		return cal;
		
	}
@Override
public void displayInfo() {
	System.out.println("The Manager Salary is: "+calculateSalary());
}}

