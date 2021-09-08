package com.ust.day3;

import java.util.List;

public class Employee implements Comparable<Employee>{

    int id;
    String name;
    double salary;
    List<Address> addresses;
//    Department 
    
    void incrementSalary(double incrementBy){
        this.salary += incrementBy;
    }

    public Employee(int id, String name, double salary,  List<Address> addresses) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.addresses = addresses;
    }
    public Employee() {
    }
  
    
    @Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", addresses=" + addresses + "]";
	}

	@Override
	 public boolean equals(Object obj) {
//	        return (this == obj);
    	Employee e = (Employee) obj;
		return this.id == e.id;
	 }

	@Override
	public int compareTo(Employee o) {
		return this.name.compareTo(o.name);
	}

    
}
