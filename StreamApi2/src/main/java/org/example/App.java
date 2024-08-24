package org.example;

import org.example.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("sai", "kiran", 22000, "active", new Department(1, "HR")));
        employees.add(new Employee("amir", "khan", 42000, "active", new Department(2, "IT")));
        employees.add(new Employee("john", "doe", 32000, "inactive", new Department(1, "HR")));
        employees.add(new Employee("ravi", "kishan", 44000, "active", new Department(2, "IT")));
        employees.add(new Employee("bhanu", "pratap", 33000, "inactive", new Department(1, "HR")));
        employees.add(new Employee("paul", "sundar", 28000, "active", new Department(2, "IT")));
        employees.add(new Employee("irfan", "pathan", 52000, "inactive", new Department(3, "SALES")));
        employees.add(new Employee("mahesh", "babu", 11000, "active", new Department(3, "SALES")));
        employees.add(new Employee("virat", "kohli", 66000, "inactive", new Department(4, "LEGAL")));
        employees.add(new Employee("rama", "rao", 77000, "active", new Department(4, "LEGAL")));


        long activeCount = employees.stream().filter(
                e -> e.getStatus().equalsIgnoreCase("active")).count();

        System.out.println("------------------ACTIVE EMPLOYESS COUNT-------------------");
        System.out.println("Count of active employees: " + activeCount);
        System.out.println();System.out.println();


        Map<String, List<Employee>> employeeDeptMap = employees.stream().collect(
                Collectors.groupingBy(e -> e.getDept().getDeptName()));

        System.out.println("-----------------EMPLOYEE DETAILS ON BASIS OF DEPARTMENTS----------------------");
        employeeDeptMap.forEach((dept, empList) -> {
            System.out.println("Department: " + dept);
            empList.forEach(
                    e -> System.out.println(e)
            );
            System.out.println();
        });
        System.out.println();System.out.println();


        Map<String, Long> employeeCountByDept = employees.stream()
                .collect(Collectors.groupingBy(
                        e -> e.getDept().getDeptName(),
                        Collectors.counting()
                ));

        System.out.println("--------------EMPLOYEE COUNT ON BASIS OF DEPARTMENTS----------------------");
        employeeCountByDept.forEach((dept, count) -> {
            System.out.println("Department: " + dept + ", Employee Count: " + count);
        });


        Map<String, Optional<Employee>> highestSalaryByDept = employees.stream()
                .collect(Collectors.groupingBy(
                        e -> e.getDept().getDeptName(),
                        Collectors.maxBy(Comparator.comparingInt(Employee::getSalary))
                ));

        System.out.println("-------------------EMPLOYEE DETAILS WITH HIGHEST SALARY ON BASIS OF DEPT---------------------");
        highestSalaryByDept.forEach((dept, emp) -> {
            emp.ifPresent(employee -> {
                System.out.println("Department: " + dept + ", Highest Salary Employee: " + employee);
            });
        });

        System.out.println();System.out.println();


        System.out.println("--------------------EMPLOYEE NAME AND SALARY------------------");
        Map<String, List<String>> employeeNameAndSalaryByDept = employees.stream()
                .collect(Collectors.groupingBy(
                        e -> e.getDept().getDeptName(),
                        Collectors.mapping(e -> e.getFirstName() + " - $" + e.getSalary(), Collectors.toList())
                ));

        employeeNameAndSalaryByDept.forEach((dept, empList) -> {
            System.out.println("Department: " + dept);
            empList.forEach(e -> System.out.println(e));
            System.out.println();
        });


    }
}
