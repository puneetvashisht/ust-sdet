package com.ust.day2;


public class TestEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee(23, "Sohini", 343433.44);
        Employee e2 = new Employee(13, "Priya", 243433.44);
        Employee e3 = new Employee(3, "Nidhi", 543433.44);

        Employee e4 = new Employee();
        e4.id =34;

        System.out.println(e1);
        e1.incrementSalary(10000);
        System.out.println(e1);


        ContractEmployee ce = new ContractEmployee(34, "Charlie", 0.0, 5000);
        System.out.println(ce);
    }
}
