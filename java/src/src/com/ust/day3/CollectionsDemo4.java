package com.ust.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.ust.day2.Employee;

public class CollectionsDemo4 {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		Employee e1 = new Employee(23, "Sohini", 343433.44);
		Employee e2 = new Employee(13, "Priya", 243433.44);
		Employee e3 = new Employee(3, "Nidhi", 543433.44);
		

		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		System.out.println(employees);
		
//		boolean result = e1.equals(new Employee(23, "Sohini", 343433.44));
//		System.out.println(result);
//		
//		System.out.println(e1 == e2);
//		
//		System.out.println(employees.contains(new Employee(3, "XYZ", 543433.44)));
		
		Collections.sort(employees);
		
		System.out.println(employees);

	}

}
