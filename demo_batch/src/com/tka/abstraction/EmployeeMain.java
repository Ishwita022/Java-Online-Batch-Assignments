package com.tka.abstraction;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 ManagerEmployee em = new ManagerEmployee();
em.calculateSalary();
 em.displayInfo();
 
 ProgrammerEmployee p= new ProgrammerEmployee();
 p.calculateSalary();
 p.displayInfo();
	}

}
