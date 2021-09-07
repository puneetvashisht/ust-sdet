package com.ust.day2;

public  class MountainBicycle extends Bicycle{
    int gears;
    int currentGear;

    public MountainBicycle(){
        super();
    }

    public MountainBicycle(int speed, int gears) {
        super(speed);
        this.gears = gears;
    }

    void changeGear(int gear){
        this.currentGear = gear;
    }

    @Override
    public String toString() {
        return "MountainBicycle [speed=" + speed  + ", currentGear=" + currentGear + ", gears=" + gears + "]";
    }

    // @Override
    // public String toString() {
    //     return "MountainBicycle [speed=" + speed  + ", gears=" + gears + "]";
    // }




    
}
