package com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    double salary;

    public SalariedEmployee(String name, LocalDate hireDate, double salary) {
        super(name, hireDate);
        this.salary = salary;
    }

    @Override
    public void pay() {
        System.out.println(getName() + " is paid " + salary);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", salary=" + salary +
                '}';
    }
}
