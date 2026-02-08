package com.tka.collection_6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Person implements Comparable<Person>{
private String name, id, city;
private int age;
private long phone;

private static ArrayList<Person> person_list= new ArrayList<Person>();


public Person() {
	super();
}

public Person(String name, String id, String city, int age, long phone) {
	super();
	this.name = name;
	this.id = id;
	this.city = city;
	this.age = age;
	this.phone = phone;
	addperson();
}
public void accept(String id, String name, int age, String city, long phone) {
	this.id = id;
    this.name = name;
    this.age = age;
    this.city = city;
    this.phone = phone;
    addperson();
    
}
public static void show() {
	System.out.println("***************Personal Information**************");
	Iterator<Person> itr = person_list.iterator();
	while(itr.hasNext()) {
		Person p = itr.next();
		System.out.println(p);
	}
}
private void addperson() {
	person_list.add(this);
}
public static void sortPersonbyAge() {
	Collections.sort(person_list); 
}

public int compareTo(Person p) {
	if(p.age>this.age) {
		return -1;
	}else if(p.age<this.age) {
		return 1;
	}else {
		return 0;
	}
}
@Override
public String toString() {
	return "Person [name=" + name + ", id=" + id + ", city=" + city + ", age=" + age + ", phone=" + phone + "]";
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
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
public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone = phone;
}


}
