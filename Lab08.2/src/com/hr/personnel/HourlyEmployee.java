package com.hr.personnel;

import java.time.LocalDate;



public class HourlyEmployee extends Employee
implements TaxPayer{

    private double rate;
    private double hours;

    public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours) {
        super(name, hireDate);
        this.rate = rate;
        this.hours = hours;
    }

    @Override
    public void pay() {
        System.out.println(getName() + " is paid " + rate * hours);
    }

    public void payTaxes() {
        System.out.println("Hourly: taxes = " +
                rate * hours * HOURLY_TAX_RATE);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }
}
