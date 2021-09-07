package com.ust.day2;

public class MotorVehicle extends Vehicle{
	
	int enginePower;

	public MotorVehicle(int speed, int mileage, String model, int enginePower) {
		super(speed, mileage, model);
		this.enginePower = enginePower;
	}

	@Override
	public String toString() {
		return "MotorVehicle [enginePower=" + enginePower + ", speed=" +  getSpeed() + ", mileage=" + mileage + ", model="
				+ model + "]";
	}
	
	@Override
	public void startVehicle() {
	
		System.out.println("Starting engine....");
	
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
