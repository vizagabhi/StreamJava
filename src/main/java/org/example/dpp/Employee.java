package org.example.dpp;

import lombok.*;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;

    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee(1, "A", "IT", 90000),
                new Employee(2, "B", "IT", 80000),
                new Employee(3, "C", "HR", 95000),
                new Employee(4, "D", "HR", 85000),
                new Employee(5, "E", "Finance", 70000),
                new Employee(6, "F", "Finance", 60000)
        );

        //2nd Highest Salary, Employee object that have that 2nd highest salary

//        double secondHighest = employees.stream()
//                .map(Employee::getSalary)
//                .distinct()
//                .sorted(Comparator.reverseOrder())
//                .skip(1)
//                .findFirst()
//                .orElseThrow();

//        employees.stream()
//                .filter(e -> e.getSalary() == secondHighest)
//                .findFirst()
//                .ifPresent(System.out::println);
//========================================================================================================
        //"Don't return the second highest salary.
        // Return all employees who have the second highest distinct salary."

//        employees.stream()
//                .filter(e -> e.getSalary() == secondHighest)
//                .map(Employee::getName)
//                .toList()
//                .forEach(System.out::println);
//=======================================================================================================
//    Q.find the highest-paid employee in each department.

        employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment))
                .forEach((dept, empList) -> {

                    Employee highest = empList.stream()
                            .max(Comparator.comparing(Employee::getSalary))
                            .orElse(null);

                    System.out.println(dept + " -> " + highest);
                });


        employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.maxBy(
                                Comparator.comparing(Employee::getSalary)
                        )
                )).forEach((dept, empList) -> {
                    System.out.println(dept + " -> " + empList.get());
                });


    }

}


