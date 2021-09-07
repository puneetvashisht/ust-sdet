package com.ust.day2.inherit;

public class RacingTest {
	
	public static void main(String[] args) {
		
		AbstractBicycle b1 = new MountainBicycle(10);
		AbstractBicycle b2 = new MountainBicycle(20);
		AbstractBicycle b3 = new RoadBicycle(10);
		AbstractBicycle b4 = new RoadBicycle(20);
		
		AbstractBicycle [] bicycles = {b1, b2, b3, b4};
		
		for(AbstractBicycle b : bicycles) {
			System.out.println(b);
			b.peddle();
			System.out.println(b);
		}
		
	}

}
