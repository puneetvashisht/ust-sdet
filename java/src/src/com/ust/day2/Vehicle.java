package com.ust.day2;

public abstract class Vehicle implements Movement{
	
	private int speed;
	int mileage;
	String model;
	public Vehicle() {
		
	}
	public Vehicle(int speed, int mileage) {
		super();
		this.speed = speed;
		this.mileage = mileage;
	}
	
	public Vehicle(int speed, int mileage, String model) {
		this(speed, mileage);
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
	
//	public void startVehicle() {
//		
//	}
	public abstract void startVehicle();
	
	@Override
	public String toString() {
		return "Vehicle [speed=" + speed + ", mileage=" + mileage + ", model=" + model + "]";
	}
	
	

}
