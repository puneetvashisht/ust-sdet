package com.ust.day4;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

import com.ust.day2.Employee;

//@FunctionalInterface
//interface Condition{
//	boolean test(Employee e);
//}

public class EmployeeTest2 {
	
	

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		Employee e1 = new Employee(23, "Sohini", 343433.44);
		Employee e2 = new Employee(13, "Priya", 243433.44);
		Employee e3 = new Employee(3, "Nidhi", 543433.44);
		Employee e4 = new Employee(3, "Sonia", 243433.44);

		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		System.out.println(employees);
		
		// select * from employee where name like '%S%'
		// select Min(salary) from employee;
	
		
		
		// Print all employees with letter first letter name 'S';
		System.out.println(" -----Print all employees with letter first letter name 'S'  ----");
		employees.stream()
		.filter((e)->e.getName().startsWith("S"))
		.map((e)->e.getName())
		.forEach((e)-> System.out.println(e));
		
		// Print all employees with salary > 300000
		System.out.println(" -----Print all employees with salary > 300000  ----");
		employees.stream()
		.filter((e)->e.getSalary() > 300000)
		.forEach((e)-> System.out.println(e));
		
		// Print all employees
		System.out.println(" -----Print all employees  ----" );
		employees.stream()
		.forEach((e)-> System.out.println(e));
		
		Optional<Double> minimumSalary = employees.stream()
		.map((e) -> e.getSalary())
		.max((s1,s2)-> (int)(s1-s2));
		
		if(minimumSalary.isPresent()) {
			System.out.println(minimumSalary.get());
			
		}
		
		
		employees.stream()
		.sorted((o1,o2)->o1.getName().compareTo(o2.getName()))
		.forEach((e)-> System.out.println(e));
		
		
		OptionalInt  minimumId = employees.stream()
		.mapToInt((e) -> e.getId())
		.max();
		
		if(minimumId.isPresent()) {
			System.out.println(minimumId.getAsInt());
		}
		

	}

}
