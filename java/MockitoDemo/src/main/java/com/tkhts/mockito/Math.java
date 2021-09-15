package com.tkhts.mockito;

public class Math {
	// addition of two numbers
	public int add(int a, int b) {
		System.out.println("Adding "+ a + " and "+ b);
		return a + b;
	}

	// Multiply two numbers
	public int mul(int a, int b) {
		System.out.println("Multiplying "+ a + " and "+ b);
		return a * b;
	}

	// Division of two numbers
	public int div(int a, int b) {
		System.out.println("Dividing "+ a + " by "+ b);
		return a / b;
	}
	
	//Return a prime number
	public int primeNumber(){
		System.out.println("returning 5 as a prime number");
		return 5;
	}
	
}
