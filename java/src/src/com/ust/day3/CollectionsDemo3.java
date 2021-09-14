package com.ust.day3;

import java.util.ArrayList;
import java.util.List;

class Fruit{
	String name;

	public Fruit(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Fruit [name=" + name + "]";
	}
	@Override
	 public boolean equals(Object obj) {
//	        return (this == obj);
		Fruit f = (Fruit) obj;
		return this.name.equals(f.name);
	 }

	
	
}

public class CollectionsDemo3 {

	public static void main(String[] args) {
		List<Fruit> fruits = new ArrayList<>();
		fruits.add(new Fruit("Apple"));
		fruits.add(new Fruit("Orange"));
		fruits.add(new Fruit("Banana"));
		fruits.add(new Fruit("Kiwi"));

		System.out.println(fruits);
		
		System.out.println(fruits.contains(new Fruit("Apple")));
//		
//		
		// Collections.sort(fruits);
//		System.out.println(fruits);
//		fruits.remove(0);
//		System.out.println(fruits);
		


	}

}
