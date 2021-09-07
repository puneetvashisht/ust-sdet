package com.ust.day2;

public class TestVehicle {

	public static void main(String[] args) {
		// Upcasting
		byte b = 28;
		int i = b;
		long l = i;
		
		// Downcasting
		int x = 228;
		byte y = (byte)x;
		
		System.out.println(y);
		
		// Refer to subtype objects by using a supertype
		// Upcasting
		Vehicle mv = new MotorVehicle(200, 15, "mHawk Scorpio", 2400);
		mv.setSpeed(-340);
		mv.mileage = -3434;
		System.out.println(mv);
		// Downcasting
//		Object v1 = new Vehicle(40, 25, "XYZ");
		
//		ElectricVehicle mvv = (ElectricVehicle)mv;
//		System.out.println(mvv);
		mv.startVehicle();
		
		
		ElectricVehicle ev = new ElectricVehicle(180, 320, "Tata Tigor EV", 60);
//		System.out.println(ev);
//		ev.startVehicle();
		
		ElectricVehicle evScooty = new ElectricVehicle(55, 80, "Ampere Motors", 2);
//		System.out.println(evScooty);
//		evScooty.startVehicle();
		
		byte bb = 35;
		int myArr[] = {23,45,6,7,89,9, bb};
		
		Vehicle vehicles[] = {mv, ev, evScooty};
		for(Vehicle v: vehicles) {
			System.out.println(v.toString());
			v.startVehicle();
		}

	}

}
