package com.ust.day3;

import java.util.HashMap;
import java.util.Map;

import com.ust.day2.Employee;

public class MapDemo {

	public static void main(String[] args) {
		Map<Integer, Employee> employeeMap = new HashMap<>();
		employeeMap.put(23, new Employee(23, "Sohini", 343433.44));
		employeeMap.put(3, new Employee(3, "Rahul", 133433.44));
		employeeMap.put(44, new Employee(44, "Riya", 83433.44));
		
		System.out.println(employeeMap);
		
		System.out.println(employeeMap.get(44));
		
		
		System.out.println(employeeMap.keySet());
		
		for(Integer key: employeeMap.keySet()) {
			System.out.println(employeeMap.get(key));
		}
		

	}

}
