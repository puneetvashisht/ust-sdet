package com.ust.test;

import static org.junit.Assert.assertSame;

import org.junit.Before;
import org.junit.Test;

import com.ust.Calc;

public class TestCalc {
	Calc calc; 
	@Before
	public void setup() {
		// execute function
		System.out.println("Called before every test case");
		 calc = new Calc();
	}

	@Test
	public void testAdd() {
		// inputs
		int a = 34;
		int b = 66;

		int result = calc.add(a, b);
		
		// match expected output
		assertSame(100, result);
	}
	
	@Test
	public void testAddWithNegativeInputs() {
		// inputs
		int a = -34;
		int b = -66;
		
		// execute function
//		Calc calc = new Calc();
		int result = calc.add(a, b);
		
		// match expected output
		assertSame(-100, result);
	}
	
	@Test
	public void testAddWithZero() {
		// inputs
		int a = -34;
		int b = 0;
		
		// execute function
//		Calc calc = new Calc();
		int result = calc.add(a, b);
		
		// match expected output
		assertSame(-34, result);
	}

}
