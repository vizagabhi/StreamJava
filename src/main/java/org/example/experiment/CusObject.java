package org.example.experiment;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class CusObject {

    public static void main(String[] args) throws NoEmployeeFound {

        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee(101, "Amit Sharma", "Delhi", 75000, "IT"));
        emp.add(new Employee(102, "Priya Singh", "Mumbai", 68000, "HR"));
        emp.add(new Employee(103, "Rohit Mehta", "Kolkata", 95000, "Finance"));
        emp.add(new Employee(104, "Sneha Patel", "Ahmedabad", 72000, "Marketing"));
        emp.add(new Employee(105, "Vikas Gupta", "Hyderabad", 88000, "IT"));
        emp.add(new Employee(106, "Anjali Nair", "Patna", 64000, "Support"));
        emp.add(new Employee(107, "Manish Kumar", "Delhi", 90000, "Finance"));
        emp.add(new Employee(108, "Divya Reddy", "Hyderabad", 81000, "IT"));
        emp.add(new Employee(109, "Rahul Yadav", "Patna", 70000, "Sales"));
        emp.add(new Employee(110, "Kiran Joshi", "Kolkata", 67000, "HR"));
        emp.add(new Employee(111, "Neha Verma", "Mumbai", 73000, "Marketing"));
        emp.add(new Employee(112, "Sandeep Raj", "Delhi", 82000, "Finance"));
        emp.add(new Employee(113, "Tanya Desai", "Ahmedabad", 76000, "IT"));
        emp.add(new Employee(114, "Rajeev Menon", "Kolkata", 84000, "Support"));
        emp.add(new Employee(115, "Arjun Pillai", "Mumbai", 91000, "Finance"));
        emp.add(new Employee(116, "Mitali Das", "Hyderabad", 68000, "HR"));
        emp.add(new Employee(117, "Saurabh Jain", "Ahmedabad", 70000, "Sales"));
        emp.add(new Employee(118, "Komal Tiwari", "Patna", 77000, "IT"));
        emp.add(new Employee(119, "Deepak Thakur", "Delhi", 85000, "Finance"));
        emp.add(new Employee(120, "Pooja Soni", "Mumbai", 69000, "Marketing"));

        //1. Find all employees from a specific city and get the count.

//        long count = emp.stream().filter(x -> x.getCity().equals("Patna")).count();
//        System.out.println(count);

        //2. Find all employees where salary is greater than a particular value

        //emp.stream().filter(x->x.getSalary()>50000).forEach(System.out::println);

        //3. Print all the employee names only in upper case and alphabetical order

//        emp.stream().map(x->x.getEmpName().toUpperCase()).forEach(System.out::println);

        //4. Get the first employee where dept is "HR" and if not available throw exception

//        Employee hr = emp.stream()
//                .filter(x -> x.getDepartment().equals("HRO"))
//                .findFirst().orElseThrow(()-> new NoEmployeeFound("Employees with this department do not exist."));
//        System.out.println(hr);


        //5. Get the total salary of all employees in a specific department

//        double total = emp.stream().mapToDouble(Employee::getSalary).sum();
//        System.out.println(total);

//        6. Get the employees with the highest salary

//        emp.stream().sorted((x,y)-> (int) ((Double)y.getSalary()-(Double)x.getSalary())).forEach(System.out::println);

//        10. Get the employees with the highest salary
//        11. Get the employees with the second highest salary
//        12. Get the employees who are earning above the average salary
//        13. Get the employee with the longest name
//
//
//        14.Group all employees by department
//        15.Get the count of employees by department
//        16.Get the sum of salaries of all employees by department
//        17.Get the average salaries of all employees per department
//        18.Check if all employees belong to a specific department
//        19.List all employees grouping by cities but belong to the same department
//        20.Find the department with the highest average salary
    }

}
