package com.tka.collection_6;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Employee e1 = new Employee("p101", "engineer", "communication", "20000");
		
Person p1 = new Person("Neha", "p101", "nagpur", 21, 889965432);
Person p2 = new Person("Khushi", "p102", "pune", 22, 871965432);
Person p3 = new Person("nitu", "p103", "nashik", 28, 171100432);
Person p4 = new Person("rahi", "p104", "banglore", 20, 271912332);
Person p5 = new Person("shree", "p105", "thane", 23, 991965432);
Person.show();
Person.sortPersonbyAge();
System.out.println("---------");
Person.show();

//Employee e1 = new Employee("e101","Amit",26,"Mumbai",9876543210L,
//        "Developer","IT",45000);
//Employee.show();
	}

}
