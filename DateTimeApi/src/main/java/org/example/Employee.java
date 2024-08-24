package org.example;

import java.time.LocalDate;

public class Employee {
    private String name;
   private LocalDate dob;
    private LocalDate doj;

    public Employee() {
    }

    public Employee(String name, LocalDate dob, LocalDate doj) {
        this.name = name;
        this.dob = dob;
        this.doj = doj;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public LocalDate getDoj() {
        return doj;
    }

    public void setDoj(LocalDate doj) {
        this.doj = doj;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dob=" + dob +
                ", doj=" + doj +
                '}';
    }
}
