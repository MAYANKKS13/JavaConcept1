package org.example;

public class Employee {
    private String firstName;
    private String lastName;
    private Integer Salary;
    private String status; // active & inactive
    private Department dept;

    public Employee() {
    }

    public Employee(String firstName, String lastName, Integer salary, String status, Department dept) {
        this.firstName = firstName;
        this.lastName = lastName;
        Salary = salary;
        this.status = status;
        this.dept = dept;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getSalary() {
        return Salary;
    }

    public void setSalary(Integer salary) {
        Salary = salary;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Department getDept() {
        return dept;
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee:- " +
                "firstName: '" + firstName +
                ", lastName: '" + lastName +
                ", Salary: " + Salary +
                ", status: '" + status +
                ", dept: " + dept;
    }
}
