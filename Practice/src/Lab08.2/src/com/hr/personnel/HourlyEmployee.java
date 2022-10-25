package com.hr.personnel;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {

    private double rate;
    private double hours;


    public HourlyEmployee() {
    }

    public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours) {
        super(name, hireDate);
        this.rate = rate;
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "Employee: name=" + getName() + ", hireDate=" + getHireDate() +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }
}
