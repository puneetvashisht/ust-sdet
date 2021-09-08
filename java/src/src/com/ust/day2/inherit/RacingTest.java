package com.ust.day2.inherit;

import java.util.ArrayList;

public class RacingTest {
	
	public static void main(String[] args) {
		
		AbstractBicycle b1 = new MountainBicycle(10);
		AbstractBicycle b2 = new MountainBicycle(20);
		AbstractBicycle b3 = new RoadBicycle(10);
		AbstractBicycle b4 = new RoadBicycle(20);
		
//		AbstractBicycle [] bicycles = {b1, b2, b3, b4};
		ArrayList<AbstractBicycle> bicycles = new ArrayList<>();
		bicycles.add(b1);bicycles.add(b2);
		bicycles.add(b3);bicycles.add(b4);
		
		for(AbstractBicycle b : bicycles) {
			System.out.println(b);
			b.peddle();
			System.out.println(b);
		}
		
	}

}
