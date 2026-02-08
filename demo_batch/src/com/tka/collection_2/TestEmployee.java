package com.tka.collection_2;

import java.util.ArrayList;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList list = new ArrayList();
for (int i = 1; i <= 5; i++) {
	System.out.println("Enter details of Employee "+i);
	Employee e = new Employee();
	e.accept();
	list.add(e);
}
System.out.println("------------All Employee Details-----------");
for (Object obj : list) {
	Employee emp = (Employee)obj;
	emp.show();
	System.out.println("-----------------------------------");
}
	}

}
