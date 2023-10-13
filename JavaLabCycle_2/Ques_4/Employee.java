/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ques_4;

import java.util.*;

/**
 *
 * @author HP
 */

class Employee {
    private int employeeId;
    private String employeeName;
    private Salary salary;
    private DateOfBirth dob;
    private DateOfJoining doj;

    public Employee(int employeeId, String employeeName, Salary salary, DateOfBirth dob, DateOfJoining doj) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
        this.dob = dob;
        this.doj = doj;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public Salary getSalary() {
        return salary;
    }

    public DateOfBirth getDob() {
        return dob;
    }

    public DateOfJoining getDoj() {
        return doj;
    }

    @Override
    public String toString() {
        return "Employee ID: " + employeeId + ", Name: " + employeeName + ", Salary: " + salary.getAmount() + ", DOB: " + dob + ", DOJ: " + doj;
    }

    static class Salary implements Comparable<Salary> {
        private double amount;

        public Salary(double amount) {
            this.amount = amount;
        }

        public double getAmount() {
            return amount;
        }

        @Override
        public int compareTo(Salary other) {
            return Double.compare(other.amount, this.amount);
        }
    }

    static class DateOfBirth {
        private String dob;

        public DateOfBirth(String dob) {
            this.dob = dob;
        }

        @Override
        public String toString() {
            return dob;
        }
    }

    static class DateOfJoining {
        private String doj;

        public DateOfJoining(String doj) {
            this.doj = doj;
        }

        @Override
        public String toString() {
            return doj;
        }
    }
}
