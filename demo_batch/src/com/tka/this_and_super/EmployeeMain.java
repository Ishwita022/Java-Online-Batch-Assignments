package com.tka.this_and_super;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter details of Employee: "+(i+1));
			Employee e = new Employee();
			e.acceptEmp();
			e.addEmployee(e);
		}
		Employee.showEmployee();

	}

}
