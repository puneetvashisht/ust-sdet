package com.ust.day2.inherit;

public class MountainBicycle implements Bicycle{
	
	int speed;


	public MountainBicycle(int speed) {
		super();
		this.speed = speed;
	}

	@Override
	public void applyBrakes(int decrement) {
		this.speed -= decrement;
		
	}

	@Override
	public void speedUp(int increment) {
		this.speed += increment;
		
	}

	@Override
	public String toString() {
		return "MountainBicycle [speed=" + speed + "]";
	}
	
	

}
