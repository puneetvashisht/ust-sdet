package com.ust.day4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.ust.day2.Employee;

//@FunctionalInterface
//interface Condition{
//	boolean test(Employee e);
//}

public class EmployeeTest {
	
	public static void printEmployees(List<Employee> employees, Predicate<Employee> condition, Consumer<Employee> consumer) {
		for(Employee e : employees) {
			if(condition.test(e)) {
				consumer.accept(e);
			}
		}
	}

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
		
		
		// Print all employees with letter first letter name 'S';
		System.out.println(" -----Print all employees with letter first letter name 'S'  ----");
		Predicate<Employee> p = (e)->e.getName().startsWith("S");
		Consumer<Employee> c = (e)-> System.out.println(e);
		printEmployees(employees, p, c );
//		for(Employee e : employees) {
//			if(e.getName().startsWith("S")) {
//				System.out.println(e);
//			}
//		}
		
		// Print all employees with salary > 300000
		System.out.println(" -----Print all employees with salary > 300000  ----");
		printEmployees(employees, (e) -> e.getSalary() > 300000, (e)-> System.out.println(e));
//		for(Employee e : employees) {
//			if(e.getSalary() > 300000) {
//				System.out.println(e);
//			}
//		}
		// Print all employees
		System.out.println(" -----Print all employees  ----" );
		printEmployees(employees, (e) -> true, (e)-> System.out.println(e));
//		for(Employee e : employees) {
//			if(true) {
//				System.out.println(e);
//			}
//		}

	}

}
