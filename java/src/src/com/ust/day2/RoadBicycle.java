package com.ust.day2;

public class RoadBicycle extends Bicycle{

    public RoadBicycle(int speed) {
        super(speed);
        // this.speed = speed;
    }

    @Override
    void speedUp(){
//        speed += 2;
    	this.setSpeed(this.getSpeed() + 2);
    }

    @Override
    void brakeDown(){
//        speed -= 2;
    	this.setSpeed(this.getSpeed() - 2);
    }

    @Override
    public String toString() {
        return "RoadBicycle [speed=" + this.getSpeed()  + "]";
    }
    
}
