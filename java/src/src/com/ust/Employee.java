package com.ust;

public class Employee {
	
//	fields
	int id;
	String name;
	double salary;
	
	// public with same class name
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
// methods
	double incrementSalary() {
		salary = salary + 5000;
		return salary;
	}
	
	void changeName(String newName) {
		name = newName;
	}
	
	
	
//	public String toString() {
//		return "[Employee " + this.name + " : " + this.salary + "]";  			  
//	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	

	public static void main(String[] args) {
		Employee e = new Employee(123, "Rahul",  33434.34);
//		e.id = 123;
//		e.name= "Rahul";
//		e.salary = 33434.34;
		
//		System.out.println(e.toString());
		
		System.out.println(e.salary);
		double changedSalary = e.incrementSalary();
//		System.out.println(changedSalary);
//		System.out.println(e.salary);
		
//		System.out.println(e.toString());
		
		e.changeName("Raja");
//		System.out.println(e.name);
//		System.out.println(e);
		
		
		Employee e1 = new Employee(23, "Sohini", 343433.44);
		System.out.println(e1);
		e1.incrementSalary();
		System.out.println(e1);
		e1.changeName("Sonia");
		System.out.println(e1);
		
//		Employee e2 = new Employee(233, "Roshini", 443433.44);
//		System.out.println(e2);

		
	}

	

}
