package com.kodilla.patterns2.adapter.company.newhrsystem;

import java.math.BigDecimal;
import java.util.Objects;

public class Employee {
    private final String pesel;
    private final String firstName;
    private final String lastname;
    private final BigDecimal baseSalary;

    public Employee(String pesel, String firstName, String lastname, BigDecimal baseSalary) {
        this.pesel = pesel;
        this.firstName = firstName;
        this.lastname = lastname;
        this.baseSalary = baseSalary;
    }

    public String getPesel() {
        return pesel;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public BigDecimal getBaseSalary() {
        return baseSalary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return Objects.equals(getPesel(), employee.getPesel()) &&
                Objects.equals(getFirstName(), employee.getFirstName()) &&
                Objects.equals(getLastname(), employee.getLastname()) &&
                Objects.equals(getBaseSalary(), employee.getBaseSalary());
    }

    @Override
    public int hashCode() {
        return pesel != null ? pesel.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "pesel='" + pesel + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastname='" + lastname + '\'' +
                ", baseSalary=" + baseSalary +
                '}';
    }
}
