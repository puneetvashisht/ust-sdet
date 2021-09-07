package com.ust.day2.inherit;

public class RacingTest {
	
	public static void main(String[] args) {
		
		Bicycle b1 = new MountainBicycle(10);
		Bicycle b2 = new MountainBicycle(20);
		Bicycle b3 = new RoadBicycle(10);
		Bicycle b4 = new RoadBicycle(20);
		
		Bicycle [] bicycles = {b1, b2, b3, b4};
		
		for(Bicycle b : bicycles) {
			System.out.println(b);
			b.applyBrakes(5);
			System.out.println(b);
		}
		
	}

}
