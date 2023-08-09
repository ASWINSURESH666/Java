package QUESTION_9;
import java.util.Scanner;


public class Employee {
    String name;
    int code;
    double basicPay;

    public Employee(String name, int code, double basicPay) {
        this.name = name;
        this.code = code;
        this.basicPay = basicPay;
    }

    public void printInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Code: " + code);
        System.out.println("Basic Pay: " + basicPay);
    }

    public interface Salary {
        double calculateSalary();
    }

    public static class SalarySlip implements Salary {
        private Employee employee;

        public SalarySlip(Employee employee) {
            this.employee = employee;
        }

        @Override
        public double calculateSalary() {

            return employee.basicPay;
        }

        public void printSalarySlip() {
            System.out.println("---- Salary Slip ----");
            employee.printInfo();
            System.out.println("Net Salary: " + calculateSalary());
            System.out.println("---------------------");
        }
    }

    public static Employee getEmployeeDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Employee Code: ");
        int code = sc.nextInt();

        System.out.print("Enter Basic Pay: ");
        double basicPay = sc.nextDouble();

        return new Employee(name, code, basicPay);
    }

    
}
