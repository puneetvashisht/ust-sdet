package com.ust;

public class Person {
	// fields
	int age;
	String name;

	
	// methods
	public void celebratingBirthday() {
		System.out.println("Party time!!");
		age = age + 1;
	}
	
	public static void main(String[] args) {
		System.out.println("Creating person objects...");
		
		Person p = new Person();
		p.name = "Ravi";
		p.age = 23;
		System.out.println(p.name);
		System.out.println(p.age);
		p.celebratingBirthday();
		System.out.println(p.age);
		
		// Object create
		
		Person p1 = new Person();
		p1.name = "Priya";
		p1.age = 34;
		
		System.out.println(p1.name + " : " + p1.age);
		p1.celebratingBirthday();
		System.out.println(p1.age);
		
	}
	
	

}
