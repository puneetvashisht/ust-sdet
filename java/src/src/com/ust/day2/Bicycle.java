package com.ust.day2;

public class Bicycle{

    int speed;


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
