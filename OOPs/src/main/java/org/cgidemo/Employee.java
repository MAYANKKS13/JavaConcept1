package org.cgidemo;

public class Employee {
    private String name;
    private int age;
    private String department;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(){}

    public Employee(String name, int age, String department, double salary) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Name: "+name+" age "+age+" department "+department+" salary "+salary);
    }

    public void calBonus(){
        if(salary > 40000){
            salary = salary + 5000;
        }
        else {
            salary = salary + 1000;
        }
    }
}
