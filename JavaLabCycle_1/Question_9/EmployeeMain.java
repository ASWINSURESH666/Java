package QUESTION_9;

import static QUESTION_9.Employee.getEmployeeDetails;


public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee1 = getEmployeeDetails();
        Employee.SalarySlip salarySlip1 = new Employee.SalarySlip(employee1);
        salarySlip1.printSalarySlip();

        Employee employee2 = getEmployeeDetails();
        Employee.SalarySlip salarySlip2 = new Employee.SalarySlip(employee2);
        salarySlip2.printSalarySlip();
    }
}
