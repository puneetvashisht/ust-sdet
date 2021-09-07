package com.ust.day2;

import com.ust.Employee;

public class ArraysDemo2 {
    public static void main(String[] args) {
        Employee e1 = new Employee(23, "Sohini", 343433.44);
        Employee e2 = new Employee(13, "Priya", 243433.44);
        Employee e3 = new Employee(3, "Nidhi", 543433.44);
        // int values[] = new int[5];
        // create an array of defined size
        // Employee employees[] = new Employee[3];

        // create an array for existing values
        Employee employees[] = {e1, e2, e3};
        // employees[0] = e1;
        // employees[1] = e2;
        // employees[2] = e3;

        for(Employee e : employees){
            System.out.println(e);
        }
    }
}
