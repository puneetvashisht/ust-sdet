package com.ust.day2.inherit;

public class RoadBicycle extends AbstractBicycle{
	
	int speed;


	public RoadBicycle(int speed) {
		super();
		this.speed = speed;
	}

	@Override
	public void applyBrakes(int decrement) {
		this.speed -= (decrement*2);
		
	}

	@Override
	public void speedUp(int increment) {
		this.speed += (increment*2);
		
	}

	@Override
	public String toString() {
		return "RoadBicycle [speed=" + speed + "]";
	}
	
	

}
