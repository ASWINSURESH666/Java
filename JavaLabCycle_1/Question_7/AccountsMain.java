package QUESTION_7;
import java.util.Scanner;

public class AccountsMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Account Holder Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Account Number: ");
        String accNumber = scanner.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = scanner.nextDouble();

        System.out.println("Choose Account Type:");
        System.out.println("1. Savings Account");
        System.out.println("2. Current Account");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        Account account;
        switch (choice) {
            case 1 -> account = new SavingsAccount(name, accNumber, balance);
            case 2 -> account = new CurrentAccount(name, accNumber, balance);
            default -> {
                System.out.println("Invalid choice. Exiting...");
                scanner.close();
                return;
            }
        }

        while (true) {
            System.out.println("\nAccount Details:");
            System.out.println("Name: " + account.accountHolderName);
            System.out.println("Account Number: " + account.accountNumber);
            System.out.println("Balance: " + account.balance);
            System.out.println("Menu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1 -> {
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                }
                case 2 -> {
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdrawal(withdrawAmount);
                }
                case 3 -> {
                    System.out.println("Exiting the program...");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
