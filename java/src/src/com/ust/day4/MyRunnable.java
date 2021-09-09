package com.ust.day4;

public class MyRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println("Running in thread: " + Thread.currentThread().getName());
		
	}

}
