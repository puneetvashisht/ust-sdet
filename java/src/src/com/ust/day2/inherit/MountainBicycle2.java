package com.ust.day2.inherit;

public class MountainBicycle2 implements Bicycle{
	
	int speed;


	public MountainBicycle2(int speed) {
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
		return "MountainBicycle2 [speed=" + speed + "]";
	}
	
	

}
