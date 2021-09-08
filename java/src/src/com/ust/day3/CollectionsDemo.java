package com.ust.day3;

import java.util.Set;
import java.util.TreeSet;

public class CollectionsDemo {

	public static void main(String[] args) {
//		List<String> fruits = new LinkedList<>();
		Set<String> fruits = new TreeSet<>();
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Orange");
		fruits.add("Banana");
		fruits.add("Kiwi");
//		fruits.add(12);
//		fruits.add(new Employee());
		System.out.println(fruits);
		
//		for(String f: fruits) {
////			System.out.println(f);
////			String str = (String) f;
//			System.out.println(f.charAt(0));
//		}

	}

}
