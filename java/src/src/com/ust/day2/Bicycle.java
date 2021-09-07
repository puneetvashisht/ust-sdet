package com.ust.day2;


public class Bicycle{

    private int speed;

    public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if(speed > 0) {
			this.speed = speed;
		}
		
	}
	public Bicycle(){

    }
    public Bicycle(int speed) {
        this.speed = speed;
    }

    void speedUp(){
        speed++;
    }
    
    void brakeDown(){
        speed--;
    }

    @Override
    public String toString() {
        return "Bicycle [speed=" + speed + "]";
    }

    
}
