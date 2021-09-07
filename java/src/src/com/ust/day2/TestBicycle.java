package com.ust.day2;

public class TestBicycle {
    public static void main(String[] args) {
        Bicycle b1 = new Bicycle(10);
        System.out.println(b1);
        b1.speedUp();
        System.out.println(b1);

        MountainBicycle mb = new MountainBicycle(10, 7);
        System.out.println(mb);

        mb.speedUp();
        System.out.println(mb);
        mb.changeGear(4);
        System.out.println(mb);

        RoadBicycle rb = new RoadBicycle(10);
        rb.speedUp();
        System.out.println(rb);

    }
}
