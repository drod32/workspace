package com.hr.personnel;

import gov.irs.TaxPayer;

import java.time.LocalDate;

public class SalariedEmployee
        extends Employee
        implements TaxPayer {

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
    public void payTaxes() {
        System.out.println("Salaried: taxes = "
                + salary * SALARIED_TAX_RATE);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", salary=" + salary +
                '}';
    }
}
