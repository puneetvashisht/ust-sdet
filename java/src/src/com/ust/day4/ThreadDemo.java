package com.ust.day4;

import java.util.function.Function;

import com.ust.day3.Employee;

//@FunctionalInterface
//interface FindLength{
//	int length(String str);
//}

public class ThreadDemo {
	

	public static void main(String[] args) {
		
		
//		create a subclass
//		Runnable runnable = new MyRunnable();
		
//				Runnable runnable = new Runnable() {
//
//					@Override
//					public void run() {
//						System.out.println("Running in thread: " + Thread.currentThread().getName());		
//					}
//					
//				};
//				// lamdas
//				Greeter hindiGreeter = ()-> System.out.println("Namaste!!");
//				hindiGreeter.sayHello();
		
		
				
		Thread t = new Thread(() -> System.out.println("Running in thread: " + Thread.currentThread().getName()));
		t.start();
		
		Function<String, Integer> l = (s)->s.length();
		int length = l.apply("XYDGSDG");
		System.out.println(length);
		
	
		
		Function<Employee, Double> f = (e)-> e.salary;
		
		System.out.println(f.apply(new Employee(12, "tets", 34334.343, null)));
		

	}

}
