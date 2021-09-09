package com.ust.day4;


class WrongInputException extends Exception{
	WrongInputException(String message){
		super(message);
	}
}


public class ExceptionDemo {
	
	public static void m3(int x) throws WrongInputException {
		int y= 10;
		
		if(x<1) {
//			 Unchecked ... not checked by compiler
			throw new WrongInputException("x cannot be less than 1");
			
			//checked by compiler
//			throw new Exception();
		}
		
//		try {
//			System.out.println(y/x);
//		}
//		catch(ArithmeticException ae)
//		{
//			System.out.println("Wrong value of x .. cannot be zero " );
//			ae.printStackTrace();
//		}
//		finally {
//			System.out.println("Alwayz executed..");
//		}
		System.out.println("Inside m3 "  + x);
	}
	
	public static void m2(int x) throws WrongInputException  {
		m3(x);
		System.out.println("Inside m2 "  + x);
	}
	

	public static void m1(int x) throws WrongInputException  {
		m2(x);
		System.out.println("Inside m1 "  + x);
	}
	
	public static void main(String[] args) {
//		ExceptionDemo ed = new ExceptionDemo();
//		try {
		try {
			ExceptionDemo.m1(0);
		} catch (Exception e) {
			System.out.println("Handled in main... " );
			e.printStackTrace();
		}
//		}
//		catch(Exception e) {
//			System.out.println("Handled in main... " );
//			e.printStackTrace();
//		}
		System.out.println("Allz well that ends well...");
		
	}

}
