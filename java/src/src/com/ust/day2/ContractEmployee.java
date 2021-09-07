package com.ust.day2;

public class ContractEmployee extends Employee{

    int payPerDay;

    public ContractEmployee(int id, String name, double salary, int payPerDay) {
        super(id, name, salary);
        this.payPerDay = payPerDay;
    }

    @Override
    public String toString() {
        return "ContractEmployee [payPerDay=" + payPerDay + "id=" + id +  "name=" + name + "salary=" + salary +"]";
    }

    
    
}
