package org.example.experiment;

import java.util.Objects;

public class Employee {

    private String empName;
    private int empId;
    private String city;
    private double salary;
    private String department;


    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", empId=" + empId +
                ", city='" + city + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return empId == employee.empId && Double.compare(salary, employee.salary) == 0 && Objects.equals(empName, employee.empName) && Objects.equals(city, employee.city) && Objects.equals(department, employee.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empName, empId, city, salary, department);
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Employee() {
    }

    public Employee(int empId, String empName, String city, double salary, String department) {
        this.empId = empId;
        this.empName = empName;
        this.city = city;
        this.salary = salary;
        this.department = department;
    }
}
