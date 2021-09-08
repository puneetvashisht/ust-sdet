package com.ust.day3;

import java.util.ArrayList;
import java.util.List;

public class TestEmployee {
	
	public static void main(String[] args) {
		
	     int x = 43;
		
		
		final Address add1 = new Address(23, "Jangpura", "New DElhi", "India");
		Address add2 = new Address(3, "Magarpatta", "Pune", "India");
		List<Address> addresses = new ArrayList<>();
		addresses.add(add1);
		addresses.add(add2);
		
		Employee e1 = new Employee(23, "Sohini", 343433.44, addresses);
//		Employee e2 = new Employee(13, "Priya", 243433.44, add1);
		
		System.out.println(e1);
//		System.out.println(e2);
//		
		
//		Address add2 = new Address(3, "Magarpatta", "Pune", "India");
//		Employee e3 = new Employee(3, "Nidhi", 543433.44, add2 );
		
//		System.out.println(e3);
		
	}

}
