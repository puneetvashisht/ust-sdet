package com.ust.day2;

public class Vehicle {
	
	private int speed;
	int mileage;
	String model;
	public Vehicle() {
		
	}
	public Vehicle(int speed, int mileage, String model) {
		super();
		this.speed = speed;
		this.mileage = mileage;
		this.model = model;
	}
	
	
	
	public void setSpeed(int speed) {
		if(speed>0)
			this.speed = speed;
	}
	public int getSpeed() {
		if(speed>0) {
			return speed;
		}
		return 0;
	}
	
	public void applyBrakes() {
		System.out.println("applying brakes");
	}
	
	public void startVehicle() {
		System.out.println("Starting vehicle...");
	}
	
	@Override
	public String toString() {
		return "Vehicle [speed=" + speed + ", mileage=" + mileage + ", model=" + model + "]";
	}
	
	

}
