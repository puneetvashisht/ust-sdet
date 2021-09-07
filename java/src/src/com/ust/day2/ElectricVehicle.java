package com.ust.day2;

public class ElectricVehicle extends Vehicle{
	
	int motorInKw;

	public ElectricVehicle(int speed, int mileage, String model, int motorInKw) {
		super(speed, mileage, model);
		this.motorInKw = motorInKw;
	}

	@Override
	public String toString() {
		return "ElectricVehicle [motorInKw=" + motorInKw + ", speed=" +  getSpeed() + ", mileage=" + mileage + ", model="
				+ model + "]";
	}
	
	@Override
	public void startVehicle() {
		System.out.println("Starting motor....");
	
	}

	

	@Override
	public void move() {
		System.out.println("moving ...");
		
	}

	@Override
	public void stop() {
		System.out.println("stopping ...");
		
	}
	
	
}
