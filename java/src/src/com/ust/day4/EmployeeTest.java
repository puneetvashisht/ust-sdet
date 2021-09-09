package com.ust.day4;

import java.util.ArrayList;
import java.util.List;

import com.ust.day2.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		Employee e1 = new Employee(23, "Sohini", 343433.44);
		Employee e2 = new Employee(13, "Priya", 243433.44);
		Employee e3 = new Employee(3, "Nidhi", 543433.44);
		Employee e4 = new Employee(3, "Sonia", 243433.44);

		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		System.out.println(employees);
		
		
		// Print all employees with letter first letter name 'S';
		
		// Print all employees with salary > 300000
		
		// Print all employees

	}

}
