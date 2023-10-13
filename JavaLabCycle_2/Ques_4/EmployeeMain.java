/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ques_4;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author HP
 */


public class EmployeeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int n = scanner.nextInt();

        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");
            System.out.print("Employee ID: ");
            int employeeId = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            System.out.print("Employee Name: ");
            String employeeName = scanner.nextLine();
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character
            System.out.print("Date of Birth (DD-MM-YYYY): ");
            String dob = scanner.nextLine();
            System.out.print("Date of Joining (DD-MM-YYYY): ");
            String doj = scanner.nextLine();

            employees.add(new Employee(employeeId, employeeName, new Employee.Salary(salary), new Employee.DateOfBirth(dob), new Employee.DateOfJoining(doj)));
        }

        Collections.sort(employees, Comparator.comparing(Employee::getSalary));

        System.out.println("Employee list sorted by descending salary:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}