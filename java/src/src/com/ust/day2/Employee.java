package com.ust.day2;



public class Employee implements Comparable<Employee>{

    int id;
    String name;
    double salary;

    void incrementSalary(double incrementBy){
        this.salary += incrementBy;
    }

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public Employee() {
    }
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
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
