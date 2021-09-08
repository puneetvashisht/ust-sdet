package com.ust.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo2 {

	public static void main(String[] args) {
		List<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Banana");
		fruits.add("Kiwi");

		System.out.println(fruits);
		
		System.out.println(fruits.contains("Grapes"));
		
		
		Collections.sort(fruits);
		System.out.println(fruits);
		fruits.remove(0);
		System.out.println(fruits);
		


	}

}
